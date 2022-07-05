package exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OutOfBoundsTest {

	@Test
	void testException() {
		assertThrows(IndexOutOfBoundsException.class, () -> {
			OutOfBounds.getOutOfBounds();
		});
	}

}
