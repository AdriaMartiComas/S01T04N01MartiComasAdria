package exercici2;

import java.util.ArrayList;

public class CalculoDni {
	
	
	
	
	public static void main(String[] args) {

		
		int dniNum = 47943391;
//		String dniLletra = "Y";
		
		calcularLletra(dniNum);
		
		
		
		
		
	}
	public static void calcularLletra(int dniNum) {
		int pos = dniNum % 23;
		ArrayList<String> lletresDni = lletresDni();
		
		String lletra = lletresDni.get(pos);
		System.out.println(dniNum+lletra);
		
	}
	
	public static ArrayList<String> lletresDni(){
		ArrayList<String> lletres = new ArrayList<String>();
		
		lletres.add("T");
		lletres.add("R");
		lletres.add("W");
		lletres.add("A");
		lletres.add("G");
		lletres.add("M");
		lletres.add("Y");
		lletres.add("F");
		lletres.add("P");
		lletres.add("D");
		lletres.add("X");
		lletres.add("B");
		lletres.add("N");
		lletres.add("J");
		lletres.add("Z");
		lletres.add("S");
		lletres.add("Q");
		lletres.add("V");
		lletres.add("H");
		lletres.add("L");
		lletres.add("C");
		lletres.add("K");
		lletres.add("E");
		
		return lletres;
		
	}

}
/*
 * Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre
 * el número com a paràmetre. Crea una classe jUnit que verifiqui el seu
 * correcte funcionament, parametritzant-la perquè el test rebi un espectre de
 * dades ampli i validi si el càlcul és correcte per a 10 números de DNI
 * predefinits.
 */