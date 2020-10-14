
public class Tasador extends Empleado {

	private int contadorFacturas;

	public Tasador() {
		super();
		
	}

	public Tasador(String nombre, String dni, int sueldo, int horarioLaboral,int contadorFacturas) {
		super(nombre, dni, sueldo, horarioLaboral);
		this.contadorFacturas = contadorFacturas;
	}

	public int getContadorFacturas() {
		return contadorFacturas;
	}

	public void setContadorFacturas(int contadorFacturas) {
		this.contadorFacturas = contadorFacturas;
	}

	
	
	
}
