package InterfaceClass;

public class IMFBank implements USABank, BCB {

	@Override
	public void homeLoan() {

		System.out.println("IMF Homeloan");

	}

	@Override
	public void educationLoan() {

		System.out.println("IMF educationaloan");

	}

	@Override
	public void carLoan() {

		System.out.println("IMF carLoan");

	}

	@Override
	public void debit() {

		System.out.println("IMF Debit");

	}

	@Override
	public void credit() {

		System.out.println("IMF credit");

	}

	@Override
	public void transferMoney() {

		System.out.println("IMF transferMoney");
	}

	@Override
	public void capital() {

		System.out.println("IMF capital");
	}

	// IMFbank class method

	public void mutualFund() {

		System.out.println("IMF mutuaFund");
	}

	public void insurance() {

		System.out.println("IMF insurance");

	}

}
