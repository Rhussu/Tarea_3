package Vistas;

public interface FrameSize {
    default int frameHeight(double multiplicador,int agregado) {
        return (int) (Ventana.frame().windowSize().getHeight() * multiplicador) + agregado;
    }

    default int frameHeight(int agregado) {
        return (int) Ventana.frame().windowSize().getHeight() + agregado;
    }

    default int frameHeight() {
        return (int) Ventana.frame().windowSize().getHeight();
    }

    default int frameWidth(double multiplicador, int agregado) {
        return (int) (Ventana.frame().windowSize().getWidth() * multiplicador) + agregado;
    }

    default int frameWidth(int agregado) {
        return (int) Ventana.frame().windowSize().getWidth() + agregado;
    }

    default int frameWidth() {
        return (int) Ventana.frame().windowSize().getWidth();
    }
}
