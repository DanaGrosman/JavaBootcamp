package javabootcamp.oop.vendingmechineexercise.runner;

import java.util.Scanner;

import javabootcamp.oop.vendingmechineexercise.classes.Apple;
import javabootcamp.oop.vendingmechineexercise.classes.Cappuccino;
import javabootcamp.oop.vendingmechineexercise.classes.Chocolate;
import javabootcamp.oop.vendingmechineexercise.classes.Cola;
import javabootcamp.oop.vendingmechineexercise.classes.Espresso;
import javabootcamp.oop.vendingmechineexercise.classes.Latte;
import javabootcamp.oop.vendingmechineexercise.classes.Orange;
import javabootcamp.oop.vendingmechineexercise.classes.Sprite;
import javabootcamp.oop.vendingmechineexercise.interfaces.Produceable;

public class Runner {
	public class VendingMachine {
		public static int milkQtt;
		public static int waterQtt;

		static {
			milkQtt = 1000;
			waterQtt = 2000;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (milkQtt > 0 && waterQtt > 0) {
				showMenu();
				int opt = Integer.parseInt(sc.next());
				if (opt == 0)
					break;
				Produceable drink = createDrink(opt);
				drink.produce();
			}

			sc.close();
		}

		private static Produceable createDrink(int opt) {
			switch (opt) {
			case 0:
				System.out.println("Bye bye!");
				return null;
			case 1:
				return new Chocolate();
			case 2:
				return new Espresso();
			case 3:
				return new Cappuccino();
			case 4:
				return new Latte();
			case 5:
				return new Cola(90, 77, 15, false);
			case 6:
				return new Sprite(120, 77, 15, true);
			case 7:
				return new Orange(100, 77, 15, true);
			case 8:
				return new Apple(180, 77, 15, false);
			}
			return null;
		}

		public static void showMenu() {
			System.out.println("Please select a drink or enter 0 to exit:");
			System.out.println("1. Hot Chocolate\n" + "2. Hot Espresso\n" + "3. Hot Cappuccino\n" + "4. Hot Latte\n"
					+ "5. Cola\n" + "6. Sprite\n" + "7. Orange Juice\n" + "8. Apple Juice");
		}

	}
}
