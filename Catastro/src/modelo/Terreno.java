

package modelo;

public class Terreno extends Inmueble {
	
	private boolean urbano;
	private double terrenoHa;
	private double precioHa;
	
	// constructor sin parámetros
	
	public Terreno() {
		super();
		this.urbano = true;
		this.terrenoHa = 0;
		this.precioHa = 0;
			
	}
	//constructor con parámetros y con parámetros de la clase Inmueble
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
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

	

	@Override
	public double calculaPrecioVenta() {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}
	
	

}
