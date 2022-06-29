/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosDto;

/**
 *
 * @author Rocketer
 */
public class Datos {
   String nombre;
    String categoria;
    String ocupacion;
    int salario;
    int bono;
    
    int matricula;

    public Datos() {
    }

    public Datos(String nombre, String categoria, String ocupacion, int salario, int bono, int matricula) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.ocupacion = ocupacion;
        this.salario = salario;
        this.bono = bono;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
    
    public String [] getArray(){
        String[] datos = {nombre, categoria, ocupacion, String.valueOf(salario), String.valueOf(bono), String.valueOf(matricula)};
         return datos;
    }  
}
