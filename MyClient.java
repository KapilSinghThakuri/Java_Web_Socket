// import java.io.*;
// import java.net.*;

// public class MyClient{
// 	public static void main(String[] args) {
// 		try{
// 			Socket s = new Socket("localhost",6666);
// 			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
// 			dout.writeUTF("Hello Server! I am from Nepal.");
// 			dout.flush();
// 			dout.close();
// 			s.close();
// 		}
// 		catch (Exception e) {
// 			System.out.println(e);
// 		}
// 	}
// }

// import java.net.*;
// import java.io.*;

// public  class MyClient{
// 	public static void main(String[] args) {

// 		try{
// 			Socket s = new Socket("localhost",9999);
// 			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
// 			DataInputStream din = new DataInputStream(s.getInputStream());
// 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
// 			String str1 = "", str2 = "";
// 			while(!str1.equals("stop")){
// 				str1 = br.readLine();
// 				dout.writeUTF(str1);
// 				dout.flush();
	
// 				str2 = din.readUTF();
// 				System.out.println("Server :" + str2);
// 			}
// 			dout.close();
// 			s.close();
// 		   }
// 			catch(Exception e){
// 				System.out.println(e);
// 			}
// 	}
// }

import java.net.*;
import java.io.*;

public class MyClient{
	public static void main(String[] args) {
		try{
			Socket s = new Socket("localhost", 7777);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());

			DataInputStream din = new DataInputStream(s.getInputStream());
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

			String str1="", str2="";
			while(!str1.equals("stop")){
				str1 = br.readLine();
				dout.writeUTF(str1);
				dout.flush();

				str2 = din.readUTF();
				System.out.println(str2);
			}
				dout.close();
				s.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}