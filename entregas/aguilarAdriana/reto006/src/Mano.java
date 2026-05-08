public class Mano {
    private Carta [] cartas;
    private int contador;

    public Mano () {

    }

    public void añadir (Carta carta) {}

    public int sumaTotal () {
        int suma = 0;
        int ases = 0;

       
        for (int i = 0; i < contador; i++) {
            suma += cartas[i].valor21();
            if (cartas[i].esAs()) {
                ases++;
            }
        }

        while (ases > 0 && suma + 10 <= 21) {
            suma += 10;
            ases--;
        }

        return suma;
    }

    public boolean tiene21 () {}

    public boolean esMenora21 () {}

    public void mostrar () {}
}
