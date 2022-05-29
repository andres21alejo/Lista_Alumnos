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
public class Lista {
  Alumno alumno;
    static Scanner sc = new Scanner(System.in);
    protected Nodo inicio, fin;

    public Lista() {
        inicio = null;
        fin = null;
    }
    
    public boolean estaVacia(){
	if(this.inicio == null){
		return true;
        }
	return false;
    }
    
//    public void PedirDatos(){
//        System.out.println("Ingrese el nombre");
//        alumno.nombre = sc.next();
//        System.out.println("Ingrese el apellido");
//        alumno.apellido = sc.next();
//        System.out.println("Ingrese el carne");
//        alumno.carne = sc.nextInt();
//        System.out.println("Ingrese el email");
//        alumno.email = sc.next();
//    }
//    
    public void agregar(Alumno alumno){
        Nodo actual;
        if(estaVacia()){
            actual = new Nodo(alumno, null);
            inicio = actual;
            fin = actual;
        }else{
            actual = new Nodo(alumno, null);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }
    public void mostrarLista(){
        int contador = 1;
        if (estaVacia()){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }else{
            Nodo aux;
            aux = inicio;
            while(aux!=null){
                System.out.println(contador + ". " + aux.getAlumno().toString());
                aux = aux.getSiguiente();
                contador = contador +1;
            }
        }
        
      }
    
    public void BuscarAlumno(int Carne){
        if(estaVacia()){
           JOptionPane.showMessageDialog(null, "La lista está vacía");
           return;
       }else{
           Nodo temporal;
           temporal = inicio;
           while(temporal!=null){
               if (Carne == temporal.getAlumno().getCarne()){
               JOptionPane.showMessageDialog(null, temporal.getAlumno().toString());
               break;
               }
               temporal = temporal.getSiguiente();
           }
        }
    }
    public void EliminarAlumno(int Carne2){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        } else{
            if(inicio == fin && Carne2 == inicio.alumno.getCarne()){
                inicio = fin = null;
            } else if(Carne2 == inicio.alumno.getCarne()){
                inicio = inicio.siguiente;
            } else{
                Nodo anterior, temporal;
                anterior = inicio;
                temporal = inicio.siguiente;
                
                while(temporal != null && Carne2 != temporal.alumno.getCarne() ){
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                if (temporal!= null){
                    anterior.siguiente = temporal.siguiente;
                    if(temporal == fin){
                        this.fin = anterior;
                    }
                }
            }
        }
    }
    }    

