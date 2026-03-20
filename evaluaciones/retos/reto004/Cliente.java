public class Cliente {

	
	public static void main(String[] args) {
    System.out.println("=== Pruebas clase Fraccion ===");

    Fraccion a = new Fraccion(1, 2);
    Fraccion b = new Fraccion(3, 4);

    System.out.println("menorQue (1/2 < 3/4): " + a.menorQue(b));
    System.out.println("mayorQue (1/2 > 3/4): " + a.mayorQue(b));

    Fraccion c = new Fraccion(2, 4);
    Fraccion d = new Fraccion(1, 2);

    System.out.println("equals (2/4 == 1/2): " + c.equals(d));
	}
}
