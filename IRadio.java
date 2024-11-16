public interface IRadio {
    void encender();
    void apagar();
    void cambiarVolumen(int ajuste);
    void cambiarModo(String nuevoModo);
    void cambiarBanda();
    void cambiarEmisora(double ajuste);
    void guardarEmisora(double frecuencia);
    void cargarEmisora(int posicion);
}