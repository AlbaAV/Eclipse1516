package _03ejercicios;
import java.util.*;
public class _09Segundos2 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("Introduzca una cantidad de segundos");

        int segundos = tec.nextInt();
        int dias, horas, minutos;
        
        //Segundos que quedan por repartir
        int restoSeg = segundos; 
        
        //Dias
        dias = restoSeg / (24*60*60);
        restoSeg = restoSeg % (24*60*60);
        
        //Horas 
        horas = restoSeg / (60*60);
        restoSeg = restoSeg % (60*60);
        
        //Minutos
        minutos = restoSeg / 60;
        restoSeg = restoSeg % 60;
        
        System.out.println("En " + segundos + " segudos hay \n" +
                            dias + " dias\n"+
                            horas + " horas\n" +
                            minutos + " minutos\n" + 
                            restoSeg + " segundos");
    }
}
