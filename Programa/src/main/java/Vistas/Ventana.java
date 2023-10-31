package Vistas;

import javax.swing.JFrame;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.*;

public class Ventana extends JFrame {
    public static final int ALTO = 800;
    public static final int ANCHO = 1000;
    private static Ventana instancia;
    private PanelPrincipal panelPrincipal;
    private Ventana(){
        reproducirMusica();
        panelPrincipal = new PanelPrincipal();
        add(panelPrincipal);
        setTitle("Anger's App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1016,816));
        setSize(1016,816);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void reproducirMusica() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File archivoMusica = new File(classLoader.getResource("MusicaDeFondo.wav").getFile());
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoMusica);
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

    public static synchronized Ventana frame() {
        if (instancia == null) {
            instancia = new Ventana();
        }
        return instancia;
    }
}