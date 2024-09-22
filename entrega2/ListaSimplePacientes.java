public class ListaSimplePacientes {
	private NodoPaciente primero;

	public ListaSimplePacientes() {
		this.primero = null;
	}

	public NodoPaciente getPrimero() {
		return primero;
	}

	public void setPrimero(NodoPaciente newPrimero) {
		this.primero = newPrimero;
	}

	public boolean existePaciente (int numeroPaciente) {
		NodoPaciente actual = this.primero;
		while (actual != null && actual.getPaciente().getNumeroPaciente() != numeroPaciente){
			actual = actual.getSiguiente();
		}
		return (actual != null);
	}

	public void insertarPacienteEnOrden(Paciente nuevoPaciente) {
		NodoPaciente nuevoNodo = new NodoPaciente(nuevoPaciente);

		if (this.primero == null || this.primero.getPaciente().getNumeroPaciente() > nuevoPaciente.getNumeroPaciente()) {
			nuevoNodo.setSiguiente(primero);
			this.primero = nuevoNodo;
		} else {

			NodoPaciente anterior = primero;
			NodoPaciente actual = primero;

			while (actual != null && actual.getPaciente().getNumeroPaciente() <  nuevoPaciente.getNumeroPaciente()) {
				anterior = actual;
				actual = actual.getSiguiente();
			}

			nuevoNodo.setSiguiente(actual);
			anterior.setSiguiente(nuevoNodo);
		}
	}

	public void modificarDomicilioPaciente(int numeroPaciente, String nuevoDomicilio) {
        NodoPaciente actual = primero;

        while (actual != null && actual.getPaciente().getNumeroPaciente() != numeroPaciente) {
            actual = actual.getSiguiente();
        }

        if (actual != null) {
            actual.getPaciente().setDomicilio(nuevoDomicilio);
            System.out.println("Domicilio modificado con éxito.");
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
            if (anterior == null) {
                primero = actual.getSiguiente();
            } else {
                anterior.setSiguiente(actual.getSiguiente());
            }
            System.out.println("Paciente eliminado con éxito.");
        }
    }

	public int mostrarPacienteMayorEdad() {
        if (primero == null) {
            System.out.println("La lista de pacientes está vacía.");
            return -1;
        }

        NodoPaciente actual = primero;
        int mayorEdad = actual.getPaciente().getEdad();
        int idMayorEdad = actual.getPaciente().getNumeroPaciente();

        while (actual != null) {
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
	
	public void mostrarPacientesInverso(NodoPaciente nodo) {
		if (nodo != null) {
			mostrarPacientesInverso(nodo.getSiguiente());
			nodo.getPaciente().printPaciente();
		}
	}
}
