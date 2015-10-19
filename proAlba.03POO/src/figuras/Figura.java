package figuras;
import java.awt.*;

/**
 * Esta clase se implementa para contener los aspectos comunes a todas las figuras.
 * Una figura es un objeto que puede anyadirse a una Pizarra. Las figuras anyadidas a
 * una Pizarra aparecen dibujadas en ella.
 * Se trata de una clase abstracta que podemos extender para crear nuevas clases
 * que representen Figuras tal y como se ha hecho con las clases Circulo o Cuadrado.
 * @author Javi Garcia
 */
public abstract class Figura {


    /**
     * Constante entera: Representa al color rojo.
     */
    public final static int ROJO = 0;

    /**
     * Constante entera: Representa al color amarillo
     */
    public final static int AMARILLO = 1;

    /**
     * Constante entera: Representa al color verde
     */
    public final static int VERDE = 2;

    /**
     * Constante entera: Representa al color azul
     */
    public final static int AZUL = 3;

    protected final static Color COLORES[]={Color.RED,Color.YELLOW,Color.GREEN,Color.BLUE};
    
    //Atributos
    protected int color;
    protected int posx;
    protected int posy;

    /**
     * Constructor de la clase Figura. Permite crear una figura indicando su color y su posicion en el plano
     * @param color Color de la figura. Ha de ser uno de los colores validos definidos: ROJO, AMARILLO, VERDE o AZUL
     * @param posicionX Posicion de la figura en el eje horizontal o de las X
     * @param posicionY Posicion de la figura en el eje vertical o de las Y
     */
    public Figura(int color,  int posicionX, int posicionY){
        this.color = color;
        this.posx = posicionX;
        this.posy = posicionY;
    }

    /**
     * Permite crear una figura indicando su posicion en el plano. La figura tendra color AZUL
     * @param posicionX Posicion de la figura en el eje horizontal o de las X
     * @param posicionY Posicion de la figura en el eje vertical o de las Y
     */
    public Figura(int posicionX, int posicionY){
        this(AZUL,posicionX,posicionY);
    }

    /**
     * Devuelve el color de la figura.
     * @return el color
     */
    public int getColor() {
        return color;
    }

    /**
     * Permite modificar el color de la figura
     * @param color el nuevo color de la figura
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * Devuelve la posicion de la figura en el eje de las X
     * @return la posicion en el eje de las X
     */
    public int getPosx() {
        return posx;
    }

    /**
     * Permite modificar la posicion de la figura en el eje de las X
     * @param posx La nueva coordenada X
     */
    public void setPosx(int posx) {
        this.posx = posx;
    }

    /**
     * Devuelve la posicion de la figura en el eje de las Y
     * @return la posicion en el eje de las Y
     */
    public int getPosy() {
        return posy;
    }

    /**
     * Permite modificar la posicion de la figura en el eje de las Y
     * @param posy La nueva coordenada Y
     */
    public void setPosy(int posy) {
        this.posy = posy;
    }

    /**
     * Dibuja la figura
     * @param g La ventana grafica sobre la que se dibuja
     */
    public abstract void dibujar(Graphics g);
}
