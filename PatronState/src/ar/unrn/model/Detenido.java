package ar.unrn.model;

public class Detenido implements State {

    private AutoAutomata autoAutomata;
    @Override
    public void detener() {
        System.out.println("El auto ya esta detenido");
    }

    @Override
    public void andar() {
        System.out.println("Desplazandoce a destino");
        autoAutomata.setState(new Movimiento());
    }

    @Override
    public void encendido() {
        System.out.println("El auto ya se encuentra encendido");

    }
    @Override
    public void apagar() {
        System.out.println("<---Apagando Automovil--->");
        autoAutomata.setState(new Apagado());
    }

    @Override
    public void queEstoyHaciendo() {
        System.out.println("Estoy Detenido puedo apagarme o puedo ponerme en movimiento");
    }

    @Override
    public void setAutomata(AutoAutomata autoAutomata) {
        this.autoAutomata = autoAutomata;
    }
}
