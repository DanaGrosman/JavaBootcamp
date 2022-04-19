package exam2.classes.electrictoy;

import java.time.LocalDate;

import exam2.classes.kid.Kid;
import exam2.classes.toy.Toy;
import exam2.enumorate.groupage.GroupAge;

public class ElectricToy extends Toy{
	public ElectricToy(String name, LocalDate purchaseDate, GroupAge groupAge, Kid kid) {
		super(name, purchaseDate, groupAge, kid);
	}

	@Override
	public void play() {
		System.out.println(this);

		if(!isBroken() && (getGroupAge() == kid.getGroupAge())){
			System.out.println("ElectricToy is played by " + this.getKid());
		}		
		else
			System.out.println("ElectricToy can not be played");
	}

	@Override
	public String toString() {
		return "ElectricToy [name=" + name + ", purchaseDate=" + purchaseDate + ", groupAge=" + groupAge + ", kid="
				+ kid + "]";
	}

}
