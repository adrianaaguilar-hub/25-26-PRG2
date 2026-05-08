public class Blackjack {
    private Baraja baraja;
    private Jugador jugador;
    private Console console;
    private boolean jugando;

    public Blackjack() {
        this.console = new Console();
        this.jugador = new Jugador();
        this.jugando = false;
    }

    public void jugar() {
        this.prepararPartida();
        this.repartirCartasIniciales();
        this.mostrarEstadoInicial();
        if (!this.jugador.tiene21() && !this.jugador.seHaPasado()) {
            this.gestionarTurno();
        }
        this.mostrarResultadoFinal();
    }

    private void prepararPartida() {
        this.baraja = new Baraja();
        this.jugador = new Jugador();
        jugando = true;
    }

    private void repartirCartasIniciales() {
        this.baraja.darA(this.jugador);
    }

    private void gestionarTurno() {
        while (jugando) {
            int decisionJugador = this.console.readInt("Pedir carta (1) o parar (2): ");

            switch (decisionJugador) {
                case 1 -> {
                    this.jugador.agarrar(this.baraja.sacar());
                    this.jugador.mostrarMano();
                    if (this.jugador.seHaPasado() || this.jugador.tiene21()) {
                        this.jugando = false;
                    }
                }
                case 2 -> this.jugando = false;
                default -> this.console.writeln("Opcion no valida");
            }
        }
    }

    private void mostrarEstadoInicial() {
        this.console.writeln("Mano inicial:");
        this.jugador.mostrarMano();

        if (this.jugador.consultarPuntaje() == 21) {
            this.console.writeln("¡Blackjack!");
        }
    }

    private void mostrarResultadoFinal() {
        this.console.writeln("Puntaje final: " + this.jugador.consultarPuntaje());

        if (this.jugador.seHaPasado()) {
            this.console.writeln("Te has pasado.");
        } else if (this.jugador.tiene21()) {
            this.console.writeln("¡Has conseguido 21!");
        }
    }
}
