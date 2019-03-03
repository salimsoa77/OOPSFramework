package Abstract;

public class Shape extends Shado{

	public static void main(String[] args) {
		
	Shado s = new Shape();
	s.drawing();
	s.filter();
	

	}

	@Override
	void drawing() {
	
		System.out.println("Shape Drawing");
		
	}

}
