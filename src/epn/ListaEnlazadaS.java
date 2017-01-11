package epn;

public class ListaEnlazadaS {
	
	protected Nodo cabeza;
	protected long tamaño;
	
	public ListaEnlazadaS() {
		this.cabeza = null;
		this.tamaño = 0;
	}
	
	public void insertarFinal(String elemento){
		Nodo aux= new Nodo(elemento);
		Nodo actual= inicio;
		if(vacio()){
			inicio= aux;
		}
		else{
			while(actual.getEnlace()!=null){
				actual= actual.getEnlace();
		}
			actual.setEnlace(aux);
		}
		tam++;
	}
	
	public void insertarInicio(String elemento){
	
		Nodo actual=inicio;
		if(vacio()){
			inicio= new Nodo(elemento);
		}
		else{
			inicio= new Nodo(elemento, actual);
		}
	}
	
}
