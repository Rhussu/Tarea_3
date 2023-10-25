package Vistas;

public interface FrameSize {
    default int frameY(double multiplicador,int agregado) {
        return (int) (Ventana.frame().windowSize().getHeight() * multiplicador) + agregado;
    }

    default int frameY(int agregado) {
        return (int) Ventana.frame().windowSize().getHeight() + agregado;
    }

    default int frameY() {
        return (int) Ventana.frame().windowSize().getHeight();
    }

    default int frameX(double multiplicador, int agregado) {
        return (int) (Ventana.frame().windowSize().getWidth() * multiplicador) + agregado;
    }

    default int frameX(int agregado) {
        return (int) Ventana.frame().windowSize().getWidth() + agregado;
    }

    default int frameX() {
        return (int) Ventana.frame().windowSize().getWidth();
    }
}
