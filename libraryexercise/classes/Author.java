package javabootcamp.oop.libraryexercise.classes;

public class Author {
	protected String name;
	protected char gender;

	public Author() {
		this.gender = 'M';
	}

	public Author(String name, char gender) {
		setName(name);
		setGender(gender);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	private void setGender(char gender) {
		if (gender == 'M' || gender == 'm' || gender == 'F' | gender == 'f')
			this.gender = gender;
		else
			this.gender = 'M';
	}
	
	@Override
	public String toString() {
		return String.format("Author name: %s, Gender: %c\n", name, gender);
	}
}
