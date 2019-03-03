package listInterface;

import java.util.ArrayList;

public class ListInterfaceDemo {

	public static void main(String[] args) {

		// ArrayList<String> Declaration

		ArrayList<String> al = new ArrayList<String>();

		// add method for String ArrayList

		al.add("Salim");
		al.add("Faisal");
		al.add("Baijid");
		al.add("Shueb");
		al.add("Shihab");
		al.add("Suhel");
		al.add(4, "Shamim");
		// al.clear();//clear all the list
		boolean b = al.contains("Faisak");
		System.out.println(b);
		al.remove(3);

		for (String str : al) {
			System.out.println("Elements of ArrayList of String Type: " + str);
		}

	}

}
