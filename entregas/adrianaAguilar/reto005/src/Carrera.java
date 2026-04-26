public class Carrera {
    private Caballo [] caballo;
    private Pista pista;
    private Tiempo tiempo;

    public Carrera(Caballo [] caballo, Pista pista, Tiempo tiempo) {
        this.caballo = caballo;
        this.pista = pista;
        this.tiempo = tiempo;
    }


    public void jugar() {
       do {
        for (int i = 0; i < caballo.length; i++) {
            caballo[i].avanzar();
        }
        tiempo.avanzar();
        pista.mostrar( caballo, pista, tiempo);
       } while (!pista.hayGanador(caballo));
    }

}
