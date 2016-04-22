package jlichti.heidehofCRM.types;

import java.util.Date;

public class Person {
	public final int id;
	public String nachname;
	public String vorname;
	public Date geburtsdatum;
	public Adresse adresse;
	public String mobil;
	public String festnetz;
	public String geschäftlich;
	public String email;
	public String bemerkung;
	
	public Person (int id) {
		this.id = id;
	}
	public Person () {
		this(0);
	}
}
