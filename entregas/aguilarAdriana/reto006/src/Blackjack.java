public class Blackjack {
    private Baraja baraja;
    private Jugador jugador;
    private Console console;
    private boolean jugando;

    public Blackjack() {
    }

    public void jugar() {

        this.prepararPartida();
        this.repartirCartasIniciales();

        this.jugador.mostrarMano();

        if (this.jugador.consultarPuntaje() == 21) {
            this.console.writeln("¡Blackjack!");
        } else {
            this.gestionarTurno();
        }

        this.mostrarResultadoFinal();

    }

    private void prepararPartida(Baraja baraja) {

    }

    private void repartirCartasIniciales(Baraja baraja) {
        baraja.sacarCartasIniciales();
    }

    private void gestionarTurno() {
    }

    private void mostrarResultadoFinal() {
    }
}
