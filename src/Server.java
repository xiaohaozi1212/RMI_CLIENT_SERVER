

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.net.*;
public class Server{

	public static void main(String[] args) throws Exception {
		AddC obj = new AddC();
		//Approach 1: using command line
		//Naming.rebind("A",obj);
		
		//Approach 2: registry RMI service in Java code
		LocateRegistry.createRegistry(5008);//定义端口号
		Naming.rebind("rmi://localhost:5008/StudentService", obj);
		
		System.out.println("Server started");
		
	}

}