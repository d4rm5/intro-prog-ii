class NodoEquipo {
    String nombre;
    int puntaje;
    NodoEquipo left;
    NodoEquipo right;
    NodoEquipo siguientePuntaje;
    
	public NodoEquipo(String nombre, int puntaje) {
	    this.nombre = nombre;
	    this.puntaje = puntaje;
	    this.left = null;
	    this.right = null;
	    this.siguientePuntaje = null;
	}
	
	public String getNombre() {
	    return this.nombre;
	}
	
	public int getPuntaje() {
	    return this.puntaje;
	}
	
	public void setSiguientePuntaje(NodoEquipo siguientePuntaje) {
	    this.siguientePuntaje = siguientePuntaje;
	}
	
	public NodoEquipo getSiguientePuntaje() {
	    return this.siguientePuntaje;
	}
	
	public void setLeft(NodoEquipo left) {
	    this.left = left;
	}
	
	public NodoEquipo getLeft() {
	    return this.left;
	}
	
	public void setRight(NodoEquipo right) {
	    this.right = right;
	}
	
	public NodoEquipo getRight() {
	    return this.right;
	}
}