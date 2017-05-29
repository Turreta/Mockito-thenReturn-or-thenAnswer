package com.turreta.mockito.example;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

@RunWith(MockitoJUnitRunner.class)
public class SomeManagerTest2 {
	
	@Mock
	private SomeService1 service1;
	
	@InjectMocks
	private SomeManager manager;

	
	@Test
	public void testRandomNew() {
		
		Answer<String> ans = new Answer<String>() {
			@Override
			public String answer(InvocationOnMock invocation) throws Throwable {
				return UUID.randomUUID().toString();
			}			
		};
		
		Mockito.when(service1.getSomethingRandom()).thenAnswer(ans);
		
		manager.processSomethingRandom();
		
		System.out.println("An separate call to UUID.randomUUID().toString() yields: " + UUID.randomUUID().toString());

	}

}
