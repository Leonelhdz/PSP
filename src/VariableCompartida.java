public class VariableCompartida {

    private int x;

    public VariableCompartida(int x) {
        this.x = x;
    }

    public synchronized int getV() {
        return this.x;
    }

    public synchronized void setX(int x) {
        this.x = x;
    }

    public synchronized void inc() {
        ++this.x;
    }

}

//Para asegurar que solo un hilo pueda acceder a estos metodos a la vez hemos agregado a los metodos
//getV(), setX(), e inc() la palabra clave "synchronized".
//De esta manera los hilos get and set no tendran problemas de concurrencia.