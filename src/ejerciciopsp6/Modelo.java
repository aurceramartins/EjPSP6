package ejerciciopsp6;

public class Modelo {

    static int cuenta;
    static int vacio;

    public Modelo() {
    }

    public Modelo(int cuenta, int vacio) {
        this.cuenta = cuenta;
        this.vacio = vacio;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getVacio() {
        return vacio;
    }

    public void setVacio(int vacio) {
        this.vacio = vacio;
    }

    @Override
    public String toString() {
        return "Modelo{" + "cuenta=" + cuenta + ", vacio=" + vacio + '}';
    }

}
