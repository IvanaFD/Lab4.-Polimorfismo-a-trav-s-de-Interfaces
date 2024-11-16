import java.util.ArrayList;
import java.util.List;

public class Radio {
    // Atributos de la radio
    private boolean estado;
    private int volumen;
    private String modoActual;
    private String banda;
    private double frecuencia;
    private List<Emisora> emisorasGuardadas;
    private List<Cancion> listaReproduccion;
    private boolean telefonoConectado;
    private String estadoLlamada;
    private String pronosticoTiempo;

    public Radio() {
        this.estado = false;
        this.volumen = 10;
        this.modoActual = "Radio";
        this.banda = "FM";
        this.frecuencia = 87.5;
        this.emisorasGuardadas = new ArrayList<>();
        this.listaReproduccion = new ArrayList<>();
        this.telefonoConectado = false;
        this.estadoLlamada = "Sin llamada";
        this.pronosticoTiempo = "Soleado";
    }

    // Métodos de la interfaz IRadio
    public void encender() {
        this.estado = true;
    }

    public void apagar() {
        this.estado = false;
    }

    public void cambiarVolumen(int ajuste) {
        this.volumen = Math.max(0, this.volumen + ajuste);
    }

    public void cambiarModo(String nuevoModo) {
        this.modoActual = nuevoModo;
    }

    public void cambiarBanda() {
        this.banda = this.banda.equals("FM") ? "AM" : "FM";
    }

    public void cambiarEmisora(double ajuste) {
        this.frecuencia += ajuste;
    }

    public void guardarEmisora(double frecuencia) {
        emisorasGuardadas.add(new Emisora(frecuencia, this.banda, ""));
    }

 public void cargarEmisora(int posicion) {
        if (posicion >= 0 && posicion < emisorasGuardadas.size()) {
            Emisora emisora = emisorasGuardadas.get(posicion);
            this.frecuencia = emisora.getFrecuencia();
            this.banda = emisora.getBanda();
        }
    }

    // Métodos de la interfaz ICarTipoC
    public void cambiarLlamadaEnEspera() {
        this.estadoLlamada = this.estadoLlamada.equals("En espera") ? "Conectada" : "En espera";
    }

    public void verPronosticoDelTiempo() {
        // Este método no realiza acciones en esta implementación.
    }

    // Clase interna para Cancion
    public static class Cancion {
        private String nombre;
        private int duracion;
        private String autor;
        private String genero;

        public Cancion(String nombre, int duracion, String autor, String genero) {
            this.nombre = nombre;
            this.duracion = duracion;
            this.autor = autor;
            this.genero = genero;
        }