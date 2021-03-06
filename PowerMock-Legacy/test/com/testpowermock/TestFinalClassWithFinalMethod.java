package com.testpowermock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.interfaces.IPrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class TestFinalClassWithFinalMethod implements IPrepareForTest {

	@Override
	public Class<?>[] classesToPrepare() {
		return new Class<?>[] { FinalClassWithFinalMethod.class };
	}

	@Override
	public String[] fullyQualifiedNamesToPrepare() {
		return null;
	}

	@Test
	public void testGetString() {
		FinalClassWithFinalMethod finalClassWithFinalMethod = PowerMockito.mock(FinalClassWithFinalMethod.class);
		PowerMockito.when(finalClassWithFinalMethod.getString()).thenReturn("NEW STRING");

		assertEquals("NEW STRING", finalClassWithFinalMethod.getString());

	}

}
