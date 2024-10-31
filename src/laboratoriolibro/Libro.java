// Source code is decompiled from a .class file using FernFlower decompiler.
package laboratoriolibro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public  abstract class Libro {
    private String Código_del_libro;
    private String Título_del_libro;
    private String Autor_del_libro;
    private double Costo_del_libro;
    private double precio_del_libro;
    private int cantidad_disponibles;
    private int año_publicacion;
    private String categoria;
    private int estado;

    public Libro(String Código_del_libro, String Título_del_libro, String Autor_del_libro, double Costo_del_libro, double precio_del_libro, int cantidad_disponibles, int año_publicacion, String categoria, int estado) {
      this.Código_del_libro = Código_del_libro;
      this.Título_del_libro = Título_del_libro;
      this.Autor_del_libro = Autor_del_libro;
      this.Costo_del_libro = Costo_del_libro;
      this.precio_del_libro = precio_del_libro;
      this.cantidad_disponibles = cantidad_disponibles;
      this.año_publicacion = año_publicacion;
      this.categoria = categoria;
      this.estado = estado;
    }

    public Libro() {
    }
    // validar expresiones regulares
    public boolean validarRegex(String isbn,String patronIbsn) {
        //validamos
        Pattern pattern = Pattern.compile(patronIbsn);
        Matcher matcher = pattern.matcher(isbn);
        return matcher.matches();
    }
    public void Disponibilidad_y_Cantidad(){
        this.setCantidad_disponibles(this.getCantidad_disponibles()-1);
        if(this.getCantidad_disponibles()==0){
            this.marcarNoDisponible();
            System.out.println("no quedan ejemplares de ese libro");
        }
        else{
            System.out.print("quedan: "+this.getCantidad_disponibles()+" de ese ejemplar\n");
        }
        
    }
    
    
    public boolean leerdatos(String cod,String tit,String autor,String costo,String cantidad,String categoria,String publicacion) {
        boolean valor=true;
       JFrame frame = new JFrame();
       //CODIGO
        if(valor){valor=validarRegex(cod,"^(978|979)(-?\\d{1,5})(-?\\d{1,7})(-?\\d{1,6})(-?\\d)$");
        }
        //AUTOR
        if(valor){valor=validarRegex(autor,"^[^0-9]*$");
        }
        else{JOptionPane.showMessageDialog(frame, "CODIGO INVALIDO", "RECHAZADO", JOptionPane.CANCEL_OPTION);return valor;}
        //COSTO
        if(valor){valor=validarRegex(costo,"^-?\\d+([.,]\\d+)?$");
        }
        else{JOptionPane.showMessageDialog(frame, "NOMBRE DEL AUTOR iNVALIDO NO SE ACEPTAN NUMEROS", "RECHAZADO", JOptionPane.CANCEL_OPTION);return valor;}
        //CANTIDAD
        if(valor){valor=validarRegex(cantidad,"^[1-9]\\d*$");
        }
        else{JOptionPane.showMessageDialog(frame, "COSTO INVALIDO NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);return valor;}
        //PUBLICACION
        if(valor){valor=validarRegex(publicacion,"^(19[0-9]{2}|1[0-9]{1,3}|20[0-1][0-9]|202[0-3]|[0-9]{1,3})$");}
        else{ JOptionPane.showMessageDialog(frame, "CANTIDAD INVALIDA NO SE ACEPTAN LETRAS", "RECHAZADO", JOptionPane.CANCEL_OPTION);}
        
        return valor;
    }
    public double calcularPrecioDelLibro(double ganancia,double costo) {
        double porcentaje = ganancia / 100.0;
        double x=costo*porcentaje;
        double total=costo+x;
        return total;
    
   }
    

    public void marcarNoDisponible() {
    }

    public void actualizarPrecio(double porcentajeDescuento) {
        if (porcentajeDescuento <= 50.0 && porcentajeDescuento >= 0.0) {
            double num=porcentajeDescuento/100;
            num=num*this.getPrecio_del_libro();
            porcentajeDescuento=this.getPrecio_del_libro()-num;
            this.setPrecio_del_libro(porcentajeDescuento);
        } 
        else {
            System.out.println("ERROR procentaje invalido no se actualizo el precio");
        }
    }
   public String getCódigo_del_libro() {
      return this.Código_del_libro;
   }

   public void setCódigo_del_libro(String Código_del_libro) {
      this.Código_del_libro = Código_del_libro;
   }

   public String getTítulo_del_libro() {
      return this.Título_del_libro;
   }

   public void setTítulo_del_libro(String Título_del_libro) {
      this.Título_del_libro = Título_del_libro;
   }

   public String getAutor_del_libro() {
      return this.Autor_del_libro;
   }

   public void setAutor_del_libro(String Autor_del_libro) {
      this.Autor_del_libro = Autor_del_libro;
   }

   public double getCosto_del_libro() {
      return this.Costo_del_libro;
   }

   public void setCosto_del_libro(double Costo_del_libro) {
      this.Costo_del_libro = Costo_del_libro;
   }

   public double getPrecio_del_libro() {
      return this.precio_del_libro;
   }

   public void setPrecio_del_libro(double precio_del_libro) {
      this.precio_del_libro = precio_del_libro;
   }

   public int getCantidad_disponibles() {
      return this.cantidad_disponibles;
   }

   public void setCantidad_disponibles(int cantidad_disponibles) {
      this.cantidad_disponibles = cantidad_disponibles;
   }

   public int getAño_publicacion() {
      return this.año_publicacion;
   }

   public void setAño_publicacion(int año_publicacion) {
      this.año_publicacion = año_publicacion;
   }

   public String getCategoria() {
      return this.categoria;
   }

   public void setCategoria(String categoria) {
      this.categoria = categoria;
   }

   public int getEstado() {
      return this.estado;
   }

   public void setEstado(int estado) {
      this.estado = estado;
    }
    
   

   
}

