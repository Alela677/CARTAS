package MODELS;

import java.util.ArrayList;

public class CARTA {

// ATRIBUTOS

	private int numero;
	private int palo;
	private int ID;

// COSNTRUCTORES

	public CARTA(int numero, int palo, int iD) {
		super();
		this.numero = numero;
		this.palo = palo;
		this.ID = iD;
	}

// METODOS

	public void getID() {
		int[] ID = new int[40];

		for (int i = 1; i < ID.length; i++) {
			ID[i] = (int) (Math.random() * 40);
			this.ID = ID[i];
		}
	}

	public void getNumero() {
		int[] Numero = new int[10];
		for (int i = 1; i < Numero.length; i++) {
			Numero[i] = (int) (Math.random() * 11);
			this.numero = Numero[i];
		}

	}

	public void getPalo() {
		int [] Palo = new int [4];
		
		for (int i = 0; i < Palo.length; i++) {
			Palo[i]= (int)(Math.random()*4);
			this.palo = Palo[i];
		}
	}

	public void getNombreNumero() {
		
		
	}

	public void getNombrePalo() {

	}

	public void getNombreCarta() {

	}

	public void getValor7ymedia() {

	}

	// ToString

	@Override
	public String toString() {
		return "CARTA [ID=" + ID + " numero=" + numero + ", palo=" + palo + " ]";
	}

}
