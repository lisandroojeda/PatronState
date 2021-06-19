package ar.unrn.main;

import ar.unrn.model.AutoAutomata;
import ar.unrn.model.Menu;

public class Main {
    public static void main(String[] args) {
        AutoAutomata autoAutomata = new AutoAutomata();

        new Menu(autoAutomata).display();
    }

}
