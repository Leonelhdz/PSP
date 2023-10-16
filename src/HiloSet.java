public class HiloSet implements Runnable{
    private VariableCompartida variableCompartida;

    public HiloSet(VariableCompartida variableCompartida) {
        this.variableCompartida = variableCompartida;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            variableCompartida.setX(i);
            System.out.println("El valor obtenido es: "+ i);
        }
    }

}
