package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	private LinkedList<Voto> voti;

	public Libretto() {
		super();
		this.voti = new LinkedList<>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}

	@Override
	public String toString() {
		return "Libretto [voti=" + voti + "]"+voti.toString();
	}

}
