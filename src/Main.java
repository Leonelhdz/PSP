public class Main {
    public static void main(String[] args) {

        VariableCompartida variableCompartida = new VariableCompartida(0);
        Thread hiloSet = new Thread(new HiloSet(variableCompartida));
        Thread hiloGet = new Thread(new HiloGet(variableCompartida));

        hiloSet.start();
        hiloGet.start();
    }
}

//El resultado que obtenemos por consola son los valores actualizados por el HiloSet y leidos por el HiloGet.
//JSJDJDJDJDJDJDJDJDJDJDJDJDJD