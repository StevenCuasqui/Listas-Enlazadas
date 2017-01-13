package epn;

public class Aplicacion {

	public static void main(String[] args) {
		ListaEnlazadaS lista= new ListaEnlazadaS();
		lista.insertarInicio("prueba1");
		lista.insertarInicio("prueba2");
		lista.insertarFinal("prueba3");
		lista.insertarFinal("prueba4");
		lista.insertarInicio("prueba5");
		lista.imprimir();
		try {
			System.out.println("El nodo contiene la informacion: "+lista.buscarNodo("prueba2").getElemento());
			}
		catch(NullPointerException e){
			System.out.println("No se encuentra en la lista");
		}
		try {
		System.out.println("El nodo de esa posicion contiene: "+lista.buscarNodoPos(4).getElemento());
		}
		catch(NullPointerException e){
			System.out.println("No se encuentra en la lista");
		}
		lista.insertarInicio("0");
		lista.imprimir();
		lista.insertarFinal("100");
		lista.imprimir();
		System.out.println(lista.buscarNodoPos(4).getElemento());
	}

}
