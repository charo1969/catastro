package modelo;

import java.util.Objects;

public abstract class  Inmueble {
	
	protected String refCatastral;
	protected double metroCuadrados;
	protected double vCatastral;
	protected String desInmueble;
	protected double superficie;
	public final static double COEFURBANO = 0.85;
	public static final double COEFRUSTICO = 0.45;
	
	
	// constructor sin parámetros
	
	public Inmueble() {
		this.refCatastral = "";
		this.metroCuadrados = 0;
		this.vCatastral = 0;
		this.desInmueble = "";
		this.superficie = 0;
		
	}
	// constructor con parámetros

	public Inmueble(String refCatastral, double metroCuadrados, double vCatastral, String desInmueble, double pMetros) {
		
		this.refCatastral = refCatastral;
		this.metroCuadrados = metroCuadrados;
		this.vCatastral = vCatastral;
		this.desInmueble = desInmueble;
		//this.superficie = superficie;
		setSuperficie();
	}
	
	// constructor de copia
	
	public Inmueble(Inmueble in) {
		this.refCatastral = in.refCatastral;
		this.metroCuadrados = in.metroCuadrados;
		this.vCatastral = in.vCatastral;
		this.desInmueble = in.desInmueble;
		this.superficie = in.superficie;
	}
	// getters y setters

	public String getRefCatastral() {
		return refCatastral;
	}

	public void setRefCatastral(String refCatastral) {
		this.refCatastral = refCatastral;
	}

	public double getMetroCuadrados() {
		return metroCuadrados;
	}

	public void setMetroCuadrados(double metroCuadrados) {
		this.metroCuadrados = metroCuadrados;
	}

	public double getvCatastral() {
		return vCatastral;
	}

	public void setvCatastral(double vCatastral) {
		this.vCatastral = vCatastral;
	}

	public String getDesInmueble() {
		return desInmueble;
	}

	public void setDesInmueble(String desInmueble) {
		this.desInmueble = desInmueble;
	}

	public double setSuperficie() {
		return superficie;
	}

	public void setSuperficie(double Superficie) {
		if(superficie<0) {
			this.superficie = 0;
		}else {
			this.superficie=superficie;
		}
		
	}
	// toString 
	
	@Override
	public String toString() {
		return "Inmueble [refCatastral=" + refCatastral + ", metroCuadrados=" + metroCuadrados + ", vCatastral="
				+ vCatastral + ", desInmueble=" + desInmueble + ", pMetros=" + superficie + "]";
	}
	// HashCode

	@Override
	public int hashCode() {
		return Objects.hash(refCatastral);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inmueble other = (Inmueble) obj;
		return Objects.equals(refCatastral, other.refCatastral);
	}
	
	
	
	// metodo abstract calculaIBI
	public abstract double calculaIBI();
	
	// metodo abstract calculaPrecioVenta
	
	public abstract double calculaPrecioVenta();
	
	
	
	
	
	

}
