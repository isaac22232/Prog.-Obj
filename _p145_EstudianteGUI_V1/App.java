package _p145_EstudianteGUI_V1;

import javax.swing.*;
import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class App extends JFrame implements ActionListener {
    ArrayList<Estudiante> datos;
    JMenuBar menuEstudiante;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smrAbrir, smrGuardar, smrSalir, smrAcercaDe;
    JDialog jdlAcercaDe;
    JLabel lblDatos, lblEdad, lblNombre, lblCorreo, lblPeso;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    JTextField txtNombre,txtEdad,txtPeso,txtCorreo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar;
    


    public App(){
        super("Actualizacion de datos de un estudiante");
        menuEstudiante = new JMenuBar();
        setJMenuBar(menuEstudiante);
        mnuArchivo = new JMenu("Archivo");
        menuEstudiante.add(mnuArchivo);
        mnuAyuda = new JMenu("Ayuda");
        menuEstudiante.add(mnuAyuda);
        smrAbrir = new JMenuItem("Abrir");
        smrGuardar = new JMenuItem("Guardar");
        smrSalir = new JMenuItem("Salir");
        smrSalir.addActionListener(this);
        mnuArchivo.add(smrAbrir);
        mnuArchivo.add(smrGuardar);
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(smrSalir);
        smrAcercaDe = new JMenuItem("Acerca de ...");
        mnuAyuda.add(smrAcercaDe);
        smrAbrir.addActionListener(this);
        smrGuardar.addActionListener(this);
        smrAcercaDe.addActionListener(this);

        jdlAcercaDe = new JDialog(this, "Acerca de ...");
        jdlAcercaDe.setSize(300,250);
        jdlAcercaDe.setLocationRelativeTo(this);

        lblDatos = new JLabel("<html>Programacion Orientada a Objetos 1<br> Saul Isaac Jaime Partida", JLabel.CENTER);
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(3, 1));

        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla,BoxLayout.X_AXIS));
        getContentPane().add(pnlTabla);
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);
        table = new JTable();
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(Color.black);
        spane.setViewportView(table);
                
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Edad", "Peso", "Correo" });
        table.setModel(modelo);
        table.addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
        int ren = table.rowAtPoint(e.getPoint());
        mostrarDatos(ren);
        }
        });

        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(4, 2, 0, 0));
        lblNombre = new JLabel("Nombre");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("Edad");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        lblPeso = new JLabel("Peso");
        lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPeso = new JTextField();
        pnlDatos.add(lblPeso);
        pnlDatos.add(txtPeso);
        lblCorreo = new JLabel("Correo:");
        lblCorreo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCorreo = new JTextField();
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);

        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);
    

        }

        public void actionPerformed(ActionEvent e){
            if (e.getSource()==smrSalir) {
                dispose();
            }else if(e.getSource()==smrAcercaDe){
                jdlAcercaDe.setVisible(true);
            }
        }

        public void cargarDatos() {
            DefaultTableModel dm = (DefaultTableModel)table.getModel();
            while(dm.getRowCount()>0) dm.removeRow(0);
            Object[] obj = new Object[4];
            for(int i=0; i<datos.size() ; i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getPeso();
            obj[3] = datos.get(i).getCorreo();
            modelo.addRow(obj);
            }
        }
        public void activarCampos(boolean actdes) {
            for (Component cp : pnlDatos.getComponents())
            if(cp instanceof JTextField)
            cp.setEnabled(actdes);
            
            }
            public void limpiarCampos() {
            for (Component cp : pnlDatos.getComponents())
            if(cp instanceof JTextField)
            
            ((JTextField)cp).setText("");
            
            }
            public void guardarCampos() {
            Estudiante est = new Estudiante();
            est.setNombre( txtNombre.getText() );
            est.setEdad( Integer.parseInt(txtEdad.getText() ));
            est.setPeso( Double.parseDouble(txtPeso.getText()) );
            est.setCorreo( txtCorreo.getText() );
            datos.add(est);
            cargarDatos();
            }
        
    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10,10,550,400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
