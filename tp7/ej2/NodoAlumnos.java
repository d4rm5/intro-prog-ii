class NodoAlumnos {
    int numLegajo;
    NodoAlumnos left;
    NodoAlumnos right;
    NodoMateria notas;
    
    public ArbolAlumnos(int numLegajo, nodoMateria notas) {
        this.numLegajo = numLegajo;
        this.notas = notas;
    }
    
    public int getNumLegajo() {
        return this.numLegajo;
    }
    
    public NodoMateria getNotas() {
        return notas;
    }
}