/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author David
 */
public class Producto {

    private String codProducto;
    private String descProducto;
    private int exstProducto;
    private int valrProducto;
    private boolean habilitado;

    public Producto(String codigo, String descripcion, int existencia, int valor) { // Objeto de Tipo Producto 
        this.codProducto = codigo;
        this.descProducto = descripcion;
        this.exstProducto = existencia;
        this.valrProducto = valor;
        this.habilitado = true;
    }

    public String ToString() { //Metodo que retorna el Codigo y la Descripcion del Producto
        return this.getCodProducto() + ", " + this.getDescProducto() + ", " + this.getExstProducto() + ", " +this.getValrProducto();
    }

    /**
     * @return the codProducto
     */
    public String getCodProducto() {
        return codProducto;
    }

    /**
     * @param codProducto the codProducto to set
     */
    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    /**
     * @return the descProducto
     */
    public String getDescProducto() {
        return descProducto;
    }

    /**
     * @param descProducto the descProducto to set
     */
    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    /**
     * @return the exstProducto
     */
    public int getExstProducto() {
        return exstProducto;
    }

    /**
     * @param exstProducto the exstProducto to set
     */
    public void setExstProducto(int exstProducto) {
        this.exstProducto = exstProducto;
    }

    /**
     * @return the valrProducto
     */
    public int getValrProducto() {
        return valrProducto;
    }

    /**
     * @param valrProducto the valrProducto to set
     */
    public void setValrProducto(int valrProducto) {
        this.valrProducto = valrProducto;
    }

    /**
     * @return the habilitado
     */
    public boolean isHabilitado() {
        return habilitado;
    }

    /**
     * @param habilitado the habilitado to set
     */
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

}
