package ejerciciopsp6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread {

    public Productor(String str) {
        super(str);
    }
    Modelo mod = new Modelo();

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                this.produce();
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
            Modelo.cuenta = mod.getCuenta() + 1;
            mod.setCuenta(Modelo.cuenta);

            System.out.println(mod.toString());
        }
        mod.setVacio(1);

    }

    public synchronized void produce() throws InterruptedException {
        while (mod.getVacio() > 0) {
            wait();
            System.out.println("produce esta esperando");
        }
        Modelo.vacio = 0;
        notifyAll();
    }

}
