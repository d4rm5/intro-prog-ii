class ArbolAlumnos {
    NodoAlumnos root;
    
    public ArbolAlumnos(NodoAlumnos root) {
        this.root = root;
    }
    
    public insertNotasByLegajo(NodoAlumnos node, int numLegajo, int idMateria, real nota) {
        NodoAlumnos alumno = buscarLegajo(this.root, numLegajo)
        insertNotas(alumno, idMateria, nota);
    }   
    
    private void insertNotas(NodoMateria nodo, int idMateria, real nota) {
        nuevoNodo = new NodoMateria(idMateria, nota);
        
        actual = nodo.notas;
        anterior = nodo.notas;
        
        if (actual == null || actual.getIdMateria() > nuevoNodo.getIdMateria()) {
            nuevoNodo.setSiguiente(actual); 
            nodo.setNotas(nuevoNodo); 
            return;
        } 
        
        while (actual != null &&actual.getIdMateria() < nuevoNodo.getIdMateria()) {
                anterior = actual;
                actual = actual.getSiguiente();
        } 
        
        if (actual != null && actual.getIdMateria() == nuevoNodo.getIdMateria()) {
            if (actual.getNota() > nuevoNodo.getNota()) {
                    anterior.setSiguiente(nuevoNodo);
                    nuevoNodo.setSiguiente(actual);
                } else {
                    actual.setSiguiente(nuevoNodo);
                }
        } else {
            anterior.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(actual);
        }
    }
    
    private NodoAlumnos buscarLegajo(NodoAlumnos node, int numLegajo) {
        if (node == null) {
            return null;
        } else if (node.getNumLegajo == numLegajo) {
            return node;
        } else if (node.getNumLegajo() > numLegajo) {
            node = buscarLegajo(node.left, numLegajo);
        } else if (node.getNumLegajo() < numLegajo) {
            node = buscarLegajo(node.right, numLegajo)
        }
    }
    
    private NodoAlumnos insertAlumno(NodoAlumnos node, int numLegajo) {
        if (node == null) {
            node = new NodoAlumnos(numLegajo);
        } else if (node.getNumLegajo() > numLegajo) {
            node = insertAlumno(node.left, numLegajo);
        } else if (node.getNumLegajo() < numLegajo) {
            node = insertAlumno(node.right, numLegajo); 
        }
        
        return node;
    }
    
    
}