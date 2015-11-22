package ejerciciopsp6;

public class EjercicioPSP6 extends Thread {

    public EjercicioPSP6() {
    }

    public static void main(String[] args) {
        Modelo mod = new Modelo();

        new Productor("productor1").start();
        new Consumidor("consumidor2").start();

        System.out.println(mod.toString());
    }

}
