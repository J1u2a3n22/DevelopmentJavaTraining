public class NotasEstudiante2 {
    public static double notas(double notas1,double notas2,double notas3) {
        double Notasparcial=notas1*0.4;
        double Notasparcial2=notas2*0.4;
        double Notasparcial3=notas3*0.4;

        double result=Notasparcial+Notasparcial2+Notasparcial3;
        return result;
    }

    public static void main(String[] args) {
        double NotasFinales=notas(20,30,10.5);
        if(NotasFinales>=36){
            System.out.println("El estudiante aprobo el curso ");
        }
        else{
            System.out.println("El estudiante perdio el curso");
        }
    }
}
