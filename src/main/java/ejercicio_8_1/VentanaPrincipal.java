package ejercicio_8_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class VentanaPrincipal extends JFrame implements
        ActionListener {
    private ListaPersonas lista;
    private Container contenedor;
    private JLabel nombre, apellidos, telefono, dirección;
    private JTextField campoNombre, campoApellidos, campoTelefono, campoDireccion;
    private JButton anadir, eliminar, borrarLista;
    private JList listaNombres;
    private DefaultListModel modelo;
    private JScrollPane scrollLista;

    public VentanaPrincipal(){
        lista = new ListaPersonas();
        inicio();
        setTitle("Personas");
        setSize(270,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(20, 20, 135, 23);
        campoNombre = new JTextField();

        campoNombre.setBounds(105, 20, 135, 23);

        apellidos = new JLabel();
        apellidos.setText("Apellidos:");
        apellidos.setBounds(20, 50, 135, 23);
        campoApellidos = new JTextField();

        campoApellidos.setBounds(105, 50, 135, 23);
        telefono = new JLabel();
        telefono.setText("Telefono:");
        telefono.setBounds(20, 80, 135, 23); /* Establece la posición de
la etiqueta telefono */
        campoTelefono = new JTextField();
        // Establece la posición del campo de texto telefono
        campoTelefono.setBounds(105, 80, 135, 23);
        // Establece la etiqueta y el campo dirección
        dirección = new JLabel();
        dirección.setText("Dirección:");
        dirección.setBounds(20, 110, 135, 23); /* Establece la posición
de la etiqueta dirección */
        campoDireccion = new JTextField();
        // Establece la posición del campo de texto dirección
        campoDireccion.setBounds(105, 110, 135, 23);
        // Establece el botón Anadir persona
        anadir = new JButton();
        anadir.setText("Anadir");
        anadir.setBounds(105, 150, 80, 23);

        anadir.addActionListener(this);

        eliminar= new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(20, 280, 80, 23);

        eliminar.addActionListener(this);

        borrarLista= new JButton();
        borrarLista.setText("Borrar Lista");
        borrarLista.setBounds(120, 280, 120, 23);
        borrarLista.addActionListener(this);
        listaNombres = new JList();
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel();
        scrollLista = new JScrollPane();
        scrollLista.setBounds(20, 190 ,220, 80);
        scrollLista.setViewportView(listaNombres);

        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(telefono);
        contenedor.add(campoTelefono);
        contenedor.add(dirección);
        contenedor.add(campoDireccion);
        contenedor.add(anadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == anadir) {
            anadirPersona();
        }
        if (evento.getSource() == eliminar) {
            eliminarNombre(listaNombres.getSelectedIndex() );
        }

        if (evento.getSource() == borrarLista) {
            borrarLista();
        }
    }

    private void anadirPersona() {
        Persona p = new Persona(campoNombre.getText(),
                campoApellidos.getText(),
                campoTelefono.getText(), campoDireccion.getText());
        lista.anadirPersona(p); /* Se añade una persona al vector de
personas */
        String elemento = campoNombre.getText() + "-" +
                campoApellidos.getText() +
                "-" + campoTelefono.getText() + "-" + campoDireccion.getText();
        modelo.addElement(elemento); /* Se agrega el texto con los
datos de la persona al JList */
        listaNombres.setModel(modelo);
        // Se colocan todos los campos de texto nulos
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
    }

    private void eliminarNombre(int indice) {
        if (indice >= 0) {
            modelo.removeElementAt(indice);
            lista.eliminarPersona(indice);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarLista() {
        lista.borrarLista();
        modelo.clear();
    }
}
