
import java.util.*;
import java.rmi.*;
public class Client{

	public static void main(String[] args) throws Exception {
		//String host = "localhost";
		
		AddI obj = (AddI)Naming.lookup("rmi://localhost:5008/StudentService");
		Scanner sc =  new Scanner(System.in);
		System.out.println("input 1st number : " );
		double a  =  sc.nextDouble();
		System.out.println("input operator(+-*/) : ");
		String b  =  sc.next();
		char bb = b.charAt(0);

		System.out.println("input 2st number : ");
		double c  =  sc.nextDouble();

		Command co = new Command(a,bb,c);
		
		double n = obj.calculate(co);
		System.out.println("result is : " + n);


	}

}