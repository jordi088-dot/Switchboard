public class Exercise5 {
    public static void main(String[] args) {
        Switchboard centralita = new Switchboard(1000);
        centralita.registerCall(new Llamada("555-43434" , "555-434324" , 30, 1, true));
        centralita.registerCall(new Llamada("555-43666" , "555-434777" , 24, 2, false));
        centralita.registerCall(new Llamada("555-48888" , "555-430000" , 24, 3, false));

        System.out.println("Numero total de llamadas: " + centralita.getNumCalls());
        System.out.println("Coste total de llamada: " + centralita.getTotalCost());
    }
}
