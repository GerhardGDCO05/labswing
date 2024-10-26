/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_libro;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Arrays {
    private static ArrayList<LibroDigital> arrayD= new ArrayList<>();
     private static ArrayList<LibroFisico> arrayF= new ArrayList<>();

    public Arrays() {
    }
    public static void agregarDigital(LibroDigital libroD){
        arrayD.add(libroD);
        
    }
    public static void agregarFisico( LibroFisico libroF){
        arrayF.add(libroF);
        
    }

    
    
}
