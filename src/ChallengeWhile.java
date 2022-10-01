import java.util.Scanner;

public class ChallengeWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1 ){
            System.out.println("Ingrese una nota: ");
        }
        double promedio = total / cantidadNotas;
        System.out.println("Promedio = " + promedio);

        entrada.close();

    }
}
