public class Cliente {

	
	public static void main(String[] args) {
    System.out.println("=== Pruebas clase Fraccion ===");

    Fraccion a = new Fraccion(1, 2);
    Fraccion b = new Fraccion(3, 4);

    System.out.println("menorQue (1/2 < 3/4): " + a.menorQue(b));
    System.out.println("mayorQue (1/2 > 3/4): " + a.mayorQue(b));
	}
}
