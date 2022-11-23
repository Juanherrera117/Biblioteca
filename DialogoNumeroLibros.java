package vista;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DialogoNumeroLibros
{
    private JLabel lbTitulo;
    private JLabel lbLibros;
    private static JTextField tfLibros;
    public JButton btnAceptar;

    public DialogoNumeroLibros() {
        lbTitulo = new JLabel("Número de libros", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(10, 10, 280, 20);

        lbLibros = new JLabel("Libros = ", SwingConstants.RIGHT);
        lbLibros.setFont(new Font("Arial", Font.BOLD, 25));
        lbLibros.setBounds(10, 50, 140, 20);

        tfLibros = new JTextField();
        tfLibros.setFont(new Font("Arial", Font.BOLD, 25));
        tfLibros.setBounds(150, 50, 100, 25);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setFont(new Font("Arial", Font.BOLD, 25));
        btnAceptar.setBounds(20, 140, 260, 25);
        btnAceptar.setActionCommand("aceptarVentana");

        this.setLayout(null);
        this.add(lbTitulo);
        this.add(lbLibros);
        this.add(tfLibros);
        this.add(btnAceptar);
        this.setTitle("Biblioteca");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    private void add(JTextField tfLibros2) {
    }
    private void add(JButton btnAceptar2) {
    }
    private void setVisible(boolean b) {
    }
    private void setResizable(boolean b) {
    }
    private void setLocationRelativeTo(Object object) {
    }
    private void setSize(int i, int j) {
    }
    private void setTitle(String string) {
    }
    private void add(JLabel lbTitulo2) {
    }
    private void setLayout(Object object) {
    }
    public static String getLibros() 
    {
        return tfLibros.getText();
    }
    public void cerrarDialogo() {
    }
}