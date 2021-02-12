# SO2
SO2, Proyectos

public class Proceso {
	
	private int idProceso;
	private String nombre;
	private int tamanio;
	private int asignacionEnMemoria;
	
	public Proceso(int idProceso, String nombre, int tamanio) {
		super();
		this.idProceso = idProceso;
		this.nombre = nombre;
		this.tamanio = tamanio;
	}
	public Proceso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdProceso() {
		return idProceso;
	}
	public void setIdProceso(int idProceso) {
		this.idProceso = idProceso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	public int getAsignacionEnMemoria() {
		return asignacionEnMemoria;
	}
	public void setAsignacionEnMemoria(int asignacionEnMemoria) {
		this.asignacionEnMemoria = asignacionEnMemoria;
	}
	

}
