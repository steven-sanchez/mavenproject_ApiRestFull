/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myhouse.dao;

import com.myhouse.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ProductoDAO {
    
    public static List<Producto> getProductos()
    {
        List<Producto> lista = new ArrayList();
        
        Producto producto = new Producto(1, "HARINA", 500);
        Producto producto2 = new Producto(2, "PASTA", 1500);
        Producto producto3 = new Producto(3, "FRIJOL", 2500);
        Producto producto4 = new Producto(4, "PAPAYA", 3500);
        Producto producto5 = new Producto(5, "GUACAMOLE", 4500);
        
        lista.add(producto);
        lista.add(producto2);
        lista.add(producto3);
        lista.add(producto4);
        lista.add(producto5);
        
        return lista;
        
        
    }
    
    
    
}
