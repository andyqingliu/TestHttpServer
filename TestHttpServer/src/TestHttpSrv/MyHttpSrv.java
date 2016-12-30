package TestHttpSrv;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import ProtoBufPackage.FriendProto.C2S_GetFriendList_message;
import ProtoBufPackage.PersonProto.Person;
import ProtoBufPackage.StudentProto.C2S_GetStudentInfo;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

/**
 * @author liuqing</br>
 * 2016年12月28日  上午10:36:51</br>
 */
public class MyHttpSrv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		final InetSocketAddress sa = new InetSocketAddress(8888);
		HttpServer server = null;
		try {
			server = HttpServer.create(sa, 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		server.createContext("/",new MyResponseHandler());
		server.setExecutor(null);
		server.start();
		System.out.println("Server is listening on port 8888");
	}
	
	public static class MyResponseHandler implements HttpHandler{
		
		public void handle(HttpExchange t) throws IOException{
			
			try {
				System.out.println("Try Handler request!");
				InputStream inputStream = t.getRequestBody();
//				BufferedReader inBufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//				System.out.println("inputStream is:"+inBufferedReader.readLine());
				String contentLength = t.getRequestHeaders().getFirst("Content-Length");
				int length = Integer.parseInt(contentLength);
				handleInput(inputStream, length);
				System.out.println("Response request!");
//				String response = "<font color='#ff0000'>come on baby hhhhhdjkjjdddd!</font>";
				byte[] responseBytes = getRespone();
				t.sendResponseHeaders(200, responseBytes.length);
				OutputStream os = t.getResponseBody();
				os.write(responseBytes);
				os.close();
				System.out.println("Response request finish!");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		private void handleInput(InputStream inStr, int len) throws Exception{
			try {
				byte[] bs = streamToByteArray(inStr, len);
				System.out.println("streamToByteArray Str:"+bs.length);
				System.out.println("streamToByteArray Str:"+new String(bs));
				C2S_GetStudentInfo studentInfo = C2S_GetStudentInfo.parseFrom(bs);
				System.out.println("studentInfo id:"+studentInfo.getId());
				System.out.println("studentInfo name:"+studentInfo.getName());
				System.out.println("studentInfo age:"+studentInfo.getAge());
				
				for (int i = 0; i < studentInfo.getPersonCount(); i++) {
					Person person = studentInfo.getPerson(i);
					System.out.println("studentInfo person "+i +"value:"+person.getValue());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		private byte[] getRespone() {
			Person.Builder person = Person.newBuilder();
			person.setValue(12345);
			C2S_GetFriendList_message.Builder build = C2S_GetFriendList_message.newBuilder();
			build.setResult(54321);
			build.setP(person);
			C2S_GetFriendList_message friendList_message = build.build();
			return friendList_message.toByteArray();
		}
		
		private byte[] streamToByteArray(InputStream ins, int bytesLength) throws Exception {
			
			byte[] buffer = new byte[bytesLength];
			
	        int offset = 0;
	        int bytesRead = 0;
//	        ins.read(buffer,0,bytesLength);
//	        return buffer;
	        while ((bytesRead = ins.read(buffer, offset, bytesLength - offset)) > 0)
	        {
	            offset += bytesRead;
	            if (offset == bytesLength)
	                break;
	        }
	        return offset == bytesLength ? buffer : null;
			
			
//			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//			byte[] buffer = new byte[len];
//			int n=0;
//			try {
//				while ((n=ins.read(buffer,0,len)) != -1) {
//					outputStream.write(buffer,0,n);
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return outputStream.toByteArray();
		}
	}

}
