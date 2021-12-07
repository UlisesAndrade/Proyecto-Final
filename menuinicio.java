package proyecto_memorama;

//librerias
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

public class menuinicio extends JFrame implements ActionListener {

    JLabel nomjudador, etiqueta;
    JButton creditos, iniciarjuego, salir;
    JTextField txtnomjugador;
    

    public menuinicio() {
        this.setTitle("Menu");
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        componentes();
    }
    //metodo que contiene todos los compoenentes de la ventana
   public void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        //Imagen superior del menu
        etiqueta = new JLabel("",new ImageIcon(new ImageIcon("src/fondos/Fondo_1.jpg").getImage().getScaledInstance(1400, 300, Image.SCALE_SMOOTH)), SwingConstants.CENTER);
        etiqueta.setBounds(0, 0, 1400, 300);
        etiqueta.setOpaque(true);
        panel.add(etiqueta);
        //Lateral Izquierda
        etiqueta = new JLabel(new ImageIcon(new ImageIcon("src/fondos/Fondo_3.jpg").getImage().getScaledInstance(549, 600, Image.SCALE_SMOOTH)), SwingConstants.CENTER);
        etiqueta.setBounds(0, 200, 549, 600);
        etiqueta.setOpaque(true);
        panel.add(etiqueta);
        //Lateral Derecha
        etiqueta = new JLabel(new ImageIcon(new ImageIcon("src/fondos/Fondo_3.jpg").getImage().getScaledInstance(549, 600, Image.SCALE_SMOOTH)), SwingConstants.CENTER);
        etiqueta.setBounds(850, 200, 549, 600);
        etiqueta.setOpaque(true);
        panel.add(etiqueta);
        // Etiqueta del nombre
        etiqueta = new JLabel();
        etiqueta = new JLabel("",new ImageIcon(new ImageIcon("src/fondos/name.jpg").getImage().getScaledInstance(300, 100, Image.SCALE_SMOOTH)), SwingConstants.CENTER);
        etiqueta.setBounds(550, 300, 300, 100);
        panel.add(etiqueta);

