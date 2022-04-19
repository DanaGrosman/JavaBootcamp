package exam2.runner;

import java.time.LocalDate;

import exam2.classes.toy.*;
import exam2.enumorate.groupage.GroupAge;
import exam2.classes.electrictoy.ElectricToy;
import exam2.classes.harddoll.HardDoll;
import exam2.classes.kid.Kid;
import exam2.classes.softdoll.SoftDoll;

public class Runner {

	public static void main(String[] args) {
		Kid kid1 = new Kid("Talya", LocalDate.of(2021, 3, 6));
		Kid kid2 = new Kid("Alma", LocalDate.of(2020, 3, 12));

		Toy[] toys = new Toy[4];

		toys[0] = new SoftDoll("TeddiBear", LocalDate.of(2022, 1, 8), GroupAge.B, kid2);
		toys[1] = new HardDoll("Barbi", LocalDate.of(2022, 4, 1), GroupAge.A, kid2);
		toys[2] = new ElectricToy("Car", LocalDate.of(2021, 10, 10), GroupAge.A, 2, 3, kid1);
		toys[3] = new ElectricToy("Train", LocalDate.of(2021, 12, 23), GroupAge.C, 3, 2, kid1);

		for (int i = 0; i < toys.length; i++) {
			toys[i].play();
		}
	}
}
