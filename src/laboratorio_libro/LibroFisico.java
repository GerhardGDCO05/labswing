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
    
    
    @Override
    public void leerdatos(){
        boolean salir=false;
        double x;
        Scanner sc = new Scanner(System.in);
        super.leerdatos();
        while(!salir){
            System.out.println("ingrese el peso del libro");
            try{
               x = Double.parseDouble(sc.nextLine());
               this.setPeso(x);salir=true;
            }
            catch(NumberFormatException e){System.out.println("Error ingrese un dato valido");}
        }
        
        while(salir){
            System.out.println("ingrese el costo del envio");
            try{         
                x = Double.parseDouble(sc.nextLine());
                this.setCosto_envio(x);
                salir=false;
            }
            catch(NumberFormatException e){System.out.println("Error ingrese un dato valido");}
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
        
        while(salir){
            System.out.println("desea agregar un descuento por promocion? 1)si --- 2)no");
            double promo= Double.parseDouble(sc.nextLine());
            try{
                if (promo==1) {
                    boolean exit=true;
                    while(exit){
                        try{
                            System.out.println("ingrese el porcentaje de descuento");
                            double descuento= Double.parseDouble(sc.nextLine());
                            this.calcularPrecioDelLibrofisico(descuento);
                            exit=false;
                        }
                        catch(NumberFormatException e){System.out.println("ingrese un numero valido");}
                    }
                    salir=false;
                } 
                else {
                    if(promo==2){
                        this.calcularPrecioDelLibrofisico();
                        salir=false;
                    }
                    else{System.out.println("ingrese un numero valido");}
                }
            }
            catch(NumberFormatException e){System.out.println("ingrese un numero valido");}
        }
        
        
        System.out.println("el precio es: "+ this.getPrecio_del_libro());
    }
    
    public void calcularPrecioDelLibrofisico(){
        this.setPrecio_del_libro(this.getCosto_envio()+this.getPrecio_del_libro());
    }
    public void calcularPrecioDelLibrofisico(double descuento){
        descuento=descuento/100;
        double total=this.getPrecio_del_libro()*descuento;
        this.setPrecio_del_libro(this.getCosto_envio()+this.getPrecio_del_libro()-total);
    }
    
    @Override
    public void marcarNoDisponible() {
       super.marcarNoDisponible();
    }
    @Override
    public void mostrarInformación() {
        super.mostrarInformación();
        System.out.println("peso: "+this.costo_envio);
        System.out.println("costo de envio : "+this.costo_envio);
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
