package InterfaceClass;

public interface USABank {

	int min_bal = 500;
	String empName = "Salim";

	public void debit();

	public void credit();

	public void transferMoney();

	public void capital();

}

// no method body, only method declaration
// can't create the object of interface
// interface is method prototype
// can declare the interface variable
// no static methods, but interface variable is static in nature by default.
// abstract 100%

// can't create an object for abstract class
// can have both abstract and regular method in abstract class
