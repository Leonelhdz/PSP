public class HiloGet implements Runnable{
    private VariableCompartida variableCompartida;

    public HiloGet(VariableCompartida variableCompartida) {
        this.variableCompartida = variableCompartida;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int valor = variableCompartida.getV();
            System.out.println("El valor obtenido es: " + valor);
        }
    }

}
