package io.mapping.examples.DrewFactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DrewTest {
	private Drew mDrew;

	@Before
	public void setUp() throws Exception {
		mDrew = new Drew();
	}

	@Test
	public void testSetHired() throws Exception {
		mDrew.setHired(Boolean.TRUE);
		assertTrue(mDrew.getHired());

		mDrew.setHired(Boolean.FALSE);
		assertFalse(mDrew.getHired());
	}

}
