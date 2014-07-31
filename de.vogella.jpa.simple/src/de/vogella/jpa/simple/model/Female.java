package de.vogella.jpa.simple.model;

import javax.persistence.Entity;

@Entity
public class Female extends Person{
	private String f;

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}
}
