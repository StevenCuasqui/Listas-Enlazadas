package epn;

public class Nodo {
	
	private String elemento;
	private Nodo siguiente;
		
	public Nodo(String elemento, Nodo siguiente) {
		this.elemento = elemento;
		this.siguiente = siguiente;
	}
	
	public Nodo(String elemento){
		this.elemento=elemento;
		this.siguiente=null;
		
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
