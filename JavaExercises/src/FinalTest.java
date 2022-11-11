import java.util.Scanner;

public class FinalTest {
    public static void main(String[] args) {
        System.out.println("Sistema de aprobacion Nice");
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor ingrese su puntaje final : ");
        int puntaje= input.nextInt();
        if(puntaje>70){
            System.out.println("Aprobado");
        }else{
            System.out.println("No aprobado :(");
        }
    }
}
