/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro_Alumnos;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        static Lista lista = new Lista();
    static Scanner sc = new Scanner(System.in);
    static Alumno alumno;
    public static void NewMain(String[] args) {
        
        boolean salir = false;
        
        while (!salir){
            
        JOptionPane.showMessageDialog(null, "Seleccione lo que desea hacer");
        String Eleccion = JOptionPane.showInputDialog(null, "1. Añadir un nuevo alumno \n2. Buscar un alumno"
                + "\n3. Eliminar un alumno\n4.Mostrar el listado de alumnos\n5.Salir");
        int eleccion = Integer.parseInt(Eleccion);
        
        switch(eleccion){
            case 1: añadir();
                JOptionPane.showMessageDialog(null, "Alumno Registrado");
                break;
            case 2: 
                String Carne = JOptionPane.showInputDialog(null, "Ingrese el carné del alumno que desea buscar");
                int CarneBusqueda = Integer.parseInt(Carne);
                lista.BuscarAlumno(CarneBusqueda);
                break; 
            case 3: 
                String Carne2 = JOptionPane.showInputDialog(null, "Ingrese el carné del alumno que desea eliminar");
                int CarneEliminar = Integer.parseInt(Carne2);
                lista.EliminarAlumno(CarneEliminar);
                break;
            case 4: 
                System.out.println("------------------------------------------------------");
                lista.mostrarLista();
                break;
            case 5: salir = true;
                break;
            case 6: default: JOptionPane.showMessageDialog(null, "La opción que seleccionó no existe, seleccione otra");
                break;
        }
        }
  
    }
     public static void añadir(){
         String Nombre, Apellido, Email, Carnet;
         int Carne;
         
         Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
         Apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido");
         Email = JOptionPane.showInputDialog(null, "Ingrese el email");
         Carnet = JOptionPane.showInputDialog(null, "Ingrese el carné");
         Carne = Integer.parseInt(Carnet);
         lista.agregar(new Alumno(Nombre, Apellido, Email, Carne));
         
    }
} // TODO code application logic here
    
    

