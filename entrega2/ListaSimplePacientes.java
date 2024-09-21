public class ListaSimplePacientes {
	private NodoPaciente primero;

	public ListaSimplePacientes() {
		this.primero = null;
	}

	public NodoPaciente getPrimero() {
		return primero;
	}

	public void insertarInicio(Paciente nuevoPaciente) {
	    NodoPaciente nuevoNodo = new NodoPaciente(nuevoPaciente);
        if (this.primero == null) {
            this.primero = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(this.primero);
            this.primero = nuevoNodo;
        }

	}

	public void modificarPaciente(int numeroPaciente, String nuevoDomicilio) {

		NodoPaciente actual = primero;

		while (actual != null && actual.getPaciente().getNumeroPaciente() != numeroPaciente) {
			actual = actual.getSiguiente();
		}

		if (actual.getPaciente().getNumeroPaciente() != numeroPaciente) {
			actual.getPaciente().setDomicilio(nuevoDomicilio);
		} else {
			System.out.println("No existe ningún paciente con ese número asignado");

		}

	}

	public void eliminarPaciente(int numeroPaciente) {
		NodoPaciente actual = primero;
		NodoPaciente anterior = null;

		while (actual != null && actual.getPaciente().getNumeroPaciente() != numeroPaciente) {
			anterior = actual;
			actual = actual.getSiguiente();
		}

		if (actual == null) {
			System.out.println("No existe ningún paciente con ese número asignado");
		} else {
			if (actual == primero) {
				primero = actual.getSiguiente();
			} else {
				anterior.setSiguiente(actual.getSiguiente());
			}
		}

		anterior.setSiguiente(actual.getSiguiente());
    }

    public int mostrarPacienteMayorEdad() {
		NodoPaciente actual = primero;
		int mayorEdad = 0;
		int idMayorEdad = 0;

		while (actual != null ) {
			
			if (actual.getPaciente().getEdad() > mayorEdad) {
				mayorEdad = actual.getPaciente().getEdad();
				idMayorEdad = actual.getPaciente().getNumeroPaciente();
			}

			actual = actual.getSiguiente();
		}

		return idMayorEdad;

    }

    public void mostrarPacientes() {
		NodoPaciente actual = primero;

		while (actual != null) {
			actual.getPaciente().printPaciente();

			actual = actual.getSiguiente();
		}
    }
	
	public void mostrarPracientesInverso(NodoPaciente nodo) {
		if (nodo != null) {
			mostrarPracientesInverso(nodo.getSiguiente());
			nodo.getPaciente().printPaciente();
		}
	}
}
