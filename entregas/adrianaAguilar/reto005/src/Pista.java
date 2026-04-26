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
        limpiarPantalla();

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

    private void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void imprimirResultado(Caballo[] caballo) {
        int ganadores = 0;
        int indiceGanador = -1;

        for (int i = 0; i < caballo.length; i++) {
            if (caballo[i].distancia() >= longitud) {
                ganadores++;
                indiceGanador = i;
            }
        }

        if (ganadores == 1) {
            System.out.println("Gano el caballo " + (indiceGanador + 1));
        } else if (ganadores > 1) {
            System.out.println("Empate");
        }
    }
}
