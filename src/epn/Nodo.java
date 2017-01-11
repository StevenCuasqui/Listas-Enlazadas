package epn;

public class Nodo {
	
	private String elemento;
	private Nodo siguiente;
		
	public Nodo(String elemento, Nodo siguiente) {
		super();
		this.elemento = elemento;
		this.siguiente = siguiente;
	}
	
	public String getElemento(){
		return elemento;
	}
	
	public Nodo getSiguiente(){
		return siguiente;
	}
	
	public void setElemento(String nuevo){
		elemento= nuevo;
	}
	
	public void setSiguiente(Nodo nuevosiguiente){
		siguiente= nuevosiguiente;
	}
	
	

}
