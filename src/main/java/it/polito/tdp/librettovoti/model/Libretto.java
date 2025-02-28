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
		String s="";
		for(Voto v:voti)
			s=s+v.toString()+"\n";
		return s;
	}
	
	public List<Voto> listaVotiUguali(int punteggio) {
		List<Voto> risultato=new ArrayList<>();
		for(Voto v:voti)
			if(v.getVoto()==punteggio)
				risultato.add(v);
		return risultato;
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato=new Libretto();
		for(Voto v:this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	

}
