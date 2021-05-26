package net.oak.softsys.model.domain;


public class Person {

    private String firstName;
    private String lastName;
    private String nameOfState;
    private int creditScore;

    public Person(String firstName, String lastName, String nameOfState, int creditScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nameOfState = nameOfState;
        this.creditScore = creditScore;
    }
   
    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNameOfState() {
		return nameOfState;
	}

	public void setNameOfState(String nameOfState) {
		this.nameOfState = nameOfState;
	}

	public int getCreditScore() {
        return creditScore;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", state='" + nameOfState + '\'' +
                ", creditScore=" + creditScore +
                '}';
    }

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + creditScore;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((nameOfState == null) ? 0 : nameOfState.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (creditScore != other.creditScore)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (nameOfState == null) {
			if (other.nameOfState != null)
				return false;
		} else if (!nameOfState.equals(other.nameOfState))
			return false;
		return true;
	} 
}


    