package de.vogella.jpa.simple.model;

import javax.persistence.Entity;

@Entity
public class Male extends Person{
	private String m;

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}
}
