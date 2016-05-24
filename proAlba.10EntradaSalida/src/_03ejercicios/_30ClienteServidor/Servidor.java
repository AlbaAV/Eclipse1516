package _03ejercicios._30ClienteServidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor { 
    final static int PUERTO = 5000; 
    public Servidor(){ 
        try{ 
            ServerSocket skServidor = new ServerSocket(PUERTO); 
            System.out.println("Servidor: escuchando en el puerto " + PUERTO); 
            Socket skCliente = skServidor.accept();
            System.out.println("Servidor: Sirviendo a un cliente"); 
            DataOutputStream flujoSal = new DataOutputStream(skCliente.getOutputStream()); 
            DataInputStream flujoEnt = new DataInputStream(skCliente.getInputStream()); 
            //Completar ... 
            int num1 = flujoEnt.readInt();
            int num2 = flujoEnt.readInt();
            
            int res = num1 + num2;
            
            flujoSal.writeInt(res);
            skCliente.close(); 
        }catch (IOException ex) { 
            System.out.println(ex); 
        } 
    } 
    public static void main(String[] args) { 
        new Servidor(); 
    } 
}
