/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio_libro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */

public class Lab_libro extends Arrays {
    //main
    public static void main(String[] args) {
        
        int num = 0;
        double total=0;
        boolean salir = false;
        Scanner x = new Scanner(System.in);
        while(!salir) {
            //menu
            System.out.println("Welcome to ----Menu---- LecturaFacil");
            System.out.println("1- Tipo de libro a ingresar");
            System.out.println("2- Consultar");
            System.out.println("3- eliminar:");
            System.out.println("4- salir ");
            //excepcion
            try{
                num = Integer.parseInt(x.nextLine());
                switch (num) {
                    case 1->{
                            boolean y = false;
                            while(!y){
                                try{
                                    //menu seleccion tipo de libro
                                    System.out.println("1- para libro digital");
                                    System.out.println("2-para libro fisico");
                                    System.out.println("3-regresar");
                                    int opcion = Integer.parseInt(x.nextLine());
                                    switch(opcion){
                                        //creamos el objeto y lo guardamos en la lista con sus datos
                                        case 1-> {LibroDigital digital = new LibroDigital();
                                            digital.leerdatos();
                                            agregarDigital(digital);
                                            y=true;
                                        }
                                                                                //creamos el objeto y lo guardamos en la lista con sus datos

                                        case 2-> {LibroFisico fisico = new LibroFisico();
                                            fisico.leerdatos();
                                            agregarFisico(fisico);
                                            y=true;
                                        }
                                        case 3->{y=true;}
                                        default-> System.out.println("ingrese un numero valido");
                                    }
                                }
                                catch(NumberFormatException e){System.out.println("Error ingrese un dato valido");}
                            }
                        }
                    //sumamos las ventas
                    case 2 -> total=total+consultar(arrayD, arrayF);
                    case 3->{
                        if (arrayD.isEmpty() && arrayF.isEmpty()){
                            System.out.println("no hay libros registrados");
                        }
                        else{
                            Eliminar(arrayD,arrayF);
                        }
                        
                    }
                    //salir del programa y mostrar ventas
                    case 4 -> {salir = true;System.out.println("Total de las ventas: "+total);}
                    default -> System.out.println("error opcion invalida");
                }
            }
            catch(NumberFormatException e){System.out.println("ingrese un numero valido");}
        }
        x.close();
    }
    
    //menu de consultar libros
    public static void menuLibros(){
        System.out.println("1- ver informacion de todos los libros");
        System.out.println("2- modificar");
        System.out.println("3- comprar");
        System.out.println("4- salir:");
    }
    //eliminar libros
    public static void Eliminar(ArrayList<LibroDigital> d,ArrayList<LibroFisico> f){
        // creamos iteradores para poder iterar el array y eliminar el objeto especifico que buscamos
        Iterator<LibroDigital> iteratorD = d.iterator();
        Iterator<LibroFisico> iteratorF = f.iterator();
        boolean salir=true;
        Scanner sc=new Scanner(System.in);
        while(salir){
            int x=0;
            //colocamos la excepcion
            try{
                System.out.println("1-eliminar libros especificos");
                System.out.println("2-eliminar todos los de una categoria");
                System.out.println("3-regresar");
                int elim=Integer.parseInt(sc.nextLine());

                switch(elim){
                    case 1->{
                        //buscamos por titulo
                        System.out.println("se eliminaran todos los ejemplares de este libro tanto fisico como digital");
                        System.out.println("ingrese el titulo de,libro");
                        String opcion =sc.nextLine().toLowerCase();
                        //buscamos en los digitales
                        while (iteratorD.hasNext()) {
                            LibroDigital libroDigital = iteratorD.next();
                            if (libroDigital.getTítulo_del_libro().equals(opcion)) {
                                iteratorD.remove();
                                x++;
                            }
                        }
                        // buscamos en los fisicos
                        while (iteratorF.hasNext()) {
                            LibroFisico libroFisico = iteratorF.next();
                            if (libroFisico.getTítulo_del_libro().equals(opcion)) {
                                iteratorF.remove();
                                x++;
                            }
                        }
                        if(x==0){System.out.println("ese libro no esta en el registro");}
                        else{System.out.println("libro eliminado con exito");}
                    }
                    case 2->{
                        //buscamos  por categoria
                        System.out.println("se eliminaran todos los ejemplares de lacategoria que ingrese tanto fisico como digital");
                        System.out.println("ingrese la categoria de,libro");
                        String opcion =sc.nextLine().toLowerCase();
                        //digitales
                        while (iteratorD.hasNext()) {
                            LibroDigital libroDigital = iteratorD.next();
                            if (libroDigital.getCategoria().equals(opcion)) {
                                iteratorD.remove();
                                x++;
                            }
                        }
                        //fisicos
                        while (iteratorF.hasNext()) {
                            LibroFisico libroFisico = iteratorF.next();
                            if (libroFisico.getCategoria().equals(opcion)) {
                                iteratorF.remove();
                                x++;
                            }
                        }
                        if(x==0){System.out.println("esa categoria no esta en el registro");}
                        else{System.out.println("libro eliminado con exito");}
                    }
                    case 3->{salir=false;}
                    default ->System.out.println("dato invalido");
                     
                }
            }
            catch(NumberFormatException e){System.out.println("ingrese un numero valido");}
        }
    }
    
