package it.edu.iisvolta;

import java.util.Random;

public class Partita {
		private Squadra squadraCasa;
		private Squadra squadraFuoriCasa;
		private int golCasa;
		private int golFuoriCasa;
		
		public Partita(Squadra squadraCasa, Squadra squadraFuoriCasa) {
			super();
			this.squadraCasa = squadraCasa;
			this.squadraFuoriCasa = squadraFuoriCasa;
			this.golCasa=0;
			this.golFuoriCasa=0;
		}
		
		public Squadra getSquadraCasa() {
			return squadraCasa;
		}

		public Squadra getSquadraFuoriCasa() {
			return squadraFuoriCasa;
		}

		public int getGolCasa() {
			return golCasa;
		}
		public void setGolCasa(int golCasa) {
			if(golCasa<0)
				System.out.println("Gol non validi!");
			else
				this.golCasa = golCasa;
		}
		public int getGolFuoriCasa() {
			return golFuoriCasa;
		}
		public void setGolFuoriCasa(int golFuoriCasa) {
			if(golFuoriCasa < 0)
				System.out.println("Gol non validi!");
			else
				this.golFuoriCasa = golFuoriCasa;
		}
		public void simulaPartita() {
			Random r= new Random();
			this.golCasa = r.nextInt(6);
			this.golFuoriCasa=r.nextInt(6);
			if (golCasa > golFuoriCasa) {				//vince la squadra di casa
				squadraCasa.setPunti(squadraCasa.getPunti()+3);
			}else if (golCasa < golFuoriCasa) {			//vince la squadra fuori casa
				squadraFuoriCasa.setPunti(squadraFuoriCasa.getPunti()+3);
			}else 										//la partita si è conclusa in pareggio
				squadraCasa.setPunti(squadraCasa.getPunti()+1);
				squadraFuoriCasa.setPunti(squadraFuoriCasa.getPunti()+1);			
		}
}
