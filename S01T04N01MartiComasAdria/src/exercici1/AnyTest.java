package exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnyTest {

	@Test
	void testPosicions() {
		Any any = new Any();
		int mesos = any.getMesosAny().size();
		assertEquals(12, mesos);

	}

	@Test
	void testNoNull() {
		Any any = new Any();
		assertNotNull(any.getMesosAny());

	}

	@Test
	void testPosicio8() {
		Any any = new Any();
		String mesArray = any.getMesosAny().get(7);
		assertTrue("Agost".equals(mesArray));

	}

}
