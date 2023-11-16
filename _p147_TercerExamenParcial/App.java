package _p147_TercerExamenParcial;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class App extends JFrame implements ActionListener{
    ArrayList<Jugador> datos;
    JMenuBar mbrJugador;
    JMenu menuArchivo,menuAyuda;
    JMenuItem smnAbrir,smnGuardar,smnSalir,smnAcercaDe;
    JDialog jdlAcercaDe;
    JLabel lblDatos,lblNombre,lblEdad,lblSexo,lblEstadoCivil,lblDescripcion,lblSalario;
    JLabel lblTotalSalario,lblTotlaHombres,lblTotalMujeres,lblTotalSolteros,lblTotalCasados;
    JTextField txtNombre,txtEdad,txtSexo,txtEstadoCivil,txtDescripcion,txtSalario;
    JTextField txtTotalSalario,txtTotalHombres,txtTotalMujeres,txtTotalSolteros,txtTotalCasados;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    DefaultTableModel modelo;
    JScrollPane spane;
    JTable tblDatos;
    JFileChooser fchArchivo;
    JButton btnAgregar,btnGrabar;
    
    public App() {
        super("Actualización de datos de Jugadores");

        // barra me menú
        mbrJugador = new JMenuBar();
        setJMenuBar(mbrJugador);

        menuArchivo = new JMenu("Archivo"); mbrJugador.add(menuArchivo);
        menuAyuda = new JMenu("Ayuda"); mbrJugador.add(menuAyuda);

        smnAbrir    = new JMenuItem("Abrir");   menuArchivo.add(smnAbrir); smnAbrir.addActionListener(this);
        smnGuardar  = new JMenuItem("Guardar"); menuArchivo.add(smnGuardar); smnGuardar.addActionListener(this);
        menuArchivo.add(new JSeparator());
        smnSalir    = new JMenuItem("Salir");   menuArchivo.add(smnSalir); smnSalir.addActionListener(this);

        smnAcercaDe = new JMenuItem("Acerca de .."); menuAyuda.add(smnAcercaDe); smnAcercaDe.addActionListener(this);
        jdlAcercaDe = new JDialog(this, "Acerca de .."); 
        jdlAcercaDe.setSize(250,200);
        jdlAcercaDe.setLocationRelativeTo(this);

        lblDatos = new JLabel("<html>Programación Orientada a Objetos 1<br>Tercer Examen Parcial<br>Ángel Antonio de la Cruz Díaz", JLabel.CENTER);
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(3,1,0,0));
        pnlTabla = new JPanel(); add(pnlTabla);

        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        add(pnlTabla);
        
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        pnlTabla.add(spane);
        tblDatos = new JTable();
        tblDatos.getTableHeader().setBackground(Color.yellow);
        tblDatos.getTableHeader().setForeground(Color.black);
        spane.setViewportView(tblDatos);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Sexo","Estado Civil","Descripción","Salario"});
        tblDatos.setModel(modelo);

        tblDatos.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = tblDatos.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });
    
        pnlDatos = new JPanel(); getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(0,2,10,0));
        
        lblNombre = new JLabel("Nombre (MAYUSCULAS)"); lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        
        txtNombre = new JTextField();
        
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        
        lblEdad = new JLabel("Edad"); lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
    
        txtEdad = new JTextField();
        
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);

        lblSexo = new JLabel("Sexo (F/M)"); lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        
        txtSexo = new JTextField();
    
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);

        lblEstadoCivil = new JLabel("Estado Civil (Soltero/Casado)"); lblEstadoCivil.setHorizontalAlignment(SwingConstants.RIGHT);
        
        txtEstadoCivil = new JTextField();
        
        pnlDatos.add(lblEstadoCivil);
        pnlDatos.add(txtEstadoCivil);

        lblDescripcion = new JLabel("Descripción"); lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescripcion = new JTextField();

        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);

        lblSalario = new JLabel("Salario"); lblSalario.setHorizontalAlignment(SwingConstants.RIGHT);
    
        txtSalario = new JTextField();
        
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);
        
        lblTotalSalario = new JLabel("Salario Total"); lblTotalSalario.setHorizontalAlignment(SwingConstants.RIGHT);
        
        txtTotalSalario = new JTextField();
        
        pnlDatos.add(lblTotalSalario);
        pnlDatos.add(txtTotalSalario);
  
        lblTotalMujeres = new JLabel("Total de Mujeres"); lblTotalMujeres.setHorizontalAlignment(SwingConstants.RIGHT);
    
        txtTotalMujeres = new JTextField(); txtTotalMujeres.setEditable(false);
        pnlDatos.add(lblTotalMujeres);
        pnlDatos.add(txtTotalMujeres);
  
        lblTotlaHombres = new JLabel("Total de Hombres"); lblTotlaHombres.setHorizontalAlignment(SwingConstants.RIGHT);
    
        txtTotalHombres = new JTextField();
        
        txtTotalHombres.setEditable(false);
        pnlDatos.add(lblTotlaHombres);
        pnlDatos.add(txtTotalHombres);

        lblTotalSolteros = new JLabel("Total de Solteros"); lblTotalSolteros.setHorizontalAlignment(SwingConstants.RIGHT);
    
        txtTotalSolteros = new JTextField();
        
        txtTotalSolteros.setEditable(false);
        pnlDatos.add(lblTotalSolteros);
        pnlDatos.add(txtTotalSolteros);

        lblTotalCasados = new JLabel("Total de Casados"); lblTotalCasados.setHorizontalAlignment(SwingConstants.RIGHT);

        txtTotalCasados = new JTextField();
    
        txtTotalCasados.setEditable(false);
        pnlDatos.add(lblTotalCasados);
        pnlDatos.add(txtTotalCasados);

        


        // botones
        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar"); btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);

        btnGrabar = new JButton("Grabar"); btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);

        add(pnlBotones);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == smnSalir) {
                dispose();
            } else if (e.getSource() == smnAcercaDe) {
                jdlAcercaDe.setVisible(true);
            } else if (e.getSource() == btnAgregar) {
                btnGrabar.setEnabled(true);
                activarCampos(true);
                limpiarCampos();
                txtNombre.requestFocus();
                btnAgregar.setEnabled(false);
            } else if (e.getSource() == btnGrabar) {
                guardarCampos();
                limpiarCampos();
                activarCampos(true);
                btnGrabar.setEnabled(false);
                btnAgregar.setEnabled(true);
                calcularTotales();
            } else if (e.getSource() == smnAbrir) {
                fchArchivo = new JFileChooser();
                fchArchivo.setCurrentDirectory(new File("."));
                fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", "dat"));
                int res = fchArchivo.showOpenDialog(null);
                if (res == JFileChooser.APPROVE_OPTION) {
                    File archivo = fchArchivo.getSelectedFile();
                    try {
                        datos = Util.deserializarDatos(archivo.getAbsolutePath());
                        cargarDatos();
                    } catch (Exception e2) {
                        JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else if (e.getSource() == smnGuardar) {
                fchArchivo = new JFileChooser();
                fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", "dat"));
                fchArchivo.setCurrentDirectory(new File("."));
                int res = fchArchivo.showSaveDialog(this);
                if (res == JFileChooser.APPROVE_OPTION) {
                    File archivo = fchArchivo.getSelectedFile();
                    try {
                        Util.serializarDatos(archivo.getAbsolutePath(), datos);
                        JOptionPane.showMessageDialog(this, "Datos Grabados en : " + archivo.getAbsolutePath(), "Correcto",
                                JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e2) {
                        JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error en la aplicación", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarDatos(int ren) {
        txtNombre.setText((datos.get(ren).getNombre()));
        txtEdad.setText(Integer.toString(datos.get(ren).getEdad()));
        txtSexo.setText(Character.toString(datos.get(ren).getSexo()));
        txtEstadoCivil.setText((datos.get(ren).getEstadoCivil()));
        txtDescripcion.setText((datos.get(ren).getDescripcion()));
        txtSalario.setText(Double.toString(datos.get(ren).getSalario()));
    }

    public void activarCampos(boolean act_des) {
        for (Component cp : pnlDatos.getComponents()) {
            if (cp instanceof JTextField) {
                cp.setEnabled(act_des);
            }
        }
    }

    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel)tblDatos.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }

        Object[] obj = new Object[6];
        for (int i = 0; i < datos.size(); i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getSexo();
            obj[3] = datos.get(i).getEstadoCivil();
            obj[4] = datos.get(i).getDescripcion();
            obj[5] = datos.get(i).getSalario();
            modelo.addRow(obj);
        }
    }

    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents()) {
            if (cp instanceof JTextField) {
                ((JTextField)cp).setText("");
            }
            
        }
    }

    public void guardarCampos() {
        Jugador jug = new Jugador();
        jug.setNombre(txtNombre.getText());
        jug.setEdad(Integer.parseInt(txtEdad.getText()));
        jug.setSexo(txtSexo.getText().charAt(0));
        jug.setEstadoCivil(txtEstadoCivil.getText());
        jug.setDescripcion(txtDescripcion.getText());
        jug.setSalario(Double.parseDouble(txtSalario.getText()));

        datos.add(jug);
        cargarDatos();
    }

    public void calcularTotales() {
        double totalSalarios = 0;
        int totalHombres = 0, totalMujeres = 0, totalSolteros = 0, totalCasados = 0;

        for (Jugador jugador : datos) {
            totalSalarios += jugador.getSalario();

            if (jugador.getSexo() == 'M') {
                totalHombres++;
            } else if (jugador.getSexo() == 'F') {
                totalMujeres++;
            }

            if (jugador.getEstadoCivil().equalsIgnoreCase("Soltero")) {
                totalSolteros++;
            } else if (jugador.getEstadoCivil().equalsIgnoreCase("Casado")) {
                totalCasados ++;
            }
            
            txtTotalSalario.setText(String.valueOf(totalSalarios));
            txtTotalHombres.setText(String.valueOf(totalHombres));
            txtTotalMujeres.setText(String.valueOf(totalMujeres));
            txtTotalSolteros.setText(String.valueOf(totalSolteros));
            txtTotalCasados.setText(String.valueOf(totalCasados));


        }
    }
    
    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10, 10, 700, 500);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos = Util.inicializarDatos();
        app.cargarDatos();
        app.activarCampos(false);
        app.btnGrabar.setEnabled(false);
        
    }
}