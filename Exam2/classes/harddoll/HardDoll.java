package exam2.classes.harddoll;

import java.time.LocalDate;

import exam2.classes.doll.Doll;
import exam2.classes.kid.Kid;
import exam2.enumorate.groupage.GroupAge;

public class HardDoll extends Doll {

	public HardDoll(String name, LocalDate purchaseDate, GroupAge groupAge, Kid kid) {
		super(name, purchaseDate, groupAge, kid);
	}

	@Override
	public void play() {
		System.out.println(this);

		if (!isBroken() && (getGroupAge() == kid.getGroupAge())) {
			System.out.println("HardDoll is played by " + this.getKid());
		}
		else
			System.out.println("HardDoll can not be played");
	}

	@Override
	public String toString() {
		return "HardDoll [dirtiness=" + dirtiness + ", name=" + name + ", purchaseDate=" + purchaseDate + ", groupAge="
				+ groupAge + ", kid=" + kid + "]";
	}

}
