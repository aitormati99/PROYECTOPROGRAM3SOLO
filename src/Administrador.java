
public class Administrador extends Empleado {

	private String usuario;
	private String contrasenya;
	
	public Administrador() {
		super();
		
	}
	public Administrador(String nombre, String dni, int sueldo, int horarioLaboral,String usuario, String contrasenya) {
		super(nombre, dni, sueldo, horarioLaboral);
		this.usuario = usuario;
		this.contrasenya = contrasenya;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
	

	
	
	
}
