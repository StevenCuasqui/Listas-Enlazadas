package epn;

public class ListaEnlazadaS {
	protected Nodo cabeza;
	protected long tamaño;
	
	public ListaEnlazadaS() {
		this.cabeza = null;
		this.tamaño = 0;
	}
	
	public ListaEnlazadaS(long tamaño) {
		this.tamaño=tamaño;
		this.cabeza=null;
	}

	public boolean vacio(){
		return cabeza==null;
	}
	
	public void insertarInicio(String elemins){
		if(vacio()){
		cabeza= new Nodo(elemins);
		}
		else{
		cabeza= new Nodo(elemins,cabeza);
		}
	}
	
	public void insertarFinal(String elemins){
		if(vacio()){
			cabeza=new Nodo(elemins);
		}
		else{
			Nodo p=cabeza;
		while(p.getSiguiente()!=null){
			p=p.getSiguiente();
		}
		Nodo q= new Nodo(elemins);
		p.setSiguiente(q);
		}
	}
	
	public Nodo buscarNodo(String dato){
		Nodo buscador;
		for(buscador=cabeza;buscador!=null;buscador=buscador.getSiguiente()){
			if(dato==buscador.getElemento()){
				return buscador;
			}
		}
			return null;
	}
	
	public Nodo buscarNodoPos(int ref){
		Nodo buscador;
		int indice=1;
		for(buscador=cabeza;(buscador!=null)&&(indice<=ref);indice++ /*&& (buscador=buscador.getSiguiente()*/){
			if(indice==ref){
				return buscador;
			}
			buscador=buscador.getSiguiente();
		}
		return null;
	}
	
	public void imprimir(){
		if(vacio()){
			System.out.println("Vacia \n");
			return;
		}
		
		Nodo actual=cabeza;
		while(actual!=null){
			System.out.println(actual.getElemento());
			actual=actual.getSiguiente();
		}
		System.out.println("\n");
	}
}
