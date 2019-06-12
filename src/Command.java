
import java.io.Serializable;
public class Command implements Serializable{
	double num1;
	char operator ;
	double num2;
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public Command(double num1, char operator, double num2) {
		super();
		this.num1 = num1;
		this.operator = operator;
		this.num2 = num2;
	}
	
}
