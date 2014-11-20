/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class BaseDatos {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;
    private ArrayList<Venta> ventas;
    
    public BaseDatos(){
        this.clientes = new ArrayList<Cliente>(); // inicializa el ArrayList de tipo Clientes
        this.productos = new ArrayList<Producto>();// Inicializa el ArrayList de tipo Producto
        this.ventas = new ArrayList<Venta>();// Inicializa el ArrayList de tipo Venta
    }

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @return the productos
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    /**
     * @return the ventas
     */
    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    
}
