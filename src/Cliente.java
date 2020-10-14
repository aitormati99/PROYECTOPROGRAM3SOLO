import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private int telefono;
	private int dni;
	private Domicilio casas;
	
	public Cliente() {
		super();
		
	}

	public Cliente(String nombre, String apellido, String direccion, int telefono, int dni, Domicilio casas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
		this.casas = casas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Domicilio getCasas() {
		return casas;
	}

	public void setCasas(Domicilio casas) {
		this.casas = casas;
	}

	
	
}
