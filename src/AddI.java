
import java.rmi.*;

public interface AddI extends Remote{

	public double calculate(Command x) throws Exception;
}