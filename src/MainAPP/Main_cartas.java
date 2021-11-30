package MainAPP;

import MODELS.CARTA;

public class Main_cartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CARTA carta1 = new CARTA(0, 0, 0);
		
		carta1.getID();
		carta1.getNumero();
		carta1.getPalo();
		
		System.out.println(carta1);
	
	}

}
