package ar.unrn.model;


public class Movimiento implements State {

    private AutoAutomata autoAutomata;
    @Override
    public void detener(){
        System.out.println("Deteniendo vehiculo");
        autoAutomata.setState(new Detenido());
    }
    @Override
    public void andar(){
       System.out.println("El vehiculo ya esta andando");
    }
    @Override
    public void encendido(){
        System.out.println("El vehiculo se encuentra encendido");
    }
    @Override
    public void apagar(){
        System.out.println("El vehiculo se encuentra andando, primero detener");
    }

    @Override
    public void queEstoyHaciendo() {
        System.out.println("Me encuentro en moviemiento, Cuando lo desee detener");
    }

    @Override
    public void setAutomata(AutoAutomata autoAutomata) {
        this.autoAutomata = autoAutomata;
    }
}
