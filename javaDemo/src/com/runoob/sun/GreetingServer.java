package com.runoob.sun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingServer  {

	private ServerSocket serverSocket;
	
//	public GreetingServer(int port) throws IOException{
//		
//	}
	
	public void run() {
//		while(true) {
			try {
				serverSocket = new ServerSocket(8888);
				serverSocket.setSoTimeout(10000);
				System.out.println("启动服务器...");
				System.out.println("等待远程连接，端口号为:" + serverSocket.getLocalPort());
				Socket server = serverSocket.accept();
				System.out.println("远程主机地址：" + server.getLocalAddress());
			
				BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
				String msg = br.readLine();
				System.out.println("客户端消息:" + msg);
				
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
				out.write("已经连接："+ server.getLocalAddress());
				out.flush();
				server.close();
			}catch(SocketTimeoutException s) {
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//	}
	
	public static void main(String[] args) {
//		int port = 8888;
//		try {
			GreetingServer t = new GreetingServer();
			t.run();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
	}
}





