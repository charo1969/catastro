package modelo;

public class Piso extends Inmueble {

	private int numHabitaciones;
	private boolean vpo;
	private boolean atico; // ?
	private int antiguedad;

	// constructor sin parámetros

	public Piso() {
		super();
		this.numHabitaciones = 0;
		this.vpo = false;
		this.atico = false; // ?
	}

	// constructor con parámetros

	public Piso(String refCatastral, double metroCuadrados, double vCatastral, String desInmueble, double superficie,
			int numHabitaciones, boolean vpo, boolean atico, int antiguedad) {
		super(refCatastral, metroCuadrados, vCatastral, desInmueble, superficie);
		this.numHabitaciones = numHabitaciones;
		this.vpo = vpo;
		this.atico = atico;
		this.antiguedad = antiguedad;
	}
	
	// metodos getters y setters
	
	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public boolean isVpo() {
		if(vpo == true) {
			return true;
		}
		return false;
		
	}

	public void setVpo(boolean vpo) {
		
		this.vpo = vpo;
	}

	public boolean isAtico() {
		
		return atico;
	}

	public void setAtico(boolean atico) {
		this.atico = atico;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	//toString
	
	@Override
	public String toString() {
		return "Piso [refCatastral=" + refCatastral + ", metroCuadrados=" + precioM2 + ", vCatastral="
				+ vCatastral + ", desInmueble=" + desInmueble + ", superficie=" + superficie + ", numHabitaciones="
				+ numHabitaciones + ", vpo=" + vpo + ", atico=" + atico + ", antiguedad=" + antiguedad + "]";
	}
	@Override
	public double calculaIBI() {
		
		if(this.vpo == true) {
			return ( Inmueble.COEFURBANO*super.vCatastral)*0.5;
		}
		
		
		return  Inmueble.COEFURBANO*super.vCatastral;
	}

	@Override
	public double calculaPrecioVenta() {
		if(this.atico == true) {
			double res=super.getprecioM2()*super.superficie;
			if(this.vpo == true && this.antiguedad > 25) {
				System.out.println("El piso se puede vender"); 
				
			}
		return res;
		}
		return 0;
		
		
	}

}
