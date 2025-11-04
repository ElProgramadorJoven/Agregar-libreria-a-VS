import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class App extends JFrame{

    public App(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new java.awt.FlowLayout(FlowLayout.CENTER, 15, 50));

        JTextField texto = new JTextField(20);
        add(texto);

        JButton agregar = new JButton("Agregar");
        add(agregar);

        agregar.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ev){
                String txt = texto.getText();
               
            }
        });

    }

   
    public static void main(String[] args) throws Exception {

        new App().setVisible(true);
       
    }
}
