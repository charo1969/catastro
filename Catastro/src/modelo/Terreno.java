

package modelo;

public class Terreno extends Inmueble {
	
	private boolean urbano;
	private double terrenoHa;
	private double precioHa;
	
	// constructor sin par�metros
	
	public Terreno() {
		super();
		this.urbano = true;
		this.terrenoHa = 0;
		this.precioHa = 0;
			
	}
	//constructor con par�metros y con par�metros de la clase Inmueble
	public Terreno(String refCatastral, double metroCuadrados, double vCatastral, String desInmueble, double superficie,
			boolean urbano, double terrenoHa, double precioHa) {
		super(refCatastral, metroCuadrados, vCatastral, desInmueble, superficie);
		this.urbano = urbano;
		this.terrenoHa = terrenoHa;
		this.precioHa = precioHa;
	}
	//getters y setters
	public boolean isUrbano() {
		return urbano;
	}
	public void setUrbano(boolean urbano) {
		this.urbano = urbano;
	}
	public double getTerrenoHa() {
		return terrenoHa;
	}
	public void setTerrenoHa(double terrenoHa) {
		this.terrenoHa = terrenoHa;
	}
	public double getPrecioHa() {
		return precioHa;
	}
	public void setPrecioHa(double precioHa) {
		this.precioHa = precioHa;
	}
	//metodos heredados de la clase abstracta Inmueble
	@Override
	public double calculaIBI() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return 0;
	}

	

	@Override
	public double calculaPrecioVenta() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return 0;
	}
	
	

}
