package modelo;

public class Libro
{
    //Atributos
    private String nombreLibro;
    private String nombreAutor;
    private String lujo;
    private int anioEdicion;

    //Constructor
    public Libro(String pNombreLibro, String pNombreAutor, String pLujo, int pAnioEdicion) //Parametros(int pAnioEdicion)
    {
        this.nombreLibro = pNombreLibro;
        this.nombreAutor = pNombreAutor;
        this.lujo = pLujo;
        this.anioEdicion = pAnioEdicion;
    }

    //Metodos
    public String getNombreLibro()
    {
        return nombreLibro;
    }

    public String getNombreAutor()
    {
        return nombreAutor;
    }

    public String getLujo()
    {
        return lujo;
    }

    public int getAnioEdicion()
    {
        return anioEdicion;
    }

    public static Libro[] crearListaLibros(int numeroLibros) {
        return null;
    }
}
