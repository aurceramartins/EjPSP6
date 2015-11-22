package ejerciciopsp6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread {

    public Consumidor(String str) {
        super(str);
    }
    Modelo mod = new Modelo();

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                this.consume();
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            mod.cuenta = mod.getCuenta() - 1;
            mod.setCuenta(mod.cuenta);
            System.out.println(mod.toString());
        }

    }

    public synchronized void consume() throws InterruptedException {
        while (mod.getVacio() == 0) {
            wait();
            
        }
        Modelo.vacio = 1;
        notifyAll();
    }

}
