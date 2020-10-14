
public class Domicilio {

	private String nombre;
	private int precio;
	private boolean comprada;
	
	public Domicilio() {
		super();
		
	}

	public Domicilio(String nombre, int precio, boolean comprada) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.comprada = comprada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isComprada() {
		return comprada;
	}

	public void setComprada(boolean comprada) {
		this.comprada = comprada;
	}
	
	
	
	
	
	
}