    //consultar
    public static double consultar(ArrayList<LibroDigital> d, ArrayList<LibroFisico> f){
        double totalv =0;
        Scanner sc =new Scanner(System.in);
        //verificamos que hayan libros
        if (d.isEmpty() && f.isEmpty()) {
        System.out.println("No hay libros registrados en el sistema.");}
        else{
            System.out.println("1 para consultar libros digitales");
            System.out.println("2 para consultar libros fisicos");
            int p = Integer.parseInt(sc.nextLine());
            //excepcion
            try{
                switch (p) {
                    case 1 -> {
                        //verificamos que hayan libros digitales
                        if (d.isEmpty()) {
                        System.out.println("No hay libros digitales registrados.");
                        }
                        else {
                            boolean exit=false;
                            while(!exit){
                                //excepcion
                                try{
                                    System.out.println("Libros digitales:");
                                    menuLibros();
                                    int q = Integer.parseInt(sc.nextLine());
                                    switch(q){
                                        //informacion
                                        case 1->{
                                            for (LibroDigital libroD : d) {
                                                libroD.mostrarInformación();
                                                System.out.println("--------------------");
                                            }
                                        }
                                        case 2->{
                                            //modificar
                                            boolean salir=false;
                                            while(!salir){
                                                System.out.println("se mostraran los titulos de los libros y la opcion que marco en orden seleccione cuando quiera modificarlo");
                                                System.out.println("solo es posible cambiar el formato la disponibilidad y actualizar el precio con un descuento del 10% del libro por los momentos");
                                                for (LibroDigital libroD : d) {
                                                    System.out.println("titulo "+libroD.getTítulo_del_libro());
                                                    System.out.println("formato "+libroD.getFormato());
                                                    System.out.println("estado "+libroD.getEstado());
                                                    System.out.println("precio "+libroD.getPrecio_del_libro());
                                                    System.out.println("--------------------\n");
                                                    salir=false;
                                                    while(!salir){
                                                        try{
                                                            System.out.println("1-cambiar formato");
                                                            System.out.println("2-disponibilidad(Estado)");
                                                            System.out.println("3-precio");
                                                            System.out.println("4-siguiente");
                                                            int s = Integer.parseInt(sc.nextLine());
                                                            switch(s){
                                                                case 1->{
                                                                    System.out.println("ingrese el formato");
                                                                    String format = sc.nextLine();
                                                                    libroD.setFormato(format);
                                                                    System.out.println("FORMATO actualizado con exito: ");
                                                                }
                                                                case 2->{
                                                                    libroD.marcarNoDisponible(); 
                                                                    System.out.println("DISPONIBILIDAD actualizado con exito: ");
                                                                }
                                                                case 3->{libroD.actualizarPrecio(10);System.out.println("precio actualizado con exito: "+libroD.getPrecio_del_libro());}
                                                                case 4->{salir=true;}
                                                                default -> System.out.println("numero invalido");}      
                                                        }
                                                        catch(NumberFormatException e){System.out.println("ingrese un numero valido");}   
                                                    }
                                                }
                                            } 
                                        }
                                        case 3->{
                                            //comprar
                                            System.out.println("bienvenido a la buyzone");
                                            boolean cate=false;
                                            while(!cate){
                                                System.out.println("ingrese la categoria que desea y le apareceran los libros disponibles");
                                                String categoria = sc.nextLine();
                                                if(categoria.equals("")||categoria.equals(" ")){
                                                    System.out.println("ingrese un dato valido");
                                                }
                                                else{
                                                    totalv=totalv+buyzone("digital",categoria,d,f);
                                                    cate=true;   
                                                }
                                            }
                                        }
                                        //salir
                                        case 4->{exit=true;}
                                        default->{System.out.println("ingrese un numero valido");}
                                    }
                                }
                                catch(NumberFormatException e){System.out.println("ingrese un numero valido");}  
                            }
                        }
                    }
                    //verificamos que hayan libros fisicos
                    case 2 -> {
                        if (f.isEmpty()) {
                        System.out.println("No hay libros físicos registrados.");
                        }
                        else {
                            boolean exit=false;
                            while(!exit){
                                //excepcion
                                try{
                                    System.out.println("Libros Fisicos:");
                                    menuLibros();
                                    int z= Integer.parseInt(sc.nextLine());
                                    switch(z){
                                        //informacion
                                        case 1->{
                                            for (LibroFisico libroF : f) {
                                                libroF.mostrarInformación();
                                                System.out.println("--------------------");
                                            }
                                        }
                                        case 2->{
                                            //modificar
                                            boolean salir=false;
                                            while(!salir){
                                                System.out.println("se mostraran los titulos de los libros y la opcion que marco en orden seleccione cuando quiera modificarlo");
                                                System.out.println("solo es posible cambiar la disponibilidad y actualizar el precio con un descuento del 10% del libro por los momentos");
                                                for (LibroFisico libroF : f) {
                                                    System.out.println("titulo "+libroF.getTítulo_del_libro());
                                                    System.out.println("estado "+libroF.getEstado());
                                                    System.out.println("precio "+libroF.getPrecio_del_libro());
                                                    
                                                    System.out.println("--------------------\n");
                                                    salir=false;
                                                    while(!salir){
                                                        try{
                                                            System.out.println("1-disponibilidad");
                                                            System.out.println("2-precio");
                                                            System.out.println("3-siguiente");
                                                            int s = Integer.parseInt(sc.nextLine());
                                                            switch(s){
                                                                case 1->{
                                                                    libroF.marcarNoDisponible();
                                                                }
                                                                case 2->{libroF.actualizarPrecio(10);}
                                                                case 3->{salir=true;}
                                                                default -> System.out.println("numero invalido");
                                                            }      
                                                             
                                                        }
                                                        catch(NumberFormatException e){System.out.println("ingrese un numero valido");}   
                                                    }
                                                }
                                            }
                                        }
                                        case 3->{
                                            //comprar
                                            System.out.println("bienvenido a la buyzone");
                                            boolean cate=false;
                                            while(!cate){
                                                System.out.println("ingrese la categoria que desea y le apareceran los libros disponibles");
                                                String categoria = sc.nextLine();
                                                if(categoria.equals("")||categoria.equals(" ")){
                                                    System.out.println("ingrese un dato valido");
                                                }
                                                else{
                                                    totalv=totalv+buyzone("fisico",categoria,d,f);
                                                    cate=true;   
                                                }
                                            }
                                        }
                                        //salir
                                        case 4->{exit=true;}
                                        default->{System.out.println("dato invalido:");}
                                    }
                                }
                                catch(NumberFormatException e){System.out.println("ingrese un numero valido");}  
                            }
                        }
                    }
                    default -> System.out.println("Error: opción inválida");
                }       
            }
            catch(NumberFormatException e){System.out.println("ingrese un numero valido");}
        }  
        //retornamos lo que llevamos de ventas
        return totalv;
    }
    
    
    // metodo de compra
    public static double buyzone(String tipo,String categoria,ArrayList<LibroDigital> d, ArrayList<LibroFisico> f){
        Scanner sc =new Scanner(System.in);
        double vendido=0;
        switch(tipo){
            //comprar libro digital
            case "digital"->{
                System.out.println("aqui");
                for (LibroDigital libroD : d) {
                    if(libroD.getCategoria().equals(categoria) && libroD.getCantidad_disponibles()>0 && libroD.getEstado()==1 ){
                        System.out.println("Autor: "+libroD.getAutor_del_libro());
                        System.out.println("Titulo: "+libroD.getTítulo_del_libro());
                        System.out.println("Precio: "+libroD.getPrecio_del_libro());
                        System.out.println("--------------------");
                        boolean salir=false;
                        while(!salir){
                            try{
                                System.out.println("1- comprar");
                                System.out.println("2- siguiente");
                                int num=Integer.parseInt(sc.nextLine());
                                if(num==1){
                                    System.out.println("Transaccion realizada con exito disfrute el "+libroD.getTítulo_del_libro());
                                    libroD.Disponibilidad_y_Cantidad();
                                    vendido=vendido+libroD.getPrecio_del_libro();
                                    libroD.setCantidad_disponibles(libroD.getCantidad_disponibles()-1);
                                }
                                else{salir=true;}
                            }
                            catch(NumberFormatException e){System.out.println("ingrese un numero valido");}
                        }
                    }
                    if(libroD.getCategoria().equals(categoria)){System.out.println("no hay disponibilidad de esa categoria");}
                }
            }
            case "fisico"->{
                //comprar libro fisico
                for (LibroFisico libroF : f) {
                    if(libroF.getCategoria().equals(categoria)&& libroF.getCantidad_disponibles()>0 && libroF.getEstado()==1 ){
                        System.out.println("Autor: "+libroF.getAutor_del_libro());
                        System.out.println("Titulo: "+libroF.getTítulo_del_libro());
                        System.out.println("Precio: "+libroF.getPrecio_del_libro());
                        System.out.println("--------------------");
                        boolean salir=false;
                        while(!salir){
                            try{
                                System.out.println("1- comprar");
                                System.out.println("2- siguiente");
                                int num=Integer.parseInt(sc.nextLine());
                                if(num==1){
                                    System.out.println("Transaccion realizada con exito disfrute el "+libroF.getTítulo_del_libro());
                                    vendido=vendido+libroF.getPrecio_del_libro();
                                }
                                else{salir=true;}
                            }
                            catch(NumberFormatException e){System.out.println("ingrese un numero valido");}
                        }
                    }
                    if(!libroF.getCategoria().equals(categoria)){System.out.println("no hay disponibilidad de esa categoria");}
                }
            }
        }
        //verificamos si se vendio
        if(vendido>0){
            System.out.println("gracias por su compra");
            System.out.println("el total de su compra es de "+vendido);  
        }
        //retornamos lo vendido 
        return vendido;
    }   

}


    

