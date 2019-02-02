package lambda;

import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    int age;

    public int getAge() {
        return age;
    }

    public String getprintPerson() {
        return ("Name ="+name + " , Age ="+age +" Sex ="+gender);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setAge(int age) {
		this.age = age;
	}
}