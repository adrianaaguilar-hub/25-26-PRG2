public class Pista {

    private int longitud = 40;
    private Caballo[] caballo;

    public Pista() {

    }

    public boolean hayGanador(Caballo[] caballo) {
        for (int i = 0; i < caballo.length; i++) {
            if (caballo[i].distancia() >= longitud) {
                return true;
            }
        }
        return false;
    }

    public void mostrar(Caballo[] caballo, Pista pista, Tiempo tiempo) {
        for (int i = 0; i < caballo.length; i++) {
            int posicion = caballo[i].distancia();

            if (posicion > longitud) {
                posicion = longitud;
            }

            String espacios = "";
            for (int j = 0; j < posicion; j++) {
                espacios += " ";
            }

            System.out.println(espacios + ";-;'");
        }

        System.out.println("----------------------------------------------");

    }
}
