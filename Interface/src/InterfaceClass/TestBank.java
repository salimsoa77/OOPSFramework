package InterfaceClass;

public class TestBank {

	public static void main(String[] args) {

		IMFBank obj = new IMFBank();

		obj.homeLoan();
		obj.educationLoan();
		obj.carLoan();

		obj.debit();
		obj.credit();
		obj.transferMoney();

		obj.mutualFund();
		obj.insurance();

		System.out.println("From USABank Interface:" + USABank.min_bal);
		System.out.println("From USABank Interface:" + USABank.empName);
		System.out.println("From BCB Interface:" + BCB.empssn);

		USABank us = new IMFBank();
		System.out.println(us.empName);

		BCB bc = new IMFBank();
		//change made in test bank

	}

}
