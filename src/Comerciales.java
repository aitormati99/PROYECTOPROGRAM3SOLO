import java.util.ArrayList;

public class Comerciales extends Empleado{

	private ArrayList<String> clientes;

	public Comerciales() {
		super();
	
	}

	public Comerciales(String nombre, String dni, int sueldo, int horarioLaboral,ArrayList<String> clientes) {
		super(nombre, dni, sueldo, horarioLaboral);
		this.clientes = clientes;
	}

	public ArrayList<String> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<String> clientes) {
		this.clientes = clientes;
	}

	
	
	
}
