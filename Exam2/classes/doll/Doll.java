package exam2.classes.doll;

import java.time.LocalDate;

import exam2.classes.kid.Kid;
import exam2.classes.toy.Toy;
import exam2.enumorate.groupage.GroupAge;

public abstract class Doll extends Toy {

	protected int dirtiness;

	public Doll(String name, LocalDate purchaseDate, GroupAge groupAge, Kid kid) {
		super(name, purchaseDate, groupAge, kid);

		if(groupAge != GroupAge.A && groupAge != GroupAge.B)
			this.groupAge = GroupAge.A;
		
		dirtiness = 1;
	}
	
	public int getDirtiness() {
		return dirtiness;
	}
	
	public void setDirtiness(int dirtiness) {
		this.dirtiness = dirtiness;
	}
}
