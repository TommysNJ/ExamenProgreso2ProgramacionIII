import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField textIngresoNombre;
    private JButton ingresarPlatoButton;
    private JTextArea textAIngresoPlatos;
    private JButton QuemarDatosButton;
    private JTextField textIngresoPrecio;
    private JTextField textIngresoCalorias;
    private JTextField textIngresoPreparacion;
    private JButton buscarModifButton;
    private JButton modificarModifButton;
    private JTextField textoModifNombre;
    private JTextField textoModifPrecio;
    private JTextField textoModifCalorias;
    private JTextField textoModifPreparacion;
    private JTextArea textAModif;
    private JButton ButtonBuscarEliminar;
    private JTextField textNombreEliminar;
    private JTextArea textAEliminar;
    private JButton eliminarButton;
    private JComboBox comboBoxOrder;
    private JButton mostrarButton;
    private JTextArea textAMostrar;
    private JButton buscarButton;
    private JTextField textBuscarPlatoOrden;
    private Menu menu = new Menu();

    public mainForm() {

        ingresarPlatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Plato plato = new Plato(textIngresoNombre.getText(),Double.parseDouble(textIngresoPrecio.getText()),Integer.parseInt(textIngresoCalorias.getText()),Integer.parseInt(textIngresoPreparacion.getText()));
                //if (menu.agregarPlato(textIngresoNombre.getText(),plato)==1){
                    menu.agregarPlato(plato);
                    textAIngresoPlatos.setText(String.valueOf(plato));
                //} else {
                    //textAIngresoPlatos.setText("Ya existe ese nombre, ingrese otro.");
                //}
            }
        });
        QuemarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAIngresoPlatos.setText(menu.quemarPlatos());
                QuemarDatosButton.setEnabled(false);
            }
        });
        buscarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAModif.setText(String.valueOf(menu.imprimir(textoModifNombre.getText())));
            }
        });
        modificarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.modificar(textoModifNombre.getText(),Integer.parseInt(textoModifCalorias.getText()),Integer.parseInt(textoModifPreparacion.getText()),Double.parseDouble(textoModifPrecio.getText()));
                textAModif.setText("Se modifico con exito.");
            }
        });
        ButtonBuscarEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAEliminar.setText(String.valueOf(menu.imprimir(textNombreEliminar.getText())));
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (menu.eliminarPlato(textNombreEliminar.getText())==0){
                    menu.eliminarPlato(textNombreEliminar.getText());
                    textAEliminar.setText("Se eliminó con éxito.");
                } else {
                    textAEliminar.setText("No se elimino porque no existe.");
                }
            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAMostrar.setText(String.valueOf(menu.mostrarLista()));
            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    //Get mainPanel
    public JPanel getMainPanel() {
        return mainPanel;
    }
}
