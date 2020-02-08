package com.cust;

public class Person {
	private int person_id;
	private String person_name;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + person_id;
		result = prime * result + ((person_name == null) ? 0 : person_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (person_id != other.person_id)
			return false;
		if (person_name == null) {
			if (other.person_name != null)
				return false;
		} else if (!person_name.equals(other.person_name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", person_name=" + person_name + "]";
	}
	
	
	
	
	

}
