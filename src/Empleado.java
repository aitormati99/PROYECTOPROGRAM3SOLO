
public abstract class Empleado {

	private String nombre;
	private String dni;
	private int sueldo;
	private int horarioLaboral;
	
	
	public Empleado() {
		super();
		
	}
	
	public Empleado(String nombre, String dni, int sueldo, int horarioLaboral) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
		this.horarioLaboral = horarioLaboral;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getHorarioLaboral() {
		return horarioLaboral;
	}

	public void setHorarioLaboral(int horarioLaboral) {
		this.horarioLaboral = horarioLaboral;
	}


	
	
	
}
