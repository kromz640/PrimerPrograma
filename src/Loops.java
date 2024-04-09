import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double nota=0;
        int i=0;

        for (i = 0; i < 3; i++)
        {
            System.out.println("Escribe la nota que darias a la pelicula matrix");
            nota += teclado.nextDouble();
        }

        System.out.println("La media de evualaciones es: " + nota/i);
    }
}
