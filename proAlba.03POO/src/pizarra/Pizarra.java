package pizarra;

import java.awt.*;

import javax.swing.*;

import figuras.*;

import java.util.*;

/**
 * Una pizarra es una ventana sobre la que se pueden anyadir figuras.
 * Las figuras que se anyaden a la Pizarra aparecen dibujadas en ella.
 * @author Javi Garcia
 */
public class Pizarra extends JFrame {

    private final static int MINANCHO = 200, MAXANCHO = 800;
    private final static int MINALTO = 200, MAXALTO = 600;
    private ArrayList<Figura> listaFiguras;
    
    private int anchura,altura;
    

    /**
     * Crea una pizarra con un titulo y unas dimensiones determinadas
     * @param titulo Titulo de la ventana
     * @param ancho Anchura de la ventana en pixels
     * @param alto Altura de la ventana en pixels
     */
    public Pizarra(String titulo, int ancho, int alto) {
        super(titulo);
        this.anchura = ancho;
        this.altura = alto;
        listaFiguras = new ArrayList<Figura>();
        setContentPane(initPanel());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        //Hasta que no esta visible, getInsets no devuelve valores correctos.
        ancho += getInsets().left+getInsets().right;
        alto += getInsets().top+getInsets().bottom;
        setSize(ancho, alto);
    }
    /**
     * Crea una pizarra con un titulo por defecto y dimensiones aleatorias
     */
    public Pizarra() {
        this("Pizarra tamanyo aleatorio", 
        		MINANCHO + (int)(Math.random()*(MAXANCHO-MINANCHO)),
        		MINALTO + (int)(Math.random()*(MAXALTO-MINALTO)));
    }
    /**
     * Anyade a la pizarra una figura. AÃ±adir una figura a la pizarra implica que 
     * se mostrara en ella. Para ello Pizarra llama al metodo dibujar de las 
     * figuras que contiene.
     * @param figura La Figura que se anyade a la pizarra.
     */
    public void anyadir(Figura figura) {
        this.listaFiguras.add(figura);
        repaint();
    }
    /**
     * Quita de la pizarra una figura. Quitar una figura de la pizarra implica que dejará
     * de mostrarse en ella. 
     * @param figura La figura que se quita de la pizarra
     */
    public void quitar(Figura figura) {
        this.listaFiguras.remove(figura);
        repaint();
    }
    
    /**
     * Mantiene la pizara en espera, sin refrescarla, hasta que el usuario pulsa aceptar
     * en el cuadro de dialogo que se le muestra.
     */
    public void esperar() {
        JOptionPane.showMessageDialog(null, "Esperando ....");
        repaint();
    }
    /**
     * Mantiene la pizara en espera, sin refrescarla, durante el numero de milisegundos indicado.
     */
    public void esperar (int milisegundos) {
    	try {
			Thread.sleep(milisegundos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        repaint();
    }
    /**
     * Devuelve la anchura en pixels de la pizarra
     * @return la anchura en pixels
     */
    public int getAnchura(){
    	return anchura;
    }
    /**
     * Devuelve la altura en pixels de la pizarra
     * @return la altura en pixels
     */
    public int getAltura(){
    	return altura;
    }

    private JPanel initPanel() {
        JPanel jp = new JPanel() {
            // sobreescritura de paintComponent

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                for (int i = 0; i < listaFiguras.size(); i++) {
                    Figura f = listaFiguras.get(i);
                    f.dibujar(g);
                }
            }
        };
        return jp;
    }
}
