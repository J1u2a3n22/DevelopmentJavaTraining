import java.util.Scanner;

public class anuncio {
    public static void alerta(){
        System.out.println("Anuncion Importante");
        System.out.println("Por favor presione enter y luego una tecla para el inicio del anuncio");

        Scanner input=new Scanner(System.in);
        input.next();
        System.out.println("Fin de anuncio");

    }
    public static void main(String[] args) {
        alerta();
        System.out.println("Fin transmision");

    }
}
