class NodoMateria {
    int idMateria;
    real nota;
    NodoMateria siguiente;
    
    public NodoMateria(int idMateria, real nota, NodoMateria siguiente) {
        this.idMateria = idMateria;
        this.nota = nota;
        this.siguiente = null;
    }
    
    public NodoMateria getSiguiente() {
        return NodoMateria this.siguiente;
    }
    
    public void setMateria(NodoMateria siguiente) {
        this.siguiente = siguiente;
    }
    
    public int getIdMateria() {
        return idMateria;
    }
    
    public real getNota() {
        return nota;
    }
}