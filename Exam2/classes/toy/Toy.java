package exam2.classes.toy;

import java.time.LocalDate;
import java.time.Period;

import exam2.classes.kid.Kid;
import exam2.enumorate.groupage.GroupAge;
import exam2.interfaces.broken.Broken;

public abstract class Toy implements Broken {
	protected static final int serialNumber = 0;
	protected String name;
	protected LocalDate purchaseDate;
	protected GroupAge groupAge;
	protected Kid kid;
	
	public Toy(String name, LocalDate purchaseDate, GroupAge groupAge, Kid kid) {
		super();
		this.name = name;
		this.purchaseDate = purchaseDate;
		this.groupAge = groupAge;
		this.kid = kid;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	
	public GroupAge getGroupAge() {
		return groupAge;
	}
	
	public Kid getKid() {
		return kid;
	}

	@Override
	public boolean isBroken() {
		int toyAge;
		toyAge = Period.between(getPurchaseDate(), LocalDate.now()).getYears();
		if (toyAge >= 1)
			return true;
		else
			return false;
	}
	
	public abstract void play();
}
