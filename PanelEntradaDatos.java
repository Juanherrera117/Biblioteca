package vista;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelEntradaDatos extends JPanel 
{
    private JLabel lbTitulo;
    private JLabel lbNombreLibro;
    private JLabel lbNombreAutor;
    private JLabel lbLujo;
    private JLabel lbAnioEdicion;
    private static JTextField tfNombreLibro;
    private static JTextField tfNombreAutor;
    private static JTextField tfLujo;
    private static JTextField tfAnioEdicion;

    public PanelEntradaDatos() 
    {
        lbTitulo = new JLabel(" BIBLIOTECA ", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(0, 10, 572, 30);
        this.add(lbTitulo);

        lbNombreLibro = new JLabel("Nombre =");
        lbNombreLibro.setFont(new Font("Serif", Font.PLAIN, 18));
        lbNombreLibro.setForeground(Color.BLACK);
        lbNombreLibro.setBounds(240, 60, 480, 30);
        this.add(lbNombreLibro);

        tfNombreLibro = new JTextField();
        tfNombreLibro.setFont(new Font("Arial", Font.PLAIN, 18));
        tfNombreLibro.setForeground(Color.BLACK);
        tfNombreLibro.setBounds(365, 60, 190, 30);
        this.add(tfNombreLibro);

        lbNombreAutor = new JLabel("Autor =");
        lbNombreAutor.setFont(new Font("Serif", Font.PLAIN, 18));
        lbNombreAutor.setForeground(Color.BLACK);
        lbNombreAutor.setBounds(240, 100, 480, 30);
        this.add(lbNombreAutor);

        tfNombreAutor = new JTextField();
        tfNombreAutor.setFont(new Font("Arial", Font.PLAIN, 18));
        tfNombreAutor.setForeground(Color.BLACK);
        tfNombreAutor.setBounds(365, 100, 190, 30);
        this.add(tfNombreAutor);

        lbLujo = new JLabel("¿De lujo? =");
        lbLujo.setFont(new Font("Serif", Font.PLAIN, 18));
        lbLujo.setForeground(Color.BLACK);
        lbLujo.setBounds(240, 140, 480, 30);
        this.add(lbLujo);

        tfLujo = new JTextField();
        tfLujo.setFont(new Font("Arial", Font.PLAIN, 18));
        tfLujo.setForeground(Color.BLACK);
        tfLujo.setBounds(365, 140, 190, 30);
        this.add(tfLujo);

        lbAnioEdicion = new JLabel("Año edición =");
        lbAnioEdicion.setFont(new Font("Serif", Font.PLAIN, 18));
        lbAnioEdicion.setForeground(Color.BLACK);
        lbAnioEdicion.setBounds(240, 180, 480, 30);
        this.add(lbAnioEdicion);

        tfAnioEdicion = new JTextField();
        tfAnioEdicion.setFont(new Font("Arial", Font.PLAIN, 18));
        tfAnioEdicion.setForeground(Color.BLACK);
        tfAnioEdicion.setBounds(365, 180, 190, 30);
        this.add(tfAnioEdicion);

        this.setLayout(null);
        this.setBackground(Color.decode("#e7be35"));
        this.setVisible(true);
    }

    public static String getTfNombreLibro() 
    {
        return tfNombreLibro.getText();
    }

    public static String getTfNombreAutor()
    {
        return tfNombreAutor.getText();
    }

    public static String getTfLujo() 
    {
        return tfLujo.getText();
    }

    public static String getTfAnioEdicion() 
    {
        return tfAnioEdicion.getText();
    }


    public static void borrarTf() 
    {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Impuesto", JOptionPane.WARNING_MESSAGE);
        tfNombreLibro.setText("");
        tfNombreAutor.setText("");
        tfLujo.setText("");
        tfAnioEdicion.setText("");
        PanelResultados.taResultados.setText("");
    }
}
