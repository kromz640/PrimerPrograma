import java.util.Scanner;

public class ConvertidorTemp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double celcius,farenheit;

        String opcion;
        System.out.println("Convertidor de temperaturas\n");

        System.out.println("Escribe los grados celcius");
        celcius=sc.nextDouble();
        farenheit=(celcius*1.8)+32;
        System.out.println("El temperatura de celcius : " + celcius +
                "en farenheit es: " + (int) farenheit);


    }
}
