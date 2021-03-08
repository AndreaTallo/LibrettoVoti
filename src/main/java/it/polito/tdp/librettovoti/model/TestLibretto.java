package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {
	public static void main(String[] args) {
	Libretto libretto=new Libretto();
	
	Voto voto1= new Voto("Analisi 1", 25, LocalDate.of(2019, 2, 15));
	libretto.add(voto1);
	
	
	Voto voto2= new Voto("Fisica 1", 20, LocalDate.of(2019, 7, 6));
	libretto.add(voto2);
	Voto voto3= new Voto("Informatica", 28, LocalDate.of(2019, 1, 31));
	libretto.add(voto3);
	
	 System.out.println(""+libretto.toString());
	}
}
