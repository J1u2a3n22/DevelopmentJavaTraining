import java.lang.reflect.Array;
import java.util.*;

public class Creativo {
    public static boolean convertirBool(String opcion){
        Boolean result=false;
        switch (opcion){
            case "Si":
            case "si":
                result=true;
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        int count=0;
        Boolean resultadoBool=false;
        Scanner input = new Scanner(System.in);
        List<String> preguntas= new ArrayList<String>();
        List<Boolean> respuestas=new ArrayList<Boolean>() ;
        List<String> respuestasAMostrar= new ArrayList<String>();
        respuestasAMostrar.add("Si");
        respuestasAMostrar.add("No");
        respuestasAMostrar.add("Tal vez");
        String resultado="";
        preguntas.add("El anio tiene 365 dias");
        respuestas.add(true);
        preguntas.add("Las horas laborales deberian ser 8 horas?");
        respuestas.add(true);
        preguntas.add("1 minuto tiene 60 segundos?");
        respuestas.add(true);
        System.out.println("Bienvenido a Creativo");
        while(count<preguntas.size()){
            for (var item: preguntas) {
                System.out.println(item);
                for (var subItem:respuestasAMostrar){
                    System.out.println(subItem);
                }
                System.out.println("Ingrese su opcion por favor ");
                resultado=input.next();
                resultadoBool=convertirBool(resultado);
                if(resultadoBool==false){
                    count=preguntas.size()+2;
                    break;
                }else{
                    System.out.println("Siguiente pregunta");
                }
            }
            count++;
        }
    }
}
