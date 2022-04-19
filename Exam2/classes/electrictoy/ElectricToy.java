package exam2.classes.electrictoy;

import java.time.LocalDate;

import exam2.classes.kid.Kid;
import exam2.classes.toy.Toy;
import exam2.enumorate.groupage.GroupAge;

public class ElectricToy extends Toy {
	protected int numberOfBatteries;
	protected int soundLevel;

	public ElectricToy(String name, LocalDate purchaseDate, GroupAge groupAge, int numberOfBatteries, int soundLevel,
			Kid kid) {
		super(name, purchaseDate, groupAge, kid);
		this.numberOfBatteries = numberOfBatteries;
		setSoundLevel(soundLevel);
	}

	public int getSoundLevel() {
		return soundLevel;
	}

	public void setSoundLevel(int soundLevel) {
		if (soundLevel < 0 || soundLevel > 3)
			this.soundLevel = 3;
		else
			this.soundLevel = soundLevel;
	}

	@Override
	public void play() {
		System.out.println(this);

		if (!isBroken() && (getGroupAge() == kid.getGroupAge()) && getSoundLevel() > 0) {
			System.out.println("ElectricToy is played by " + this.getKid());
			setSoundLevel(getSoundLevel() - 1);
		} else
			System.out.println("ElectricToy can not be played");
	}

	@Override
	public String toString() {
		return "ElectricToy [name=" + name + ", purchaseDate=" + purchaseDate + ", groupAge=" + groupAge + ", kid="
				+ kid + "]";
	}

}
