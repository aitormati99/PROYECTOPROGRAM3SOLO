import java.util.ArrayList;

public class Proveedor {

	private int codigo;
	private ArrayList<String> casas;
	private ArrayList <Integer> precios;
	
	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proveedor(int codigo, ArrayList<String> casas, ArrayList<Integer> precios) {
		super();
		this.codigo = codigo;
		this.casas = casas;
		this.precios = precios;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public ArrayList<String> getCasas() {
		return casas;
	}

	public void setCasas(ArrayList<String> casas) {
		this.casas = casas;
	}

	public ArrayList<Integer> getPrecios() {
		return precios;
	}

	public void setPrecios(ArrayList<Integer> precios) {
		this.precios = precios;
	}
	
	
	
	
}
