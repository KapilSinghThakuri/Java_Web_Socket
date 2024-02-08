// import java.net.*;
// import java.io.*;

// public class MyServer{
// 	public static void main(String[] args) {
// 		try{
// 			ServerSocket ss = new ServerSocket(6666);
// 			Socket s = ss.accept();
// 			DataInputStream dis = new DataInputStream(s.getInputStream());
// 			String str = (String)dis.readUTF();
// 			System.out.println("Client Message :" + str);
// 			ss.close();
// 		}
// 		catch(Exception e){
// 			System.out.println(e);
// 		}
// 	}
// }

// import java.net.*;
// import java.io.*;

// public class MyServer{
// 	public static void main(String[] args) {
	
// 	try{
// 			ServerSocket ss = new ServerSocket(9999);
// 			Socket s = ss.accept();
// 			DataInputStream din = new DataInputStream(s.getInputStream());
// 			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
// 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 			String str1 = "", str2 = "";
// 			while(!str1.equals("stop")){
// 				str1 = din.readUTF();
// 				System.out.println("Client: " + str1);

// 				str2 = br.readLine();
// 				dout.writeUTF(str2);
// 				dout.flush();
// 			}
// 			din.close();
// 			ss.close();
// 			s.close();
// 		}
// 		catch(Exception e){
// 				System.out.println(e);
// 		}
// 	}
// }

import java.net.*;
import java.io.*;

public class MyServer{
	public static void main(String[] args) {
		try{
			ServerSocket ss = new ServerSocket(7777);
			Socket s = ss.accept();
			DataInputStream din = new DataInputStream(s.getInputStream());

			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str1="",str2="";
			while(!str1.equals("stop")){
				str1 = din.readUTF();
				System.out.println(str1);

				str2 = br.readLine();
				dout.writeUTF(str2);
				dout.flush();
			}
			s.close();
			ss.close();
			din.close();
			// String str = (String)din.readUTF();
			// System.out.println("Client:" + str );
			// s.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}




