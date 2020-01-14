/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myhouse.servicios;

import com.myhouse.dao.ProductoDAO;
import com.myhouse.modelo.Producto;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author macbook
 */

@Path("Productos")
public class ProductoServicio {
    
    private static List<Producto> lista = ProductoDAO.getProductos();
    
    // Metodo para mostrar todos los productos
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProductos(){
      
        return Response.ok(lista).build();
    }
    
   
    // metodo que busca un solo producto
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducto(@PathParam("id")int id){
        
        id = id +id;
        return Response.ok(id).build();
        
        
      /*        
        Producto producto = new Producto();
        producto.setId(id);
        
        if(lista.contains(producto))
           {
            
               for(Producto obj: lista)
                   if (obj.getId()==id)
                       return Response.ok(obj).build();
              }
             return Response.status(Response.Status.NOT_FOUND).build();
        */
        
    }
    
    
    
}