        //texto donde se coloca el nombre de jugador
        txtnomjugador = new JTextField();
        txtnomjugador.setBounds(500, 400, 400, 48);
        txtnomjugador.setHorizontalAlignment(JTextField.CENTER);
        txtnomjugador.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 30));
        panel.add(txtnomjugador);

        //boton iniciar juego, este mandara directamente a iniciar el juego 
        iniciarjuego = new JButton();        
        iniciarjuego.setBounds(520, 450, 350, 80);
        iniciarjuego.setOpaque(false);
        iniciarjuego.setIcon(new ImageIcon(new ImageIcon("src/fondos/botones_2.PNG").getImage().getScaledInstance(350, 80, Image.SCALE_SMOOTH)));
        //iniciarjuego.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
        iniciarjuego.addActionListener(this);
        panel.add(iniciarjuego);

        //este boton va a mostrar los datos del creador de la aplicación
        creditos = new JButton();
        creditos.setOpaque(false);
        creditos.setIcon(new ImageIcon(new ImageIcon("src/fondos/creditos.PNG").getImage().getScaledInstance(350, 80, Image.SCALE_SMOOTH)));
        creditos.setBounds(520, 540, 350, 80);
        creditos.addActionListener(this);
        panel.add(creditos);

        //Boton salir
        salir = new JButton();
        salir.setOpaque(false);
        salir.setIcon(new ImageIcon(new ImageIcon("src/fondos/salir.PNG").getImage().getScaledInstance(305, 80, Image.SCALE_SMOOTH)));
        salir.setBounds(548, 630, 305, 80);
        salir.addActionListener(this);
        panel.add(salir);
    }
    
    //eventos de acción
    @Override
    public void actionPerformed(ActionEvent e) {

        //este evento realiza la acción del boton iniciar juego
        if (e.getSource() == iniciarjuego) {

            //se coloca un if para colocar una excepcion a la hora de iniciar el juego 
            if (txtnomjugador.getText().equals("")) {
                //si en el txtnomjugador no se encuentra ningun valor
                JOptionPane.showMessageDialog(null, "Coloca nombre de jugador");
                //mandara un mensaje diciendo que tiene que colocar algun nombre
            } else {
                //Ventana para elegir nivel de dificultad
                String opcion;
                opcion = JOptionPane.showInputDialog(rootPane, "ELIGE EL NIVEL QUE DESEAS JUGAR:\n 1.EASY\n 2.MEDIUM\n 3.HARD\n(ESCRIBE EL NUMERO)", "NIVELES", HEIGHT);
                if (Integer.parseInt(opcion) == 1) {
                    //de lo contrario, se inicializara el juego de memoria
                    //se manda a llamar la clase JuegoMemoria
                    JuegoMemoria ventana = new JuegoMemoria();
                    //decimos que nombreju de la clase JuegoMemoria 
                    //va a obtener el valor que se coloco en el txtnomjugador
                    ventana.nombreju.setText(txtnomjugador.getText());
                    //esto se coloca para inicializar el tiempo de la clase JuegoMemoria
                    ventana.tiempo.start();
                    //mostramos la ventana de la clase JuegoMemoria
                    ventana.setVisible(true);
                    //ocultamos la ventana de menuinicial
                    this.setVisible(false);

                }
                if (Integer.parseInt(opcion) == 2) {
                    //de lo contrario, se inicializara el juego de memoria
                    //se manda a llamar la clase JuegoMemoria
                    JuegoMemoriaDos ventana2 = new JuegoMemoriaDos();
                    //decimos que nombreju de la clase JuegoMemoria 
                    //va a obtener el valor que se coloco en el txtnomjugador
                    ventana2.nombreju.setText(txtnomjugador.getText());
                    //esto se coloca para inicializar el tiempo de la clase JuegoMemoria
                    ventana2.tiempo.start();
                    //mostramos la ventana de la clase JuegoMemoria
                    ventana2.setVisible(true);
                    //ocultamos la ventana de menuinicial
                    this.setVisible(false);
                } 
                if (Integer.parseInt(opcion) == 3) {
                    //de lo contrario, se inicializara el juego de memoria
                    //se manda a llamar la clase JuegoMemoria
                    JuegoMemoriaTres ventana3 = new JuegoMemoriaTres();
                    //decimos que nombreju de la clase JuegoMemoria 
                    //va a obtener el valor que se coloco en el txtnomjugador
                    ventana3.nombreju.setText(txtnomjugador.getText());
                    //esto se coloca para inicializar el tiempo de la clase JuegoMemoria
                    ventana3.tiempo.start();
                    //mostramos la ventana de la clase JuegoMemoria
                    ventana3.setVisible(true);
                    //ocultamos la ventana de menuinicial
                    this.setVisible(false);
                }if (Integer.parseInt(opcion) >= 4 ){
                    JOptionPane.showMessageDialog(null, "INGRESA UNA OPCION CORRECTA...");
                }

            }
        }

        //este es el evento de el boton creditos
        if (e.getSource() == creditos) {
            //se manda a llamar una imagen 
            Icon g = new ImageIcon(getClass().getResource("/imagenes/uabc_.png"));
            //se implementa que a la hora de apachar el boton creditos este mostrara una ventana
            //donde se mostraran algun datos del creador del programa
            JOptionPane.showMessageDialog(null, " Universidad Autonoma de Baja California\n"
                    + " Estudiante:\n Andrade Palacios Luis Ulises.\n "
                    + "Carrera:\n Ingenieria en Computacion.       "
                    + "\n "
                    + "\n Cuarto Semestre, 2021-2"
                    + "\n Proyecto Final: Juego Memorama."
                    + "\n Materia: Programacion Orientada a Objetos (POO)."
                    + "\n Profesora de Laboratorio: Claudia Gabrie Tona Catro "
                    + "\n Profesor de Clase/Taller: Reyes Juarez Ramirez "
                    + "\n "
                    + "\n Proyecto realizado bajo las instrucciones \nestablecidas en la practica\n",
                     "Informacion general ", JOptionPane.INFORMATION_MESSAGE, g);

        }

        //este es el evento del boton salir 
        if (e.getSource() == salir) {
            //se mostrara una ventana donde hace una pregunta y tiene las opciones de salir o no
            if (JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de salir del juego?",
                    "Salir del juego. ", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

    }

}
