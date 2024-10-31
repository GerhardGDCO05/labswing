/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriolibro;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author LAB_A601
 */
public class LibroDigital extends Libro {
    private String formato;
    private String tamañoacrhivo;
    
    public LibroDigital() {
    }

    public LibroDigital(String formato, String tamañoacrhivo, String Código_del_libro, String Título_del_libro, String Autor_del_libro, double Costo_del_libro, double precio_del_libro, int cantidad_disponibles, int año_publicacion, String categoria, int estado) {
        super(Código_del_libro, Título_del_libro, Autor_del_libro, Costo_del_libro, precio_del_libro, cantidad_disponibles, año_publicacion, categoria, estado);
        this.formato = formato;
        this.tamañoacrhivo = tamañoacrhivo;
    }

    public LibroDigital(String formato, String tamañoacrhivo) {
        this.formato = formato;
        this.tamañoacrhivo = tamañoacrhivo;
    }
    
    public boolean leerdatosD(String formato,String tam,String cod,String tit,String autor,String costo,String cantidad,String categoria,String publicacion,String precio){
        boolean valor=true;
        JFrame frame = new JFrame();
        String format_mbgb="^\\s*\\d+\\s*(MB|GB|mb|gb)\\s*$";
        valor=super.leerdatos(cod, tit, autor, costo, cantidad, categoria, publicacion);
        if(valor==false){return valor;}
        if(valor){valor=super.validarRegex(tam,format_mbgb);}else{JOptionPane.showMessageDialog(frame, "PUBLICACION INVALIDA NO SE ACEPTAN LETRAS NI UN AÑO MAYOR AL ACTUAL", "RECHAZADO", JOptionPane.CANCEL_OPTION);return valor;}
        if(valor){valor=super.validarRegex(precio,"^(50|[0-4]?[0-9])$");}else{JOptionPane.showMessageDialog(frame, "TAMAÑO INVALIDO NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);return valor;}  
        if(!valor){JOptionPane.showMessageDialog(frame, "PRECIO INVALIDO NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
          
        return valor;
    }
   

    

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getTamañoacrhivo() {
        return tamañoacrhivo;
    }

    public void setTamañoacrhivo(String tamañoacrhivo) {
        this.tamañoacrhivo = tamañoacrhivo;
    }

    
}
