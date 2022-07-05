package exercici2;

import java.util.ArrayList;

public class CalculoDni {
	
	

	public static String calcularLletra(int dniNum) {
		int pos = dniNum % 23;
		ArrayList<String> lletresDni = lletresDni();

		return lletresDni.get(pos);
	}

	public static ArrayList<String> lletresDni() {
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
