
import java.rmi.*;
import java.rmi.server.*;

public class AddC extends UnicastRemoteObject implements AddI {

	public AddC() throws Exception {
		super();
	}

	public double calculate(Command x) {
		double d;
		String op = String.valueOf(x.getOperator());
		if (op .equals("+")) {
			d = x.num1 + x.num2;
		}
		// if add
		else if (op .equals("*")){
			d = x.num1 * x.num2;
		}
		// if minus
		else if (op .equals("-")) {
			d = x.num1 - x.num2;
		} // if divide
		else if (op .equals("/")) {
				d = x.num1 / x.num2;

		} 
		else {
			d = 0;
		}

		return d;
	}

	public Remote calculate() {
		// TODO Auto-generated method stub
		return null;
	}

}