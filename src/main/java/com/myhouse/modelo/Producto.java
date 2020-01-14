/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myhouse.modelo;

/**
 *
 * @author macbook
 */
public class Producto {

    private int id;
    private String nombre;
    private float precio;
    
    
    public Producto(){
        
    }
    
     public Producto(int id, String nombre, float precio){
         
         this.id = id;
         this.nombre = nombre;
         this.precio = precio;
         
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
     @Override
    public int hashCode(){
        int hash=5;
        hash = 37 * hash + this.id;
        return hash;
    }
    
    
     @Override
    public boolean equals(Object obj){
        
        if (this== obj){
            return true;
        }
            return false;
        
    }
    
   
    
    
    

}
