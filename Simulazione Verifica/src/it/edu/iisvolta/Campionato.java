package it.edu.iisvolta;

import java.util.ArrayList;

public class Campionato {
	private String nome;
	private ArrayList <Squadra> elencoSquadre;
	private ArrayList <Partita> elencoPartite;
	
	
	public Campionato(String nome) {
		super();
		this.nome = nome;
		this.elencoPartite = new ArrayList<Partita>();
		this.elencoSquadre = new ArrayList<Squadra>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Squadra> getElencoSquadre() {
		return elencoSquadre;
	}

	public ArrayList<Partita> getElencoPartite() {
		return elencoPartite;
	}


	public void generaCalendario() {
		for(Squadra s1: elencoSquadre)  //scorriamo per selezionare una squadra
			for(Squadra s2: elencoSquadre) // scorriamo per selezionare una squadra
				if(s1!=s2) 
					elencoPartite.add(new Partita (s1,s2)); //creaiamo una nuova partita escludendo la stessa squadra
	}
	
}
