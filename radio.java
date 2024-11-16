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

// Getters
        public String getNombre() { return nombre; }
        public int getDuracion() { return duracion; }
        public String getAutor() { return autor; }
        public String getGenero() { return genero; }
    }

    // Clase interna para Emisora
    private static class Emisora {
        private double frecuencia;
        private String banda;
        private String nombre;

        public Emisora(double frecuencia, String banda, String nombre) {
            this.frecuencia = frecuencia;
            this.banda = banda;
            this.nombre = nombre;
        }

        public double getFrecuencia() { return frecuencia; }
        public String getBanda() { return banda; }
    }

     // Getters para la radio
    public boolean isEstado() { return estado; }
    public int getVolumen() { return volumen; }
    public String getModoActual() { return modoActual; }
    public String getBanda() { return banda; }
    public double getFrecuencia() { return frecuencia; }
    public List<Emisora> getEmisorasGuardadas() { return emisorasGuardadas; }
    public List<Cancion> getListaReproduccion() { return listaReproduccion; }
    public boolean isTelefonoConectado() { return telefonoConectado; }
    public String getEstadoLlamada() { return estadoLlamada; }
    public String getPronosticoTiempo() { return pronosticoTiempo; }
}