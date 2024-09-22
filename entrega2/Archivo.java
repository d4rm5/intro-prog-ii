import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class Archivo {

    public static boolean fileExists(String filePath) {
        return Files.exists(Paths.get(filePath));
    }

    public static void writePacientesInPath(ListaSimplePacientes listaSimplePacientes, String filePath) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            NodoPaciente actual = listaSimplePacientes.getPrimero();
            while (actual != null) {
                out.writeObject(actual.getPaciente());  
                actual = actual.getSiguiente();
            }
            System.out.println("Pacientes guardados correctamente en " + filePath);
        } catch (IOException e) {
            System.out.println("Error al guardar los pacientes: " + e.getMessage());
        }
    }

    public static void loadPacientesFromPath(ListaSimplePacientes listaSimplePacientes, String filePath) {
        Paciente paciente = null;
        
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            while (true) { // Leer hasta que no haya más objetos
                paciente = (Paciente) in.readObject();
                listaSimplePacientes.insertarPacienteEnOrden(paciente); // Agregar el paciente a la lista
            }
        } catch (EOFException e) {
            // Fin del archivo alcanzado, no se hace nada
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); // Manejo de excepciones
        }
    }
    
}