/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriolibro;

import laboratoriolibro.Libro;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB_A601
 */
public class LibroFisico extends Libro {
    private double peso;
    private double costo_envio;

    public LibroFisico(double peso, double costo_envio, String Código_del_libro, String Título_del_libro, String Autor_del_libro, double Costo_del_libro, double precio_del_libro, int cantidad_disponibles, int año_publicacion, String categoria, int estado) {
        super(Código_del_libro, Título_del_libro, Autor_del_libro, Costo_del_libro, precio_del_libro, cantidad_disponibles, año_publicacion, categoria, estado);
        this.peso = peso;
        this.costo_envio = costo_envio;
    }

    public LibroFisico() {
    }

    public LibroFisico(double peso, double costo_envio) {
        this.peso = peso;
        this.costo_envio = costo_envio;
    }
    
    
    public boolean leerdatosF(String cod,String tit,String autor,String cantidad,String categoria,String costolibro,String publicacion,String precio,String peso,String costoenvio){
        boolean valor=true;
        JFrame frame = new JFrame();
        valor=this.leerdatos(cod, tit, autor, costolibro, cantidad, categoria, publicacion);
        
        if(valor==false){return valor;}
        if(valor){valor=super.validarRegex(peso,"^(0|[1-9][0-9]*)(\\.[0-9]+)?$");}else{JOptionPane.showMessageDialog(frame, "PUBLICACION INVALIDA NO SE ACEPTAN LETRAS NI UN AÑO MAYOR AL ACTUAL", "RECHAZADO", JOptionPane.CANCEL_OPTION);return valor;}
        if(valor){valor=super.validarRegex(costoenvio,"^-?\\d+([.,]\\d+)?$");}else{JOptionPane.showMessageDialog(frame, "PESO INVALIDO NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);return valor;}
        if(valor){valor=super.validarRegex(precio,"^(50|[0-4]?[0-9])$");}else{JOptionPane.showMessageDialog(frame, "COSTO DEL ENVIO INVALIDO NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);return valor;}  
        if(!valor){JOptionPane.showMessageDialog(frame, "PRECIO INVALIDO NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
          
        return valor;
    }
    
    public void calculardescuento(double descuento){
        descuento=descuento/100;
        double total=this.getPrecio_del_libro()*descuento;
        this.setPrecio_del_libro(this.getCosto_envio()+this.getPrecio_del_libro()-total);
    }
    


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto_envio() {
        return costo_envio;
    }

    public void setCosto_envio(double costo_envio) {
        this.costo_envio = costo_envio;
    }
    
   
    
    
}
