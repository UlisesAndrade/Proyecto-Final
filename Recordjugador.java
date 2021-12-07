package proyecto_memorama;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Recordjugador extends JFrame implements ActionListener{
    
    JLabel lblnombrejuga, lbltiempoju, lblhorainicio, lblfechaju,etiqueta, lblpuntuacion;
    JButton regresar;
    public Recordjugador(){
        this.setTitle("RECORD DEL JUGADOR");
        this.setSize(1010, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        //agregamos panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        etiqueta = new JLabel("TABLA DE CLASIFICACION");
        etiqueta.setBackground(Color.white);
        etiqueta.setBounds(500,80,500,100);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        panel.add(etiqueta);
        //label de clasificaicon de tiempo
        etiqueta = new JLabel();
        etiqueta.setText("<html>TIEMPO<p><p>0s - 50s<p>51s - 1:20 min<p>1:21 min - 1:50 min<p>1:51 min ++<html>");
        etiqueta.setBounds(500,90,250,400);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        //Label de clasificacion del rango
        etiqueta = new JLabel();
        etiqueta.setText("<html>RANGO<p><p>DIAMANTE<p>ORO<p>PLATA<p>BRONCE<html>");
        etiqueta.setBounds(750,90,250,400);
        etiqueta.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        panel.add(etiqueta);
        //Label de titulo
        etiqueta = new JLabel("¡TU RECORD!");
        etiqueta.setBounds(380,8,300,100);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        panel.add(etiqueta);
        
        etiqueta = new JLabel("Nombre Jugador: ");
        etiqueta.setBounds(100,180,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label obtendra el nombre del jugador colocado anteriormente
        lblnombrejuga = new JLabel("nombre");
        lblnombrejuga.setBounds(260,180,150,40);
        lblnombrejuga.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblnombrejuga);
        
        etiqueta = new JLabel("Tiempo Final: ");
        etiqueta.setBounds(100,240,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label obtendra el tiempo final que obtuvo, mejor dicho en cuanto tiempo
        //se tardo el jugador en terminar el juego
        lbltiempoju = new JLabel("tiempo");
        lbltiempoju.setBounds(260,240,150,40);
        lbltiempoju.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lbltiempoju);
        
        etiqueta = new JLabel("Hora inicial: ");
        etiqueta.setBounds(100,300,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label mostrar la hora de inicio
        lblhorainicio = new JLabel("hora");
        lblhorainicio.setBounds(260,300,150,40);
        lblhorainicio.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblhorainicio);
        
        etiqueta = new JLabel("Fecha: ");
        etiqueta.setBounds(100,360,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //en este label se mostrara la fecha
        lblfechaju = new JLabel("fecha");
        lblfechaju.setBounds(260,360,150,40);
        lblfechaju.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblfechaju);
        
        //MENSAJE PARA EL USUARIO
        etiqueta = new JLabel();
        etiqueta.setText("<html>¡COMPARA TU TIEMPO CON LA TABLA DE<p>CLASIFICACION PARA DESCIFRAR TU HABILIDAD!<html>");
        etiqueta.setBounds(260,400,700,200);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        panel.add(etiqueta);
        
        regresar = new JButton("Regresar a Menu");
        regresar.setBounds(300,550,300,100);
        regresar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 30));
        regresar.setOpaque(false);
        regresar.addActionListener(this);
        panel.add(regresar);
    }
    
    public void Recordjugador2(){
        this.setTitle("RECORD DEL JUGADOR");
        this.setSize(1010, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        //agregamos panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        etiqueta = new JLabel("TABLA DE CLASIFICACION");
        etiqueta.setBackground(Color.white);
        etiqueta.setBounds(500,80,500,100);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        panel.add(etiqueta);
        //label de clasificaicon de tiempo
        etiqueta = new JLabel();
        etiqueta.setText("<html>TIEMPO<p><p>0s - 1:30min<p>1:31min - 2 min<p>2:21 min - 3:00 min<p>3:01 min ++<html>");
        etiqueta.setBounds(500,90,250,400);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        //Label de clasificacion del rango
        etiqueta = new JLabel();
        etiqueta.setText("<html>RANGO<p><p>DIAMANTE<p>ORO<p>PLATA<p>BRONCE<html>");
        etiqueta.setBounds(750,90,250,400);
        etiqueta.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        panel.add(etiqueta);
        //Label de titulo
        etiqueta = new JLabel("¡TU RECORD!");
        etiqueta.setBounds(380,8,300,100);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        panel.add(etiqueta);
        
        etiqueta = new JLabel("Nombre Jugador: ");
        etiqueta.setBounds(100,180,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label obtendra el nombre del jugador colocado anteriormente
        lblnombrejuga = new JLabel("nombre");
        lblnombrejuga.setBounds(260,180,150,40);
        lblnombrejuga.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblnombrejuga);
        
        etiqueta = new JLabel("Tiempo Final: ");
        etiqueta.setBounds(100,240,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label obtendra el tiempo final que obtuvo, mejor dicho en cuanto tiempo
        //se tardo el jugador en terminar el juego
        lbltiempoju = new JLabel("tiempo");
        lbltiempoju.setBounds(260,240,150,40);
        lbltiempoju.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lbltiempoju);
        
        etiqueta = new JLabel("Hora inicial: ");
        etiqueta.setBounds(100,300,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label mostrar la hora de inicio
        lblhorainicio = new JLabel("hora");
        lblhorainicio.setBounds(260,300,150,40);
        lblhorainicio.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblhorainicio);
        
        etiqueta = new JLabel("Fecha: ");
        etiqueta.setBounds(100,360,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //en este label se mostrara la fecha
        lblfechaju = new JLabel("fecha");
        lblfechaju.setBounds(260,360,150,40);
        lblfechaju.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblfechaju);
        
        //MENSAJE PARA EL USUARIO
        etiqueta = new JLabel();
        etiqueta.setText("<html>¡COMPARA TU TIEMPO CON LA TABLA DE<p>CLASIFICACION PARA DESCIFRAR TU HABILIDAD!<html>");
        etiqueta.setBounds(260,400,700,200);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        panel.add(etiqueta);
        
        regresar = new JButton("Regresar a Menu");
        regresar.setBounds(300,550,300,100);
        regresar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 30));
        regresar.setOpaque(false);
        regresar.addActionListener(this);
        panel.add(regresar);
    }
    
    public void Recordjugador3(){
        this.setTitle("RECORD DEL JUGADOR");
        this.setSize(1010, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        //agregamos panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        etiqueta = new JLabel("TABLA DE CLASIFICACION");
        etiqueta.setBackground(Color.white);
        etiqueta.setBounds(500,80,500,100);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        panel.add(etiqueta);
        //label de clasificaicon de tiempo
        etiqueta = new JLabel();
        etiqueta.setText("<html>TIEMPO<p><p>0s - 2:30min<p>2:31min - 3:10 min<p>3:11 min - 4:30 min<p>4:11 min ++<html>");
        etiqueta.setBounds(500,90,250,400);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        //Label de clasificacion del rango
        etiqueta = new JLabel();
        etiqueta.setText("<html>RANGO<p><p>DIAMANTE<p>ORO<p>PLATA<p>BRONCE<html>");
        etiqueta.setBounds(750,90,250,400);
        etiqueta.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        panel.add(etiqueta);
        //Label de titulo
        etiqueta = new JLabel("¡TU RECORD!");
        etiqueta.setBounds(380,8,300,100);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        panel.add(etiqueta);
        
        etiqueta = new JLabel("Nombre Jugador: ");
        etiqueta.setBounds(100,180,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label obtendra el nombre del jugador colocado anteriormente
        lblnombrejuga = new JLabel("nombre");
        lblnombrejuga.setBounds(260,180,150,40);
        lblnombrejuga.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblnombrejuga);
        
        etiqueta = new JLabel("Tiempo Final: ");
        etiqueta.setBounds(100,240,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label obtendra el tiempo final que obtuvo, mejor dicho en cuanto tiempo
        //se tardo el jugador en terminar el juego
        lbltiempoju = new JLabel("tiempo");
        lbltiempoju.setBounds(260,240,150,40);
        lbltiempoju.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lbltiempoju);
        
        etiqueta = new JLabel("Hora inicial: ");
        etiqueta.setBounds(100,300,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label mostrar la hora de inicio
        lblhorainicio = new JLabel("hora");
        lblhorainicio.setBounds(260,300,150,40);
        lblhorainicio.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblhorainicio);
        
        etiqueta = new JLabel("Fecha: ");
        etiqueta.setBounds(100,360,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //en este label se mostrara la fecha
        lblfechaju = new JLabel("fecha");
        lblfechaju.setBounds(260,360,150,40);
        lblfechaju.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblfechaju);
        
        //MENSAJE PARA EL USUARIO
        etiqueta = new JLabel();
        etiqueta.setText("<html>¡COMPARA TU TIEMPO CON LA TABLA DE<p>CLASIFICACION PARA DESCIFRAR TU HABILIDAD!<html>");
        etiqueta.setBounds(260,400,700,200);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        panel.add(etiqueta);
        
        regresar = new JButton("Regresar a Menu");
        regresar.setBounds(300,550,300,100);
        regresar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 30));
        regresar.setOpaque(false);
        regresar.addActionListener(this);
        panel.add(regresar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //el boton regresar hara que regresemos a la ventana de menu
        if(e.getSource() == regresar){
            menuinicio ventana = new menuinicio();
            JuegoMemoria ventana2 = new JuegoMemoria();
            ventana2.setVisible(false);
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }
    
}