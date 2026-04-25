public class Pista {

    private int longitud = 40;
    private Caballo caballo;

    public Pista () {

    }

    public boolean hayGanador() {
        boolean ganaste;
       if (caballo.distancia() == longitud) {
        ganaste = true;
       } else {
        ganaste = false;
       }

       return ganaste;
    }

    public void mostrar(Caballo caballo, Pista pista, Tiempo tiempo) {
       tiempo.mostrar();
    }
}
