import java.io.Serializable;

class Paciente implements Serializable {

    private int numeroPaciente;
    private String nombre;
    private String apellido;
    private String domicilio;
    private int edad;
    private boolean OS;

    public Paciente(
        int numeroPaciente,
        String nombre,
        String apellido,
        String domicilio,
        int edad,
        boolean OS
    ) {
        this.numeroPaciente = numeroPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.OS = OS;
    }

    public int getNumeroPaciente() {
        return this.numeroPaciente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public int getEdad() {
        return this.edad;
    }

    public boolean getOS() {
        return this.OS;
    }

    public void setNumeroPaciente(int numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setOS(boolean OS) {
        this.OS = OS;
    }

    public void printPaciente() {
        System.out.println("Numero Paciente: " + this.numeroPaciente);
			System.out.println("Nombre: " + this.nombre);
			System.out.println("Apellido: " + this.apellido);
			System.out.println("Domicilio: " + this.domicilio);
			System.out.println("Edad: " + this.edad);
			System.out.println("Obra Social: " + (this.OS ? "Sí" : "No"));
    }

    @Override
    public String toString() {
        return "Paciente{nombre='" + nombre + "', apellido='" + apellido + "', domicilio='" + domicilio + 
               "', edad=" + edad + ", OS=" + OS + "}";
    }
}
