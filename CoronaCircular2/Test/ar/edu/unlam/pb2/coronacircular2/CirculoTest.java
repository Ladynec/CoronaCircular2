package ar.edu.unlam.pb2.coronacircular2;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {

	private static final Integer RADIO = 1;


	@Test
	public void alCrearUnCirculoSeInicializaConSuRadio(){
		Circulo circulo = cuandoCreoUnCirculo(1);
		elCirculoTieneRadio(circulo);
		}
	

	private Circulo cuandoCreoUnCirculo(int radio) {
		
		return new Circulo(radio);
	}


	private void elCirculoTieneRadio(Circulo circulo) {
		Assert.assertEquals(RADIO, circulo.getRadio());
	}
	
	
	
}
