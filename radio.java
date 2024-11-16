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
