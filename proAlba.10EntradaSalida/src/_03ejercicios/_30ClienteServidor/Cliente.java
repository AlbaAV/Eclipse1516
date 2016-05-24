package _03ejercicios._30ClienteServidor;
import java.io.*; 
import java.net.*;
import java.util.Scanner; 
public class Cliente { 
    final static String HOST = "localhost"; 
    final static int PUERTO = 5000; 
    public Cliente()
    { 
    	Scanner tec = new Scanner(System.in);
        boolean terminar = false; 
        while(!terminar)
        { 
            try
            {             	           
                System.out.println("Cliente: Esperando conexión con el servidor"); 
                Socket skCliente = new Socket(HOST,PUERTO); 
                DataInputStream flujoEnt = new DataInputStream(skCliente.getInputStream()); 
                DataOutputStream flujoSal = new DataOutputStream(skCliente.getOutputStream()); 
               //Completar  ...    ... 
                System.out.println("Introduce numeros para sumar");
                int num1 = tec.nextInt();
                int num2 = tec.nextInt();
                
                flujoSal.writeInt(num1);
                flujoSal.writeInt(num2);
                
                int res = flujoEnt.readInt();
                System.out.println(res);
                skCliente.close(); 
                terminar = true; 
            
            }catch (ConnectException ex){ 
                try
                { 
                    Thread.currentThread().sleep(300); 
                }catch (InterruptedException ie){ 
                    System.out.println(ie); 
                } 
            }catch (IOException ex){ 
               System.out.println(ex); 
               terminar = true; 
            
            } 
        } 
    } 
    public static void main(String[] args) { 
        new Cliente(); 
    } 
}