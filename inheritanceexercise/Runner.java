package javabootcamp.oop.inheritanceexercise;

public class Runner {

	public static void main(String[] args) {
//		HomeAppliance homeApp1 = new HomeAppliance("TUSHIBA", 2001);
//		HomeAppliance homeApp2 = new HomeAppliance("Tushiba", 222);
		Television tv1 = new Television("TUSHIBA", 2001, 6.7f);
		tv1.setModel("G45");

		Television tv2 = new Television("Panasonic", 111, 1f);
		tv2.setModel("3333");

		tv1.display();
		tv2.display();

		int res = tv1.isBigger(tv2);
		String resText = "The Same as";
		if (res == 1)
			resText = "Bigger than";
		else if (res == -1)
			resText = "Smaller than";

		resText = "TV1 is " + resText + " Tv2";
		System.out.println(resText);

	}

}
