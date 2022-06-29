package Conect;

import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rocketer
 */
public class listaUsuario {
 private static Vector<usuario> datos = new Vector<usuario>();
 public static void agregar(usuario obj){
 datos.addElement(obj);
 }
 public static void eliminar(int pos){
 datos.removeElementAt(pos);
 }
 public static Vector mostrar(){
 return datos;
 }
}
