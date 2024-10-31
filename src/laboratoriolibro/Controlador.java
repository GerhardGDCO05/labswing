/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriolibro;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Controlador extends Libro {
    private static final ArrayList<LibroDigital> arrayD= new ArrayList<>();
    private static final ArrayList<LibroFisico> arrayF= new ArrayList<>();
    private double totalventas; 

    public Controlador(double totalventas) {
        this.totalventas = totalventas;
    }

    public Controlador() {
    }

    
    
    
    public boolean leerdatosDigitales(String cod,String tit,String autor,String costo,String categoria,String cantidad,String publicacion,String formato,String tamano,String mbgb,String precio){
        LibroDigital ld = new LibroDigital();
        boolean valor=true;
        String tam= tamano+mbgb;
        valor=verificarDigital(cod);
        if(valor){
            valor=ld.leerdatosD(formato,tam,cod,tit,autor,costo,cantidad,categoria,publicacion,precio);

            if(valor){
                String x=tam;
                int ganancia= Integer.parseInt(precio);
                int pub=Integer.parseInt(publicacion);
                int cant = Integer.parseInt(cantidad);
                double costototal=Double.parseDouble(costo.replace(",", "."));
                double total = ld.calcularPrecioDelLibro(ganancia,costototal);
                ld.setCódigo_del_libro(cod);
                ld.setTítulo_del_libro(tit);
                ld.setAutor_del_libro(autor);
                ld.setAño_publicacion(pub);
                ld.setCantidad_disponibles(cant);
                ld.setCosto_del_libro(costototal);
                ld.setCategoria(categoria);
                ld.setFormato(formato);
                ld.setTamañoacrhivo(x);
                ld.setEstado(1);
                ld.setPrecio_del_libro(total);
                this.agregarDigital(ld);
            }
        }
        return valor;
    }
    public void agregarDigital(LibroDigital libroD){
            arrayD.add(libroD);
    }
    public boolean verificarDigital(String codigo){
        JFrame frame = new JFrame();
        if(arrayD.isEmpty()==false){
            for(LibroDigital libroD:arrayD){
                if(libroD.getCódigo_del_libro().equals(codigo)){
                    JOptionPane.showMessageDialog(frame, "CODIGO YA EXISTENTE", "RECHAZADO", JOptionPane.CANCEL_OPTION);
                    return false;
                }  
            }
        }
        return true;
    }
    
    
 //-------------------------------------------------------------------------------------------------------------------------------------   
    
    
    public boolean leerdatosFisicos(String cod,String tit,String autor,String cantidad,String categoria,String costolibro,String publicacion,String precio,String peso,String costoenvio){
        LibroFisico lf = new LibroFisico();
        boolean valor=true;
        valor=verificarFisico(cod);
        if(valor){
            valor=lf.leerdatosF(cod,tit,autor,cantidad,categoria,costolibro,publicacion,precio,peso,costoenvio);
            if(valor){
                int ganancia= Integer.parseInt(precio);
                int pub=Integer.parseInt(publicacion);
                int cant = Integer.parseInt(cantidad);
                Double totalcostoenvio=Double.parseDouble(costoenvio.replace(",", "."));
                double pesototal=Double.parseDouble(peso.replace(",", "."));
                double costototal=Double.parseDouble(costolibro.replace(",", "."));
                double total = lf.calcularPrecioDelLibro(ganancia,costototal);
                double totalprecio = lf.getCosto_envio() + total;
                lf.setCódigo_del_libro(cod);
                lf.setTítulo_del_libro(tit);
                lf.setAutor_del_libro(autor);
                lf.setAño_publicacion(pub);
                lf.setCantidad_disponibles(cant);
                lf.setCosto_del_libro(costototal);
                lf.setCategoria(categoria);
                lf.setPeso(pesototal);
                lf.setCosto_envio(totalcostoenvio);
                lf.setEstado(1);
                lf.setPrecio_del_libro(totalprecio);
                this.agregarFisico(lf);
            }
        }
        return valor;
    }

    public void agregarFisico( LibroFisico libroF){
        arrayF.add(libroF);
    }
    public boolean verificarFisico(String codigo){
        JFrame frame = new JFrame();
        if(arrayF.isEmpty()==false){
            for(LibroFisico libroF:arrayF){
                if(libroF.getCódigo_del_libro().equals(codigo)){
                    JOptionPane.showMessageDialog(frame, "CODIGO YA EXISTENTE", "RECHAZADO", JOptionPane.CANCEL_OPTION);
                    return false;
                }  
            }
        }
        return true;
    }
//-----------------------------------------------------------------------------------------------------
    
    public  ArrayList<LibroDigital> buscarInfoDigitales(){
        return arrayD;
    }
    public  ArrayList<LibroFisico> buscarInfoFisicos(){
        return arrayF;
    }
    
//-----------------------------------------------------------------------------------------------------
    public ArrayList<LibroDigital> BuscarCodigoDigitales(String codigo){
        ArrayList<LibroDigital>  Digitales= new ArrayList<>();
        if(arrayD.isEmpty()==false){
            for(LibroDigital libroD:arrayD){
                if(libroD.getCódigo_del_libro().equals(codigo)){
                    Digitales.add(libroD);
                    break;
                }  
            }
        }

        return Digitales;
    }
    
    public ArrayList<LibroFisico> BuscarCodigoFisico(String codigo){
        ArrayList<LibroFisico>  Fisicos= new ArrayList<>();
        if(arrayF.isEmpty()==false){
            for(LibroFisico libroF:arrayF){
                if(libroF.getCódigo_del_libro().equals(codigo)){
                    Fisicos.add(libroF);
                    break;
                }  
            }
        }

        return Fisicos;
    }
//------------------------------------------------------------------------------
    public  boolean eliminarDigitales(ArrayList<LibroDigital>  ed){
        Iterator<LibroDigital> iterator = arrayD.iterator();
        boolean valor=false;
        while (iterator.hasNext()) {
            LibroDigital ld = iterator.next(); // Obtiene el siguiente elemento

            for (LibroDigital elimD : ed) {
                if (elimD.getCódigo_del_libro().equals(ld.getCódigo_del_libro())) {
                    iterator.remove();// Elimina el elemento usando el iterador
                    valor=true ;
                    break; // Sale del bucle interno una vez que se elimina
                }
            }
        }
        return valor;
    }
    public  boolean eliminarFisicos(ArrayList<LibroFisico>  ef){
        Iterator<LibroFisico> iterator = arrayF.iterator(); 
        boolean valor=false;
        while (iterator.hasNext()) {
            LibroFisico lf = iterator.next(); // Obtiene el siguiente elemento

            for (LibroFisico elimD : ef) {
                if (elimD.getCódigo_del_libro().equals(lf.getCódigo_del_libro())) {
                    iterator.remove(); // Elimina el elemento usando el iterador
                    valor=true ;
                    break; // Sale del bucle interno una vez que se elimina
                }
            }
        }
        return valor;
    }
//------------------------------------------------------------------------------
    public  void modificarD(ArrayList<LibroDigital>  ed){
        JFrame frame = new JFrame();
        for(LibroDigital md:ed){
            for(LibroDigital d:arrayD){
                if(d.getCódigo_del_libro().equals(md.getCódigo_del_libro())){
                    d.setTítulo_del_libro(md.getTítulo_del_libro());
                    d.setAutor_del_libro(md.getAutor_del_libro());
                    d.setCosto_del_libro(md.getCosto_del_libro());
                    d.setCantidad_disponibles(md.getCantidad_disponibles());
                    d.setCategoria(md.getCategoria());
                    d.setAño_publicacion(md.getAño_publicacion());
                    d.setFormato(md.getFormato());
                    d.setTamañoacrhivo(md.getTamañoacrhivo());
                    JOptionPane.showMessageDialog(frame, "MODIFICADO CON EXITO", "APROVADO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        }
    }
    public void modificarF(ArrayList<LibroFisico>  ef){
        JFrame frame = new JFrame();
        for(LibroFisico mf:ef){
            for(LibroFisico f:arrayF){
                if(f.getCódigo_del_libro().equals(mf.getCódigo_del_libro())){
                    f.setTítulo_del_libro(mf.getTítulo_del_libro());
                    f.setAutor_del_libro(mf.getAutor_del_libro());
                    f.setCosto_del_libro(mf.getCosto_del_libro());
                    f.setCantidad_disponibles(mf.getCantidad_disponibles());
                    f.setCategoria(mf.getCategoria());
                    f.setAño_publicacion(mf.getAño_publicacion());
                    f.setCosto_envio(mf.getCosto_envio());
                    f.setPeso(mf.getPeso());
                    JOptionPane.showMessageDialog(frame, "MODIFICADO CON EXITO", "APROVADO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        }
    }
//------------------------------------------------------------------------------
    public void comprarD(ArrayList<LibroDigital>  d,String cant ){
        JFrame frame = new JFrame();
        int cantidad=Integer.parseInt(cant);
        for(LibroDigital comprar : d){
            for(LibroDigital listadigitales:arrayD ){
                if(listadigitales.getCódigo_del_libro().equals(comprar.getCódigo_del_libro())){
                    if(comprar.getCantidad_disponibles()<cantidad){
                        listadigitales.setCantidad_disponibles(listadigitales.getCantidad_disponibles()- cantidad);
                        this.setTotalventas(cantidad*listadigitales.getPrecio_del_libro());
                        if(listadigitales.getCantidad_disponibles()==0){listadigitales.setEstado(0);}
                        break;
                    }
                    else{JOptionPane.showMessageDialog(frame, "NO HAY SUFICIENTES LIBROS LA CANTIDAD PEDIDA ES MAYOR A LA DISPONIBLE", "ERROR", JOptionPane.ERROR_MESSAGE);}
                }
            }
        }
        
    }
    public void comprarf(ArrayList<LibroFisico>  F,String cant ){
        JFrame frame = new JFrame();
        int cantidad=Integer.parseInt(cant);
        for(LibroFisico comprar : F){
            for(LibroFisico listafisicos:arrayF ){
                if(listafisicos.getCódigo_del_libro().equals(comprar.getCódigo_del_libro())){
                    if(listafisicos.getCantidad_disponibles()<=cantidad){
                        listafisicos.setCantidad_disponibles(listafisicos.getCantidad_disponibles()- cantidad);
                        this.setTotalventas(cantidad*listafisicos.getPrecio_del_libro());
                        if(listafisicos.getCantidad_disponibles()==0){listafisicos.setEstado(0);}
                        break;
                    }
                    else{JOptionPane.showMessageDialog(frame, "NO HAY SUFICIENTES LIBROS LA CANTIDAD PEDIDA ES MAYOR A LA DISPONIBLE", "ERROR", JOptionPane.ERROR_MESSAGE);}
                }
            }
        }
        
    }

    public double getTotalventas() {
        return totalventas;
    }

    public void setTotalventas(double totalventas) {
        this.totalventas = totalventas;
    }
    
    
}




        

       
       
