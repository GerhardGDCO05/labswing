// Source code is decompiled from a .class file using FernFlower decompiler.
package laboratorio_libro;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public static boolean validarRegex(String isbn,String patronIbsn) {
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
    //llenamos los datos
    public void leerdatos() {
        String var = null;
        double var2;
        int var3;
        boolean salir = false;
        Scanner sc = new Scanner(System.in);

        while(!salir) {
            System.out.println("ingrese el codigo del libro respecto a la estructura del ISBN ejemplo --> 978-3-16-148410-0");
            var = sc.nextLine();
            // Eliminamos cualquier espacio en blanco para el isbn
            var = var.replaceAll("\\s+", "");
            boolean codigo = this.validarRegex(var,"^(978|979)(-?\\d{1,5})(-?\\d{1,7})(-?\\d{1,6})(-?\\d)$");
            if (codigo) {
               System.out.println("codigo valido\n");
               this.setCódigo_del_libro(var);
               salir = true;
            } else {
               System.out.println("codigo invalido\n");
            }
        }

        salir = false;
        System.out.println("ingrese el titulo del libro");
        var = sc.nextLine().toLowerCase();
        this.setTítulo_del_libro(var);
        System.out.println("ingrese el autor del libro");
        var = sc.nextLine();
        this.setAutor_del_libro(var);
        while(!salir){
            System.out.println("ingrese el costo del libro");
            try{
                var2 = Double.parseDouble(sc.nextLine());
                this.setCosto_del_libro(var2);
                salir=true;
            }
            catch(NumberFormatException e){System.out.println("ingrese un numero valido");}
        }
      

        salir=false;
        while(!salir) {
          System.out.println("ingrese la cantidad del libro");
          try{
                var3 = Integer.parseInt(sc.nextLine());
                if (var3 >= 0) {
                   this.setCantidad_disponibles(var3);
                   salir = true;
                } else {
                   System.out.println("ingrese una cantidad valida");
                }
            }
            catch(NumberFormatException e){System.out.println("ingrese un numero valido");}
        }
      
      salir=false;
      while(!salir){
        System.out.println("ingrese el anio de publicacion del libro [4 digitos]");
        try{
            var3 = Integer.parseInt(sc.nextLine());
            if(var3>=1000 && var3<=9999){
                this.setAño_publicacion(var3);
                salir=true;
            }
            else{System.out.println("ingrese un anio valio");}
        }
        catch(NumberFormatException e){System.out.println("ingrese un numero valido");}
      }
      System.out.println("ingrese la categoria del libro");
      var = sc.nextLine().toLowerCase();
      this.setCategoria(var);
      this.setEstado(1);
      
   }

    public void marcarNoDisponible() {
        this.setEstado(0);
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

   public void mostrarInformación() {
      System.out.println("codigo: " + this.getCódigo_del_libro());
      System.out.println("titulo: " + this.getTítulo_del_libro());
      System.out.println("autor: " + this.getAutor_del_libro());
      System.out.println("costo: " + this.getCosto_del_libro());
      System.out.println("precio: " + this.getPrecio_del_libro());
      System.out.println("cantidad: " + this.getCantidad_disponibles());
      System.out.println("anio de publicacion: " + this.getAño_publicacion());
      System.out.println("categoria: " + this.getCategoria());
      System.out.println("estado: " + this.getEstado());
   }


   public void calcularPrecioDelLibro(double ganancia) {
        double porcentaje = ganancia / 100.0;
        ganancia = porcentaje * this.getCosto_del_libro();
        this.setPrecio_del_libro(this.getCosto_del_libro() + ganancia);
    
   }
    public double calcularPrecioDelLibro() {
        double calcular= this.getPrecio_del_libro()*0.10;
        calcular=this.precio_del_libro-calcular;
        return calcular;          
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

