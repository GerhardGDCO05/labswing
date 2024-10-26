/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_libro;

import java.util.Scanner;

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
    
    @Override
    public void leerdatos(){
        boolean salir =false;
        boolean var; 
        String f;
        Scanner sc = new Scanner(System.in);
        super.leerdatos();
        while(!salir){
            System.out.println("ingrese el formato del libro ejemplo pdf, epub, mobi, rtf, swf ");
            f =sc.nextLine();
            var =Libro.validarRegex(f,"^(pdf|epub|mobi|rtf|swf)$");
            if(var){this.setFormato(f);salir=true;}
            else{System.out.println("formato incorrecto");}
        }
        
        while(salir){
            System.out.println("ingrese el tamanio del libro en GB O MB con el sig formato [5mb o 5gb]");
            f = sc.nextLine();
            var =super.validarRegex(f, "^\\s*\\d+\\s*(MB|Gb|mb|gb)\\s*$");
            if(var){
                this.setTamañoacrhivo(f); 
                salir=false;                
            }
            else{System.out.println("formato invalido");}  
        }
        while(!salir){
            System.out.println("ingrese el procentaje de ganancia no mayor a 50%");
            double ganancia= Double.parseDouble(sc.nextLine());
            try{
                if (ganancia <= 50.0 && ganancia >= 0.0) {
                    super.calcularPrecioDelLibro(ganancia);
                    salir=true;
                } 
                else {
                    System.out.println("porcentaje invalido");
                }
            }
            catch(NumberFormatException e){System.out.println("ingrese un numero valido");}
        }
        this.setPrecio_del_libro(this.calcularPrecioDelLibro());
        System.out.println("el precio es: "+ this.getPrecio_del_libro());
    }
    @Override
    public void marcarNoDisponible() {
        super.marcarNoDisponible();
    }
    
    @Override
    public double calcularPrecioDelLibro(){
        double precio;
        precio = super.calcularPrecioDelLibro();
        return precio;
    }
    @Override
     public void mostrarInformación() {
        super.mostrarInformación();
        System.out.println("Formato: "+this.formato);
        System.out.println("tamaño del archivo: "+this.tamañoacrhivo);
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
