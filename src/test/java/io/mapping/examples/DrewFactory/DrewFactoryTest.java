package io.mapping.examples.DrewFactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DrewFactoryTest {
	private ParticularDeveloperFactory<Drew> mDrewParticularDeveloperFactory;

	@Before
	public void setUp() throws Exception {
		mDrewParticularDeveloperFactory = new DrewFactory();
	}

	@Test
	public void testGetDeveloper() throws Exception {
		Developer drew = mDrewParticularDeveloperFactory.getDeveloper();
		assertNotNull(drew);
	}
}
