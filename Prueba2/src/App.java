public class App {
    public static void main(String[] args) throws Exception {
        /*
        los enum los  pueden usar como arreglos de constantes
        o de datos que no deben cambiar
        NO es necesario instanciarlos
        */
        System.out.println(Dias.LUNES);
        System.out.println(Dias.DOMINGO.getNombreDia() + " " + Dias.DOMINGO.getNumDia());
    }
}
