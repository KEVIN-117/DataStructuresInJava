
import java.util.Scanner;
public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int aux = 1;
        int facrorial = aux;
        while (aux < number) {    
            aux++;
            facrorial = facrorial*aux;
        }
        System.out.print(facrorial);
    }
}
