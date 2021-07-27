package com.natwest.demofruit.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fruit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	private String type;
	private String colour;

	public Fruit() {
		super();
	}

	public Fruit(String type, String colour) {
		super();
		this.type = type;
		this.colour = colour;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, colour, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Id == other.Id && Objects.equals(colour, other.colour) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Fruit [Id=" + Id + ", type=" + type + ", colour=" + colour + "]";
	}

}