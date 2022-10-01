import java.util.Scanner;

public class ChallengeWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Ingrese una nota(o -1 para salir): ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0){
            total += nota;
            cantidadNotas++;
            }else if(nota != -1){
                System.out.println("Nota inválida!!! ");
            }
        }
        double promedio = total / cantidadNotas;
        System.out.println("Promedio = " + promedio);

        entrada.close();
    }
}
