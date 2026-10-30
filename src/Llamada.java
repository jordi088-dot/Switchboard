public class Llamada {
    private String origen;
    private String destino;
    private int duracion;
    private int banda;
    private boolean local;

    public Llamada(String origen, String destino, int duracion, int banda, boolean local) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.banda = banda;
        this.local  = local;
    }

    @Override
    public String toString() {
        String tipo;
        if (local) {
            tipo = "local";
        } else {
            tipo = "provincia";
        }
        return "Origen: " + origen + "  Destino: " + destino + "Duración: " + duracion + "   Banda: " + banda + "  Tipo: " + tipo + "  Cost: " + getCost();
    }
    //Coste de los centimos:
    public double getCost() {
        if (local) {
            return 0.15 * duracion;
        } else {
            if (banda == 1) {
                return 0.25 * duracion;
            } else if (banda == 2){
                return duracion * 0.25;
            } else {
                return duracion * 0.30;
            }
        }
    }
}
