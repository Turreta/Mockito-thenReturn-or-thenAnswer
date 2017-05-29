package com.turreta.mockito.example;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeManagerTest {
	
	@Mock
	private SomeService1 service1;
	
	@InjectMocks
	private SomeManager manager;

	@Test
	public void testNonRandom() {
		Mockito.when(service1.getSomethingRandom()).thenReturn("" + 1);
		
		manager.processSomethingRandom();
	}
	
	@Test
	public void testRandom() {
		Mockito.when(service1.getSomethingRandom()).thenReturn(UUID.randomUUID().toString());
		
		manager.processSomethingRandom();
		
		System.out.println("An separate call to UUID.randomUUID().toString() yields: " + UUID.randomUUID().toString());

	}

}
