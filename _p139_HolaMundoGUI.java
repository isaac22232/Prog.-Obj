import java.awt.Font;

import javax.swing.*; 

public class _p139_HolaMundoGUI extends JFrame {

    private JLabel lblSaludo;

    public _p139_HolaMundoGUI(){
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo GUI, Bienvenidos");
        lblSaludo.setFont(new Font("Arial", Font.BOLD,20));
        lblSaludo.setBounds(10,20,300,30);
        add(lblSaludo);
    }

    public static void main(String[] args) {
        _p139_HolaMundoGUI app = new _p139_HolaMundoGUI();
        app.setBounds(10, 10, 400, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}


