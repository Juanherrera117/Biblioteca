package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Libro;
import vista.DialogoNumeroLibros;
import vista.PanelEntradaDatos;
import vista.PanelOperaciones;
import vista.PanelResultados;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener 
{
    private VentanaPrincipal miVentanaPrincipal;
    private Libro[] miListaLibros;
    private int numeroLibros;
    private int indice;

    public Controlador(VentanaPrincipal miVentanaPrincipal, Libro modelo) 
    {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.miVentanaPrincipal.miDialogoNumeroLibros.btnAceptar.addActionListener(this);
        PanelOperaciones.btnCalcular.addActionListener(this);
        PanelOperaciones.btnCrear.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.btnBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando.equals("aceptarVentana")) 
        {
            indice = 0;
            numeroLibros = Integer.parseInt(DialogoNumeroLibros.getLibros());
            PanelResultados.mostrarResultados("La Bilioteca tiene " + numeroLibros + " libros en total!\n");
            miListaLibros = Libro.crearListaLibros(numeroLibros);
            miVentanaPrincipal.miDialogoNumeroLibros.cerrarDialogo();
            PanelOperaciones.desactivarBotonCalcular();
        }
    
        else if (comando.equals("crearLibro")) 
        {
            if (indice <= numeroLibros - 1) 
            {
                String nombreLibro = PanelEntradaDatos.getTfNombreLibro();
                String nombreAutor = PanelEntradaDatos.getTfNombreAutor();
                String lujo = PanelEntradaDatos.getTfLujo();
                int anioEdicion = Integer.parseInt(PanelEntradaDatos.getTfAnioEdicion());
                Libro miLibro = new Libro(nombreLibro, nombreAutor, lujo, anioEdicion);
                miListaLibros[indice] = miLibro;
                PanelResultados.mostrarResultados("El libro " + nombreLibro + );
            }

        } 
        
        else if (comando.equals("borrarTexto")) 
        {
            vista.PanelEntradaDatos.borrarTf();
        } 
        
        else if (comando.equals("cerrarVentana")) 
        {
            JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Biblioteca",
            JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
}
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // TODO Auto-generated method stub
        
    }
}
