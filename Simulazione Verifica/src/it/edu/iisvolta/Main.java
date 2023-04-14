package it.edu.iisvolta;

public class Main {

	public static void main(String[] args) {
		Campionato c= new Campionato("Serie A");
		
		c.getElencoSquadre().add(new Squadra("Lecce"));
		c.getElencoSquadre().add(new Squadra("Napoli"));
		c.getElencoSquadre().add(new Squadra("Roma"));
		c.getElencoSquadre().add(new Squadra("Lazio"));
		c.getElencoSquadre().add(new Squadra("Fanfulla Lodi"));
		
		c.generaCalendario();
		
		for(Partita p: c.getElencoPartite()) {
			p.simulaPartita();
			System.out.println(p.getSquadraCasa().getNome()+" - "+
							   p.getSquadraFuoriCasa().getNome()+ " : "+ 
							   p.getGolCasa()+" - "+ 
							   p.getGolFuoriCasa());
		}
		
		System.out.println("\n\nCLASSIFICA: ");
		for(Squadra s:c.getElencoSquadre()) {
			System.out.println(s.getNome()+": "+s.getPunti());
		}
	}
	 
}
