package reto003;

import java.util.Scanner;

public class BuscaMinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    

        int[][] mapa = {
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
        };
        
     
        
        final int SOLDADOS_TOTALES = 1;
    
        colocarSoldados(SOLDADOS_TOTALES, mapa);

        final int TURNOS_TOTALES = 5;
        boolean seguirJugando = true;
        
       
   
        int turno = 0;
        
  
            do {
                imprimir(mapa);
                despejarNiebla(scanner, mapa);
                boolean halladosTodos = soldadosEncontrados(mapa, SOLDADOS_TOTALES);
                turno ++;
                seguirJugando = turno < TURNOS_TOTALES && !halladosTodos;
            } while (seguirJugando);
        
        
        scanner.close();
    }
    
    

    static void colocarSoldados(int numero, int[][] mapa) {
        boolean terminado = false;
        int soldadosColocados = 0;

        do {
            int x = (int)(Math.random()*mapa.length);
            int y = (int)(Math.random()*mapa.length);

            if (mapa[x][y] != -2) {
                 mapa[x][y] = -2;
                 soldadosColocados = soldadosColocados + 1;
            }
            terminado = soldadosColocados >= numero;
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
    
    

    static void despejarNiebla(Scanner scanner, int[][] mapa) {
        int[] cordenada = pedirCoordenadas(scanner, mapa);

        int x = cordenada[1];
        int y = cordenada[0];

        if (mapa[y][x] < 0) {
            mapa[y][x] = mapa[y][x] * -1;
        } else {
            mapa[y][x] = mapa[y][x];
        }
    }
    
    

    static boolean soldadosEncontrados (int[][] mapa, int cantidad){
        int soldadosEncontrados = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 2) {
                    soldadosEncontrados++;
                }
            }
        }
        return soldadosEncontrados == cantidad;
    }
    
}

}
