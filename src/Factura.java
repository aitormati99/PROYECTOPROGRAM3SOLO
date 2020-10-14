import java.util.Date;

public class Factura {

	private Date fecha;
	private int coste;
	private int numFac;
	private int dniTasador;
	private Domicilio casacomprada;
	
	
	public Factura() {
		super();
		
	}


	public Factura(Date fecha, int coste, int numFac, int dniTasador, Domicilio casacomprada) {
		super();
		this.fecha = fecha;
		this.coste = coste;
		this.numFac = numFac;
		this.dniTasador = dniTasador;
		this.casacomprada = casacomprada;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public int getCoste() {
		return coste;
	}


	public void setCoste(int coste) {
		this.coste = coste;
	}


	public int getNumFac() {
		return numFac;
	}


	public void setNumFac(int numFac) {
		this.numFac = numFac;
	}


	public int getDniTasador() {
		return dniTasador;
	}


	public void setDniTasador(int dniTasador) {
		this.dniTasador = dniTasador;
	}


	public Domicilio getCasacomprada() {
		return casacomprada;
	}


	public void setCasacomprada(Domicilio casacomprada) {
		this.casacomprada = casacomprada;
	}
	
	
	
}
