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

    Fraccion suma = new Fraccion(1, 2);
    suma.sumar(new Fraccion(1, 3));

    System.out.println("sumar (1/2 + 1/3 = 5/6): " + suma.equals(new Fraccion(5, 6)));

    Fraccion resta = new Fraccion(3, 4);
    resta.restar(new Fraccion(1, 2));

    System.out.println("restar (3/4 - 1/2 = 1/4): " + resta.equals(new Fraccion(1, 4)));

    Fraccion multiplicacion = new Fraccion(2, 3);
    multiplicacion.multiplicar(new Fraccion(3, 5));

    System.out.println("multiplicar (2/3 * 3/5 = 2/5): " + multiplicacion.equals(new Fraccion(2, 5)));

    Fraccion division = new Fraccion(2, 3);
    division.dividir(new Fraccion(4, 5));

    System.out.println("dividir (2/3 / 4/5 = 5/6): " + division.equals(new Fraccion(5, 6)));

    Fraccion simplificada = new Fraccion(8, 12);
    simplificada.simplificar();

    System.out.println("simplificar (8/12 = 2/3): " + simplificada.equals(new Fraccion(2, 3)));

    Fraccion entero = new Fraccion(5);
    System.out.println("constructor entero (5 = 5/1): " + entero.equals(new Fraccion(5, 1)));
	}
}
