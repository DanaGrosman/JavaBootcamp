package exam2.classes.softdoll;

import java.time.LocalDate;

import exam2.classes.doll.Doll;
import exam2.classes.kid.Kid;
import exam2.enumorate.groupage.GroupAge;

public class SoftDoll extends Doll {

	public SoftDoll(String name, LocalDate purchaseDate, GroupAge groupAge, Kid kid) {
		super(name, purchaseDate, groupAge, kid);
	}

	@Override
	public void play() {
		System.out.println(this);
		if (!isBroken() && (getGroupAge() == kid.getGroupAge()))
			System.out.println("SoftDoll is played by " + this.getKid());
		else
			System.out.println("SoftDoll can not be played");
	}

	@Override
	public String toString() {
		return "SoftDoll [dirtiness=" + dirtiness + ", name=" + name + ", purchaseDate=" + purchaseDate + ", groupAge="
				+ groupAge + ", kid=" + kid + "]";
	}
}
