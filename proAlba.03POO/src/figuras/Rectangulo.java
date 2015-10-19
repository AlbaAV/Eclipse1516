package figuras;
import java.awt.*;
/**
 * Figura que representa un rectangulo en el plano. El rectangulo tiene determinado
 * color y posicion y, ademas, unas dimensiones: longitud y anchura.
 * La posicion corresponde con el limite superior izquierdo de la figura.
 * @author Javi Garcia
 */
public class Rectangulo extends Figura{
    private int anchura, altura;
    /**
     * Permite crear un rectangulo indicando su color, su posicion en el plano y sus dimensiones.
     * @param color Color de la figura. Ha de ser uno de los colores validos definidos: ROJO, AMARILLO, VERDE o AZUL
     * @param posicionX Posicion de la figura en el eje horizontal o de las X
     * @param posicionY Posicion de la figura en el eje vertical o de las Y
     * @param anchura  Dimensiones del rectangulo en la horizontal del plano
     * @param altura Dimensiones del rectangulo en la vertical del plano
     */
    public Rectangulo(int color,int posicionX, int posicionY, int anchura, int altura){
        super(color, posicionX, posicionY);
        this.anchura = anchura;
        this.altura = altura;
    }

    /**
     * Permite crear un rectangulo indicando su posicion en el plano y sus dimensiones. Su color sera AZUL
     * @param posicionX Posicion de la figura en el eje horizontal o de las X
     * @param posicionY Posicion de la figura en el eje vertical o de las Y
     * @param anchura  Dimensiones del rectangulo en la horizontal del plano
     * @param altura Dimensiones del rectangulo en la vertical del plano
     */
    public Rectangulo(int posicionX, int posicionY, int anchura, int altura){
        super(posicionX, posicionY);
        this.anchura = anchura;
        this.altura = altura;
    }
    /**
     * Devuelve la anchura del rectangulo
     * @return la anchura
     */
    public int getAnchura() {
        return anchura;
    }

    /**
     * Devuelve la altura del rectangulo
     * @return la altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Permite modificar la anchura del rectangulo
     * @param anchura la nueva anchura
     */
    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    /**
     * permite modificar la altura del rectangulo
     * @param altura la nueva altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Dibuja el rectangulo
     * @param g La ventana grafica sobre la que se dibuja
     */
    public void dibujar(Graphics g){
        g.setColor(COLORES[getColor()]);
        g.fillRect(getPosx(), getPosy(), getAnchura(), getAltura());
   
    }
    
    public double area(){
        return altura * anchura;
    }
}
