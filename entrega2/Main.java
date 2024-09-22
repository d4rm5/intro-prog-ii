class Main {
    private static final String FILE_PATH = "/work/DM_pacientes.txt";

    public static void main(String[] args) {
        ListaSimplePacientes listaDePacientes = new ListaSimplePacientes();

        if (Archivo.fileExists(FILE_PATH)) {
            Archivo.loadPacientesFromPath(listaDePacientes, FILE_PATH);
        } else {
            Archivo.writePacientesInPath(listaDePacientes, FILE_PATH);
        }
        
        Menu.menu(listaDePacientes);

        Archivo.writePacientesInPath(listaDePacientes, FILE_PATH);
    }
    
}