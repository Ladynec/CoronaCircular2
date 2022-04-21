package ar.edu.unlam.pb2.coronacircular2;

import org.junit.Assert;
import org.junit.Test;

public class CoronaCircularTest {

	private static final Double AREA_ESPERADA = 9.42;
	private static final Double PERIMETRO_ESPERADO = 18.84;
	private static final Integer RADIO_EXTERIOR = 2;
	private static final Integer RADIO_INTERIOR = 1;
	private Circulo circuloMenor;
	private Circulo circuloMayor;
	
	@Test
	public void alCrearUnaCoronaCircularSeInicializaConSusCirculosMenorYMayor() {
		
		CoronaCircular corona = cuandoCreoUnaCoronaCircular(circuloMenor, circuloMayor);
		laCoronaCircularTieneCirculoMenorYMayor(corona);
	}

	@Test
	public void alCrearUnaCoronaCircularConCirculosMenorYMayorConSusRadioInteriorYRadioExterior() {
		CoronaCircular corona = cuandoCreoUnaCoronaCircular(circuloMenor, circuloMayor);
		laCoronaCircularTieneCirculoMenorYMayor(corona);
		laCoronaCircularTieneCirculosConRadioInteriorYExterior(corona, circuloMenor, circuloMayor);
	}

    @Test
    public void  alCrearUnaCoronaCircularConCirculosMenorYMayorConSusRadioInteriorYRadioExteriorSuPerimetroEs18_84(){
        CoronaCircular corona = dadoQueExisteCoronaCircularConCirculos(circuloMenor, circuloMayor);
		
		Double perimetroObtenido = cuandoCalculoElPerimetroDeLaCorona(corona);
		
		entoncesSuPerimetroEs(perimetroObtenido, PERIMETRO_ESPERADO);
    }

    @Test
    public void  alCrearUnaCoronaCircularConCirculosMenorYMayorConSusRadioInteriorYRadioExteriorSuAreaEs28con27(){
        CoronaCircular corona = dadoQueExisteCoronaCircularConCirculos(circuloMenor, circuloMayor);
		
		Double areaObtenida = cuandoCalculoElAreaDeLaCorona(corona);
		
		entoncesSuAreaEs(areaObtenida, AREA_ESPERADA);
    }


 // De aca pa' riva eslo que modifique



	@Test
	public void alCrearUnaCoronaCircularSeInicializaConSuRadioInteriorYExterior() {
		CoronaCircular corona = cuandoCreoUnaCoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);
		laCoronaCircularTieneRadioInteriorYExterior(corona);

	}

	
	@Test
	public void alCrearUnaCoronaCircularConRadioInterior_1_YExterior_2_SuPerimetroEs_18_84(){
		
		CoronaCircular corona = dadoQueExisteCoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);
		
		Double perimetroObtenido = cuandoObtengoElPerimetroDeLaCorona(corona);
		
		entoncesSuPerimetroEs(perimetroObtenido, PERIMETRO_ESPERADO);
		
	}
	
	@Test
	public void alCrearUnaCoronaCircularConRadioInterior_1_YExterior_2_SuAreaEs_28CON27(){
		
		CoronaCircular corona = dadoQueExisteCoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);
		
		Double areaObtenida = cuandoObtengoElAreaDeLaCorona(corona);
		
		entoncesSuAreaEs(areaObtenida, AREA_ESPERADA);
		
	}
	
	private void entoncesSuAreaEs(Double areaObtenida, Double areaEsperada) {
		Assert.assertEquals(areaObtenida, areaEsperada, 0.01);
		
	}

	private Double cuandoObtengoElAreaDeLaCorona(CoronaCircular corona) {
		return corona.getArea();
	}


	private CoronaCircular dadoQueExisteCoronaCircular(Integer radioInterior, Integer radioExterior) {
		return new CoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);
	}


	private Double cuandoObtengoElPerimetroDeLaCorona(CoronaCircular corona) {
		return corona.getPerimetro();
	}


	private void entoncesSuPerimetroEs(Double perimetroObtenido, Double perimetro) {
		Assert.assertEquals(perimetroObtenido, perimetro, 0.01);
	}


	private void laCoronaCircularTieneRadioInteriorYExterior(CoronaCircular corona) {
		Assert.assertEquals(RADIO_INTERIOR, corona.getRadioInterior());
		Assert.assertEquals(RADIO_EXTERIOR, corona.getRadioExterior());
	}

	private CoronaCircular cuandoCreoUnaCoronaCircular(Integer interior, Integer exterior) {
		return new CoronaCircular(interior, exterior);
	}

	 // De aca pa' bajo estan los metodos de lo que modifique	
	

	private CoronaCircular cuandoCreoUnaCoronaCircular(Circulo circuloMenor, Circulo circuloMayor) {
		
		return new CoronaCircular(circuloMenor, circuloMayor);
	}
	
	private void laCoronaCircularTieneCirculoMenorYMayor(CoronaCircular corona) {
		Assert.assertEquals(circuloMenor, corona.getCirculoMenor());
		Assert.assertEquals(circuloMayor, corona.getCirculoMayor());
		
	}
	
	private void laCoronaCircularTieneCirculosConRadioInteriorYExterior(CoronaCircular corona, Circulo circuloMenor2,
			Circulo circuloMayor2) {
		Assert.assertEquals(RADIO_INTERIOR, circuloMenor2.getRadio());
		Assert.assertEquals(RADIO_EXTERIOR, circuloMayor2.getRadio());
		
	}
	
	private CoronaCircular dadoQueExisteCoronaCircularConCirculos(Circulo circuloMenor2, Circulo circuloMayor2) {
		
		return new CoronaCircular(circuloMenor2,circuloMayor2);
	}
	

	private Double cuandoCalculoElPerimetroDeLaCorona(CoronaCircular corona) {
		
		return corona.getPerimetro2();
	}
	
	private Double cuandoCalculoElAreaDeLaCorona(CoronaCircular corona) {
		
		return corona.getArea2();
	}

}