
package spp.cbarragánc.t01;
import java.util.Scanner;


/**
 *
 * @author Carlos Javier Barragán Carrión
 * Matrícula: A01410357
 * Carrera: IMT
 */
public class SPPCBarragánCT01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cal1, cal2, cal3, cal4, cal5, promedio;
        int matricula;
        matricula = pedirMatricula();
        cal1 = pedirC1();
        cal2 = pedirC2();
        cal3 = pedirC3();
        cal4 = pedirC4();
        cal5 = pedirC5();
        promedio = calcularPromedio(cal1, cal2, cal3, cal4, cal5);
        imprimirBoleta(matricula, cal1, cal2, cal3, cal4, cal5, promedio);
    }
    
    public static int pedirMatricula(){
        int matricula;
        System.out.println("Introduce la matricula sin A0:");
        Scanner entradaMatricula = new Scanner(System.in);
        matricula = entradaMatricula.nextInt();
        return matricula;
    }
    
    public static double pedirC1(){
        double cal1;
        System.out.println("Introduce la calificacion 1:");
        Scanner entradaC1 = new Scanner(System.in);
        cal1 = entradaC1.nextDouble();
        return cal1;
    }
    
    public static double pedirC2(){
        double cal2;
        System.out.println("Introduce la calificacion 2:");
        Scanner entradaC2 = new Scanner(System.in);
        cal2 = entradaC2.nextDouble();
        return cal2;
    }
    
    public static double pedirC3(){
        double cal3;
        System.out.println("Introduce la calaificacion 3:");
        Scanner entradaC3 = new Scanner(System.in);
        cal3 = entradaC3.nextDouble();
        return cal3;
    }
    
    public static double pedirC4(){
        double cal4;
        System.out.println("Introduce la calificacion 4:");
        Scanner entradaC4 = new Scanner(System.in);
        cal4 = entradaC4.nextDouble();
        return cal4;
    }
    
    public static double pedirC5(){
        double cal5;
        System.out.println("Introduce la calificacion 5:");
        Scanner entradaC5 = new Scanner(System.in);
        cal5 = entradaC5.nextDouble();
        return cal5;
    }
    
    public static double calcularPromedio(double c1, double c2, double c3, double c4, double c5){
        double promedio;
        promedio = ((c1 + c2 +c3 + c4 +c5)/(5));
        return promedio;
    }
    
    public static void imprimirBoleta(int matricula, double c1, double c2, double c3, double c4, double c5, double promedio){
        System.out.println("BOLETA DE CALIFICACIONES");
        System.out.println("Calificacion 1 = " + c1);
        System.out.println("Calificacion 2 = " + c2);
        System.out.println("Calificacion 3 = " + c3);
        System.out.println("Calificacion 4 = " + c4);
        System.out.println("Calificacion 5 = " + c5);
        System.out.println("Promedio = " + promedio);
        if (promedio>=70){
            System.out.println("Curso = APROBADO");
        } else { 
            System.out.println("Curso = REPROBADO");
        }
    }
}
