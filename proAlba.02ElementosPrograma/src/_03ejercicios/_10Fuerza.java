package _03ejercicios;
 import java.util.*;  
public class _10Fuerza {
     public static void main(String args[]){
     Scanner tec = new Scanner(System.in);
     
     
    System.out.println("Inserte m1");
    double m1 = tec.nextDouble();
    System.out.println("Inserte m2");
    double m2 = tec.nextDouble();
    System.out.println("Inserte una distancia");
     double d = tec.nextDouble();
     
    final double G = 6.693E-11; //constante//
     
     System.out.println("Fuerza: " + (m1*m2*G)/(d*d));
   
     
     /* variable: Espacio de memoria en el que guardamos un valor
        constante: Una especie de variable que nunca cambia de valor 
     */
    
    
    
    
    
    
   
    
    
    
    
     }     
     
} 