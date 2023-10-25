package Vistas;

public interface FrameSize {
    default int frameY() {
        return (int) Ventana.frame().windowSize().getHeight();
    }

    default int frameX() {
        return (int) Ventana.frame().windowSize().getWidth();
    }
}
