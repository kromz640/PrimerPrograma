//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido a Screen match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan=true;

        float notaDeLaPelicula=(float)8.2;
        float media=(float)(8.2+6.0+9.0)/3;

        System.out.println(media);

        String sinopsis="Matrix es una paradota.La mejor pelicula del fin del milenio fue lanzada en: " + fechaDeLanzamiento;
        System.out.println(sinopsis + "\ncon nota media de:" + media);

        byte clasificacion= (byte) (media/2);

        System.out.println("La clasificacion es: " + clasificacion);


    }
    }
