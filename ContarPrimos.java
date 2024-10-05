import java.util.Scanner;

public class ContarPrimos{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero positivo (a) ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero positivo (b) ");
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Ambos números deben ser enteros positivos");
            scanner.close();
            return;
        }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int contadorPrimos = contarPrimosEntre(a, b);
        System.out.println("La cantidad de números primos entre " + a + " y " + b + " es " + contadorPrimos);
        
        scanner.close();
    }

    private static int contarPrimosEntre(int a, int b) {
        int contador = 0;
        for (int i = a; i <= b; i++) {
            if (esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
