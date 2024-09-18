class Paciente {

    private int numeroPaciente;
    private String nombre;
    private String apellido;
    private String domicilio;
    private boolean OS;

    public Paciente(
        int numeroPaciente,
        String nombre,
        String apellido,
        String domicilio,
        boolean OS
    ) {
        this.numeroPaciente = numeroPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domiclio = domicilio;
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

    public void setOS(boolean OS) {
        this.OS = OS;
    }
}
