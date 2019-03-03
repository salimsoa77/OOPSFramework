package InterfaceClass;

interface interface18 {

	default void show1() {
		System.out.println("Bangladesh");

	}

	static void show() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		interface18.show();

	}

}

//In Java 1.8 (JDK 8) you can make static and default method (declare a method body)  in interface