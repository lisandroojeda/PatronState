package ar.unrn.model;

public class Apagado implements State {

    private AutoAutomata autoAutomata;

    @Override
    public void detener() {
        System.out.println("... ");
    }

    @Override
    public void andar() {
        System.out.println("....");
    }

    @Override
    public void encendido() {
        System.out.println("<---Encendiendo Auto--->");
        autoAutomata.setState(new Encendido());
    }

    @Override
    public void apagar() {
       System.out.println("....");
    }

    @Override
    public void queEstoyHaciendo() {
        System.out.println("Mensaje automatico estoy apagado, encender");
    }

    @Override
    public void setAutomata(AutoAutomata autoAutomata) {
        this.autoAutomata = autoAutomata;  // guardo la referencia
    }
}
