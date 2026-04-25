public class Caballo {
    private int cantidadCaballos;
    private int distanciaRecorrida;
    private int avance;

    public Caballo () {

    }

   public void avanzar () {
    avance = (int) (Math.random()*3);
    distanciaRecorrida = distanciaRecorrida + avance;
   }
   

   public int distancia () {
    return distanciaRecorrida;
   }
}
