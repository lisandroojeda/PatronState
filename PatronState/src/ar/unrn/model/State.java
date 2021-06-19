package ar.unrn.model;
// Interfaz estado
public interface State {

    void detener();
    void andar();
    void encendido();
    void apagar();
    void queEstoyHaciendo();

    void setAutomata(AutoAutomata autoAutomata);
}
