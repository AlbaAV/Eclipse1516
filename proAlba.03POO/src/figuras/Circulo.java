package figuras;
import java.awt.*;

/**
 * Figura que representa un circulo en el plano. El circulo tiene determinado
 * color y posicion y, ademas, unas dimensiones: el radio.
 * La posicion corresponde con el centro de la figura.
 * @author Javi Garcia
 */
public class Circulo extends Figura{
    private int radio;
    /**
     * Permite crear un circulo indicando su color, su posicion en el plano y su radio.
     * @param color Color de la figura. Ha de ser uno de los colores validos definidos: ROJO, AMARILLO, VERDE o AZUL
     * @param centroX Posicion del centro de  la figura en el eje horizontal o de las X
     * @param centroY Posicion del centro de  la figura en el eje vertical o de las Y
     * @param radio Tamanyo del circulo: longitud del radio.
     */
    public Circulo(int color,int centroX, int centroY, int radio){
        super(color,centroX,centroY);
        this.radio = radio;
    }
   
    /**
     * Permite crear un circulo indicando su posicion en el plano y su radio. Su color sera AZUL
     * @param centroX Posicion del centro de la figura en el eje horizontal o de las X
     * @param centroY Posicion del centrode la figura en el eje vertical o de las Y
     * @param radio Tamanyo del circulo: longitud del radio.
     */
    public Circulo(int centroX, int centroY, int radio){
        super(centroX,centroY);
        this.radio = radio;
    }

    /**
     * Devuelve el radio del circulo
     * @return el radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * Permite modificar el radio del circulo
     * @param radio El nuevo valor del radio
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }
     /**
     * Dibuja el circulo
     * @param g La ventana grafica sobre la que se dibuja
     */
    public void dibujar(Graphics g){
        g.setColor(COLORES[getColor()]);
        g.fillOval(getPosx() - getRadio(), getPosy() - getRadio(), getRadio()*2, getRadio()*2);
    }
    
    public static double area(double r){
        return Math.PI*r*r;
    }
}
