package ar.edu.unlam.pb2.coronacircular2;

public class CoronaCircular {
	
	private Integer RADIO_INTERIOR;
	private Integer RADIO_EXTERIOR;
	
	private Circulo circuloMenor;
	private Circulo circuloMayor;

	//REFACTORIZACION --> Class CirculoTest en carpeta test
//	private Circulo circuloInterior;
//	private Circulo circuloExterior;
	
	
	
	public CoronaCircular (Integer interior, Integer exterior){
		this.RADIO_INTERIOR = interior;
		this.RADIO_EXTERIOR = exterior;
	}
	
	public CoronaCircular (Circulo circuloMenor, Circulo circuloMayor){
		this.circuloMenor= circuloMenor;
		this.circuloMayor = circuloMayor;
	}
	
	
	public Circulo getCirculoMenor() {
		return circuloMenor;
	}

	public void setCirculoMenor(Circulo circuloMenor) {
		this.circuloMenor = circuloMenor;
	}

	public Circulo getCirculoMayor() {
		return circuloMayor;
	}

	public void setCirculoMayor(Circulo circuloMayor) {
		this.circuloMayor = circuloMayor;
	}

	public Integer getRadioInterior(){
		return this.RADIO_INTERIOR;
	}
	
	
	public Integer getRadioExterior(){
		return this.RADIO_EXTERIOR;
	}



	public Double getPerimetro() {
		return 2 * Math.PI * (this.getRadioInterior() + this.getRadioExterior());
	}

    public Double getPerimetro2() {
    	return 2*Math.PI * (circuloMenor.getRadio() + circuloMayor.getRadio());
    }

	public Double getArea() {
		return Math.PI * (Math.pow(getRadioExterior(), 2) - Math.pow(getRadioInterior(), 2));
	}

	public Double getArea2() {
		
		return Math.PI * (Math.pow(circuloMayor.getRadio(), 2) - Math.pow(circuloMenor.getRadio(), 2));
	}


	
}
