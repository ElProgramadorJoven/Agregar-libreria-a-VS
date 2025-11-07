import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class App extends JFrame {
    JTextField texto;

    public App() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new java.awt.FlowLayout(FlowLayout.CENTER, 15, 50));

        texto = new JTextField(20);
        add(texto);

        JButton agregar = new JButton("Agregar");
        add(agregar);

        agregar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ev) {
                save();
            }
        });

    }

    private void save() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_connection", "root", "");
            PreparedStatement ps = con.prepareStatement("insert into test_connection (info) values (?)");
            ps.setString(1, texto.getText());
            ps.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "texto guardado");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            
        }
    }

    public static void main(String[] args) throws Exception {

        new App().setVisible(true);

    }
}
