public class NodoPaciente {

    private Paciente paciente;
    private NodoPaciente siguiente;

    public NodoPaciente(Paciente paciente) {
        this.paciente = paciente;
        this.siguiente = null;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int dato) {
        this.paciente = paciente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
