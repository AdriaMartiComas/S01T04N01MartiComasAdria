package exercici1;

import java.util.ArrayList;

public class Any {
	
	private ArrayList<String> mesosAny;

	public Any() {
		this.mesosAny = new ArrayList<String>();
		mesosAny.add("Gener");
		mesosAny.add("Febrer");
		mesosAny.add("Març");
		mesosAny.add("Abril");
		mesosAny.add("Maig");
		mesosAny.add("Juny");
		mesosAny.add("Juliol");
		mesosAny.add("Agost");
		mesosAny.add("Setembre");
		mesosAny.add("Octubre");
		mesosAny.add("Novembre");
		mesosAny.add("Desembre");
	}

	public ArrayList<String> getMesosAny() {
		return mesosAny;
	}

	@Override
	public String toString() {
		return "Any [mesosAny=" + mesosAny + "]";
	}

}
