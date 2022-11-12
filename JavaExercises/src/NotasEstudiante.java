public class NotasEstudiante {
    public static void notas(double notas1,double notas2,double notas3) {
        double Notasparcial=notas1*0.4;
        double Notasparcial2=notas2*0.4;
        double Notasparcial3=notas3*0.4;

        double result=Notasparcial+Notasparcial2+Notasparcial3;
        System.out.println(result);
    }

    public static void main(String[] args) {
        notas(40,40,20);
    }
}
