package Vistas;

import javax.swing.JFrame;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.*;
import java.net.URL;

/**
 * Clase que contiene el frame del programa y la musica.
 */
public class Ventana extends JFrame {
    public static final int ALTO = 800;
    public static final int ANCHO = 1000;
    private static Ventana instancia;
    private PanelPrincipal panelPrincipal;

    /**
     * Constructor personalizado.
     */
    private Ventana(){
        reproducirMusica();
        panelPrincipal = new PanelPrincipal();
        add(panelPrincipal);
        setTitle("Anger's App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1014,816));
        setSize(1014,816);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Método para reproducir la musica.
     */
    private void reproducirMusica() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            URL resourceURL = classLoader.getResource("MusicaDeFondo.wav");
            if (resourceURL == null) {
                System.out.println("El archivo de sonido no se encuentra en el classpath.");
                return;
            }
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(resourceURL);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            FloatControl controlVolumen = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            controlVolumen.setValue(-25.0f);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }


    /**
     * Método para obtener la instancia de la ventana.
     */
    public static synchronized Ventana frame() {
        if (instancia == null) {
            instancia = new Ventana();
        }
        return instancia;
    }
}
