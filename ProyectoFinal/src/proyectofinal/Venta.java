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
public class Venta {

    private String consecVenta, fechaVenta, idClien, codProd;
    private int cantProdVenta, valorTotalVenta;
    private boolean habilitado;

    public Venta(String consecutivo, String fecha, String idCliente, String codProducto, int cantidad, int valorTotal) { // Objeto de tipo Venta
        this.consecVenta = consecutivo;
        this.fechaVenta = fecha;
        this.idClien = idCliente;
        this.codProd = codProducto;
        this.cantProdVenta = cantidad;
        this.valorTotalVenta = valorTotal;
    }

    public String ToString() { //Metodo que devuelve el Consecutivo, la Fecha y el Valor de la Venta
        return this.getConsecVenta() + "," + this.getFechaVenta() + "," + this.getValorTotalVenta();
    }

    /**
     * @return the consecVenta
     */
    public String getConsecVenta() {
        return consecVenta;
    }

    /**
     * @param consecVenta the consecVenta to set
     */
    public void setConsecVenta(String consecVenta) {
        this.consecVenta = consecVenta;
    }

    /**
     * @return the fechaVenta
     */
    public String getFechaVenta() {
        return fechaVenta;
    }

    /**
     * @param fechaVenta the fechaVenta to set
     */
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     * @return the idClien
     */
    public String getIdClien() {
        return idClien;
    }

    /**
     * @param idClien the idClien to set
     */
    public void setIdClien(String idClien) {
        this.idClien = idClien;
    }

    /**
     * @return the codProd
     */
    public String getCodProd() {
        return codProd;
    }

    /**
     * @param codProd the codProd to set
     */
    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }

    /**
     * @return the cantProdVenta
     */
    public int getCantProdVenta() {
        return cantProdVenta;
    }

    /**
     * @param cantProdVenta the cantProdVenta to set
     */
    public void setCantProdVenta(int cantProdVenta) {
        this.cantProdVenta = cantProdVenta;
    }

    /**
     * @return the valorTotalVenta
     */
    public int getValorTotalVenta() {
        return valorTotalVenta;
    }

    /**
     * @param valorTotalVenta the valorTotalVenta to set
     */
    public void setValorTotalVenta(int valorTotalVenta) {
        this.valorTotalVenta = valorTotalVenta;
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
