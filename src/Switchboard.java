public class Switchboard {
    private Llamada[] llamadas;
    private int numCalls;

    public Switchboard(int numMaxCalls) {
        llamadas = new Llamada[numMaxCalls];
        for (int i = 0 ; i < llamadas.length; i++) {
            llamadas[i] = null;
        }
    }

    public void registerCall(Llamada llamada) {
        llamadas[numCalls] = llamada;
        numCalls++;
    }

    public int getNumCalls() {
        return numCalls;
    }

    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < numCalls; i++) {
            total = total + llamadas[i].getCost();
        }
        return total;
    }
}
