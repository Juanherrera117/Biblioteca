package modelo;

public class Coleccion extends Libro
{
    //Atributos
    public String nombreColeccion;

    //Constructor
    public Coleccion(String pNombreLibro, String pNombreAutor,String pLujo, int pAnioEdicion)
    {
        super(pNombreLibro, pNombreAutor, pLujo, pAnioEdicion);
    }

    public String getColeccion()
    {
        return nombreColeccion;
    }

    
}
