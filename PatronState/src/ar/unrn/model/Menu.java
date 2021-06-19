package ar.unrn.model;

import java.util.Scanner;

public class Menu {

    AutoAutomata autoAutomata;

    public Menu(AutoAutomata autoAutomata) {
        this.autoAutomata= autoAutomata;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String mensajeOpciones = "Consola del tablero de auto que hago: \n" +
                "e) Encender, m) Moverse, d) Detenerce, c) Como estoy?, a) Apagar, s) Salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'e': autoAutomata.encendido(); break;
                case 'm': autoAutomata.andar(); break;
                case 'd': autoAutomata.detener(); break;
                case 'c': autoAutomata.queEstoyHaciendo(); break;
                case 'a': autoAutomata.apagar(); break;
                case 's': autoAutomata.apagar();System.exit(0);; break;
                default: System.out.println("Opcion no válida");
            }
        }
    }

}
