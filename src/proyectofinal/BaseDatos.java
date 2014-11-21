/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class BaseDatos implements Serializable {
    
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
    
        public boolean validarCliente(Cliente clie, int indexIterator) {
        boolean retorno = true;

        for (int i = 0; i < clientes.size(); i++) {
            if (clie.getIdCliente().trim().equalsIgnoreCase(clientes.get(i).getIdCliente().trim())) {
                if (i != indexIterator) {
                    retorno = false;
                    break;
                }
            }

        }
        return retorno;
    }
        public boolean validarProducto(Producto prod, int indexIterator) {
        boolean retorno = true;

        for (int i = 0; i < productos.size(); i++) {
            if (prod.getCodProducto().trim().equalsIgnoreCase(productos.get(i).getCodProducto().trim())) {
                if (i != indexIterator) {
                    retorno = false;
                    break;
                }
            }

        }
        return retorno;
    }
    
}
