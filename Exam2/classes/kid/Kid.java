package exam2.classes.kid;

import java.time.LocalDate;
import java.time.Period;

import exam2.enumorate.groupage.GroupAge;

public class Kid {
	protected String name;
	protected LocalDate birthDay;
	protected GroupAge groupAge;

	public Kid(String name, LocalDate birthDay) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		setGroupAge();
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	private void setGroupAge() {
		int age;
		age = Period.between(getBirthDay(), LocalDate.now()).getYears();

		if (age >= 0 && age <= 1)
			groupAge = GroupAge.A;
		else if (age >= 2 && age <= 4)
			groupAge = GroupAge.B;
		else
			groupAge = GroupAge.C;
	}
	
	public GroupAge getGroupAge() {
		return groupAge;
	}

	@Override
	public String toString() {
		return "Kid [name=" + name + ", birthDay=" + birthDay + ", groupAge=" + groupAge + "]";
	}
}
