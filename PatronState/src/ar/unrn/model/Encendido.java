package ar.unrn.model;


public class Encendido implements State {

    private AutoAutomata autoAutomata;

    @Override
    public void detener() {
        System.out.println("Auto en estado de reposo por encendido");
    }

    @Override
    public void andar() {
        System.out.println("Iniciando Recorrido");
        autoAutomata.setState(new Movimiento());
    }

    @Override
    public void encendido() {
        System.out.println("Sin acciones auto ya encendido");
    }
    @Override
    public void apagar() {
        System.out.println("<---Apagando automovil--->");
        autoAutomata.setState(new Apagado());
    }

    @Override
    public void queEstoyHaciendo() {

        System.out.println("Estoy encendido, puedo apagarme o ponerme en movimiento");
    }

    @Override
    public void setAutomata(AutoAutomata autoAutomata) {

        this.autoAutomata = autoAutomata;
    }
}
