/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro_Alumnos;

/**
 *
 * @author User
 */
public class Nodo {
   Alumno alumno;
    public Nodo siguiente;

//    public Nodo(Alumno alumno) {
//        this.alumno = alumno;
//    }

    public Nodo(Alumno alumno, Nodo siguiente) {
        this.alumno = alumno;
        this.siguiente = siguiente;

    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
}  
