import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {

    public static void menu(ListaSimplePacientes listaSimplePacientes) {
        Scanner scn = new Scanner(System.in);
        char input = ' ';

        while (input != '0') {
            printMenu();
            try {
                input = scn.next().charAt(0);
                scn.nextLine();

                switch (input) {
                    case '1':
                        casoUno(scn, listaSimplePacientes);
                        break;
                    case '2':
                        casoDos(scn, listaSimplePacientes);
                        break;
                    case '3':
                        casoTres(scn, listaSimplePacientes);
                        break;
                    case '4':
                        casoCuatro(listaSimplePacientes);
                        break;
                    case '5':
                        casoCinco(listaSimplePacientes);
                        break;
                    case '6':
                        casoSeis(listaSimplePacientes);
                        break;
                    case '0':
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Seleccione una opción válida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese una opción válida.");
                scn.nextLine(); 
                input = ' '; 
            }
        } 

        scn.close();
    }

    private static void printMenu() {
        System.out.println("Bienvenido al gestor de pacientes. Seleccione una de las siguientes opciones para continuar:");
        System.out.println("  1) Agregar paciente");
        System.out.println("  2) Modificar domicilio de un paciente");
        System.out.println("  3) Eliminar un paciente");
        System.out.println("  4) Mostrar el paciente de mayor edad");
        System.out.println("  5) Mostrar todos los pacientes");
        System.out.println("  6) Mostrar todos los pacientes en orden inverso");
        System.out.println("  0) Salir");
    }

    private static int readValidInteger(Scanner scn, String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                int valor = scn.nextInt();
                scn.nextLine(); 
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero válido.");
                scn.nextLine(); 
            }
        }
    }

    private static String readValidString(Scanner scn, String mensaje) {
        System.out.println(mensaje);
        return scn.nextLine();
    }

    private static boolean readValidBool(Scanner scn, String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                boolean valor = scn.nextBoolean();
                scn.nextLine(); 
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese 'true' o 'false'.");
                scn.nextLine(); 
            }
        }
    }

    private static void casoUno(Scanner scn, ListaSimplePacientes listaSimplePacientes) {
        int numeroPaciente = readValidInteger(scn, "Ingrese el número del paciente:");
        String nombre = readValidString(scn, "Ingrese el nombre del paciente:");
        String apellido = readValidString(scn, "Ingrese el apellido del paciente:");
        String domicilio = readValidString(scn, "Ingrese el domicilio del paciente:");
        int edad = readValidInteger(scn, "Ingrese la edad del paciente:");
        boolean OS = readValidBool(scn, "¿Tiene obra social? (true/false):");

        if (listaSimplePacientes.existePaciente(numeroPaciente)) {
            System.out.println("Numero de paciente ya existe.");
            return;
        }

        Paciente nuevoPaciente = new Paciente(numeroPaciente, nombre, apellido, domicilio, edad, OS);
        listaSimplePacientes.insertarPacienteEnOrden(nuevoPaciente);
        System.out.println("Paciente agregado con éxito.");
    }

    private static void casoDos(Scanner scn, ListaSimplePacientes listaSimplePacientes) {
        int numeroPaciente = readValidInteger(scn, "Ingrese numero de paciente a modificar:");
        String nuevoDomicilio = readValidString(scn, "Ingrese nuevo domicilio:");

        listaSimplePacientes.modificarDomicilioPaciente(numeroPaciente, nuevoDomicilio);
    }

    private static void casoTres(Scanner scn, ListaSimplePacientes listaSimplePacientes) {
        int numeroPaciente = readValidInteger(scn, "Ingrese numero de paciente a eliminar:");
        listaSimplePacientes.eliminarPaciente(numeroPaciente);
    }

    private static void casoCuatro(ListaSimplePacientes listaSimplePacientes) {
        System.out.println("Numero del paciente de mayor edad: " + listaSimplePacientes.mostrarPacienteMayorEdad());
    }

    private static void casoCinco(ListaSimplePacientes listaSimplePacientes) {
        listaSimplePacientes.mostrarPacientes();
    }

    private static void casoSeis(ListaSimplePacientes listaSimplePacientes) {
        listaSimplePacientes.mostrarPacientesInverso(listaSimplePacientes.getPrimero());
    }

    
}
