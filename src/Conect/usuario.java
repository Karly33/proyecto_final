/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conect;

import java.util.Vector;

/**
 *
 * @author Rocketer
 */
public class usuario {
private String nick;
private String contraseña;
private String rango;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRango() {
        return rango;
    }
    public static int check(String Usuario){
    Vector lista = mostrar();
    usuario obj;
    for (int i=0;i<lista.size();i++){
    obj = (usuario)lista.elementAt(i);
    if(obj.getNick().equalsIgnoreCase(Usuario)){
    return i;
    
    }
    }
    return -1;
    }
    public static int verificar(String usuario, String contraseña){
    Vector lista = mostrar();
    usuario obj;
    for(int i=0;i<lista.size();i++){
    obj = (usuario) lista.elementAt(i);
    if(obj.getNick().equalsIgnoreCase(usuario)&& obj.getContraseña().equalsIgnoreCase(contraseña)){
    return i;
    }
    }
    return -1;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
   public static Vector mostrar(){
   return listaUsuario.mostrar();
}

}
