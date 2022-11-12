import java.util.Scanner;

public class CaculadoraSalarios {

    int cantidaSemanasAnio=52;
    double totalHorasLaborales52Semanas=2080;

    public double obtenerSalarioBrutoAnual(double horasTrabajadas,double cantidadDineroTrabajadas){
        double totalHorasTrabajadasAnual=cantidaSemanasAnio*horasTrabajadas;
        return cantidadDineroTrabajadas*totalHorasTrabajadasAnual;
    }

    public double obtenerSalarioBrutoAnual(double horasTrabajadas,double cantidadDineroTrabajadas,boolean contar,int diasVacaciones){
        double horasVacaciones=diasVacaciones*24;
        double result;
        double totalHorasTrabajadasAnual=cantidaSemanasAnio*horasTrabajadas;
        if(contar){
            result=cantidadDineroTrabajadas*totalHorasTrabajadasAnual;
        }
        else{
            result=cantidadDineroTrabajadas*(totalHorasTrabajadasAnual-horasVacaciones);
        }
        return result;
    }


    public static void main(String[] args) {
        CaculadoraSalarios calculadora= new CaculadoraSalarios();
        Scanner scaner=new Scanner(System.in);
        double horatrabajadaPorSemana=0.0,dineroPorHora=0.0;
        int diasVacaciones=0;
        String contar;
        Boolean contarBool=false;
        while(horatrabajadaPorSemana<=0.0){
            System.out.println("Ingrese las horas que trabajara el empleado por semana: ");
            horatrabajadaPorSemana=scaner.nextDouble();
            if(horatrabajadaPorSemana==0.0){
                System.out.println("Debe ingresar un numero mayor a 0");
            }
        }
        while(dineroPorHora<=0.0){
            System.out.println("Ingrese la cantidad de dinero que se paga por hora: ");
            dineroPorHora=scaner.nextDouble();
            if(dineroPorHora==0.0){
                System.out.println("Debe ingresar un numero mayor a 0");
            }
        }
        while(diasVacaciones<=0){
            System.out.println("Ingrese los dias de vacaciones del empleado: ");
            diasVacaciones=scaner.nextInt();
            System.out.println("Desea contar estos dias para el pago?: ");
            contar=scaner.next();
            switch (contar){
                case "Si":
                case "si":
                case "Yes":
                case "yes":
                    contarBool=true;
                    break;
                case "No":
                case "no":
                    contarBool=false;
                    break;
            }
        }
        double result=calculadora.obtenerSalarioBrutoAnual(horatrabajadaPorSemana,dineroPorHora,contarBool,diasVacaciones);
        System.out.println("El resultado total de su salario bruto es: "+ result);

    }



}
