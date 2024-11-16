public  class Cancion {
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