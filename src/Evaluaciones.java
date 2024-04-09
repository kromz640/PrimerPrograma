import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota=0;
        double mediaEvaluacion = 0;
        byte contador = 0;

        while (contador < 3)
        {
            System.out.println("Escribe la nota que darias a la pelicula matrix");
            nota += teclado.nextDouble();
            contador++;
        }

        System.out.println("La media de evualaciones es: " + nota / contador);

    }
}
