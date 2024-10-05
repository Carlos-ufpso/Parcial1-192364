import java.util.Scanner;

public class ProductoMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la primera matriz  ");
        int filasA = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la primera matriz  ");
        int columnasA = scanner.nextInt();
        
        int[][] matrizA = new int[filasA][columnasA];
        System.out.println("Ingrese los elementos de la primera matriz ");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]  ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Ingrese el número de filas de la segunda matriz ");
        int filasB = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la segunda matriz ");
        int columnasB = scanner.nextInt();

        if (columnasA != filasB) {
            System.out.println("Las matrices no se pueden multiplicar, el número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            scanner.close();
            return;
        }

        int[][] matrizB = new int[filasB][columnasB];
        System.out.println("Ingrese los elementos de la segunda matriz ");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]  ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        int[][] producto = new int[filasA][columnasB];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                producto[i][j] = 0;
                for (int k = 0; k < columnasA; k++) {
                    producto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        
        System.out.println("El producto de las matrices es ");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(producto[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}