import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        boolean cancion=true;
        Scanner repeticion=new Scanner(System.in);
        while (cancion){
            System.out.println("Will you off repeat this song if yes type Yes");
            String Userinput=repeticion.next();
            if(Userinput.equals("yes")){
                cancion=false;
                System.out.println("Current song");
            }
            System.out.println("Playing next song");
        }
        
    }
}

