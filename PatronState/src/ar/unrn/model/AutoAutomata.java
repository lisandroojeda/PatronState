package ar.unrn.model;
//mi contexto

public class AutoAutomata {

    private State estado;


    public AutoAutomata(){
        setState(new Apagado());
    }

    protected void setState(State estado){
        this.estado = estado;
        this.estado.setAutomata(this);
    }

    public void detener(){
        this.estado.detener();
    }
    public void andar(){
        this.estado.andar();
    }
    public void encendido(){
        this.estado.encendido();
    }
    public void apagar(){
        this.estado.apagar();
    }

    public void queEstoyHaciendo() {
        this.estado.queEstoyHaciendo();
    }
}
