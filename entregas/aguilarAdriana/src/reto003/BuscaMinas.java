package reto003;

import java.util.Scanner;

public class BuscaMinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mapa = {
            {-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1},
            
        };
        
     
        
        final int MINAS_TOTALES = 5;
    
        colocarMinas(MINAS_TOTALES, mapa);

        final int TURNOS_TOTALES = 5;
        boolean seguirJugando = true;
        
       
   
        int turno = 0;
        
  
            do {
                imprimir(mapa);
                revelarCasilla(scanner, mapa);
                boolean todasLibres = minasEncontradas(mapa, MINAS_TOTALES);
                turno ++;
                seguirJugando = turno < TURNOS_TOTALES && !todasLibres;
            } while (seguirJugando);
        
        
        scanner.close();
    }
    
    

    static void colocarMinas(int numero, int[][] mapa) {
        boolean terminado = false;
        int minasColocadas = 0;

        do {
            int x = (int)(Math.random()*mapa.length);
            int y = (int)(Math.random()*mapa[0].length);

            if (mapa[x][y] != -2) {
                 mapa[x][y] = -2;
                 minasColocadas = minasColocadas + 1;
            }
            terminado = minasColocadas >= numero;
        } while (!terminado);
    }
    
    
 
    static void imprimir ( int[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++){
                System.out.print(mapear(mapa[i][j]));
            }
            System.out.println();
        }
    }
    
    

    static String mapear( int casilla) {

        String[] simbolos = {
            "?",
            "~",
            "|o/"
        };
        
        return casilla < 0 ? simbolos[0] : simbolos[casilla];
        
    }
    
    

    static int[] pedirCoordenadas(Scanner scanner, int[][] mapa) {
        System.out.println("Ingresa la coordenada x: ");
        int x = scanner.nextInt() - 1;
        System.out.println("Ingresa la coordenada y: ");
        int y = scanner.nextInt() - 1;
        return new int[] {y, x};
    }
    
    

    static void revelarCasilla(Scanner scanner, int[][] mapa) {
        int[] coordenada = pedirCoordenadas(scanner, mapa);

        int x = coordenada[1];
        int y = coordenada[0];

        if (mapa[y][x] < 0) {
            mapa[y][x] = mapa[y][x] * -1;
        } else {
            mapa[y][x] = mapa[y][x];
        }
    }
    
    

    static boolean minasEncontradas (int[][] mapa, int cantidad){
        int minasEncontradas = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 2) {
                    minasEncontradas++;
                }
            }
        }
        return minasEncontradas == cantidad;
    }
    
}


