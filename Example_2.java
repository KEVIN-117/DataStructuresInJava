
import java.text.DecimalFormat;
import java.util.Scanner;
public class Example_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double suma = 0;
        double contador = 0;
        while (contador < n) {            
            double number = input.nextInt();
            suma += number;
            contador++;  
        }
        DecimalFormat format = new DecimalFormat("#.####");
        System.out.println(format.format((suma/contador)));
    }
}
