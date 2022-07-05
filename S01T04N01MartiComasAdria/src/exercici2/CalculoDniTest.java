package exercici2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculoDniTest {

	@ParameterizedTest
	@CsvSource({
			"12345600, M",
			"12345601, Y",
			"12345602, F",
			"12345603, P",
			"12345604, D",
			"12345605, X",
			"12345606, B",
			"12345607, N",
			"12345608, J",
			"12345609, Z",
			
	})
	
	void testCalculLletraDni(int dniNum, String resultatEsperat) {
		assertEquals(resultatEsperat, CalculoDni.calcularLletra(dniNum));
	}

}
