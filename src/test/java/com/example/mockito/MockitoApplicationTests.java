package com.example.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.*;

@SpringBootTest
class MockitoApplicationTests {

	@MockBean
	Voiture voiture;

	@Test
	void avecMockBean() throws Exception {
		// 0 argument, returns void
		doNothing().when(voiture).rouler();
		// 0 argument, throws exception
		doThrow(Exception.class).when(voiture).voler();
		// 1 argument, return void
		doNothing().when(voiture).ajouterEssence(1);
		// 0 argument, returns a value
		when(voiture.getQuantiteEssence()).thenReturn(1);
		// 1 argument, throws exception
		doThrow(Exception.class).when(voiture).ajouterEssence(-1);
	}

	@Test
	public void avecMockito() throws Exception {
		Voiture uneVoiture = Mockito.mock(Voiture.class);
		// 0 argument, returns void
		doNothing().when(uneVoiture).rouler();
		// 0 argument, throws exception
		doThrow(Exception.class).when(uneVoiture).voler();
		// 1 argument, return void
		doNothing().when(uneVoiture).ajouterEssence(1);
		// 0 argument, returns a value
		when(uneVoiture.getQuantiteEssence()).thenReturn(1);
		// 1 argument, throws exception
		doThrow(Exception.class).when(uneVoiture).ajouterEssence(-1);
	}

}
