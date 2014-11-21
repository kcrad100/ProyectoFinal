/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Cliente implements Serializable {

    private String idCliente, nomCliente, dirCliente, telCliente, emailCliente, categoriaCliente;
    private boolean habilitado;

    public Cliente(String idCliente, String nombre, String direccion, String telefono, String email, String categoria) { //Objeto Cliente con sus atributos
        this.idCliente = idCliente;
        this.nomCliente = nombre;
        this.dirCliente = direccion;
        this.telCliente = telefono;
        this.emailCliente = email;
        this.categoriaCliente = categoria;
        this.habilitado = true;
    }

    public String ToString() { // metodo que regresa los atributos del Cliente
        return this.getIdCliente() + "  " + this.getNomCliente() + "    " + this.getDirCliente() + "    " + this.getTelCliente() + "    " + this.getEmailCliente();
    }

    /**
     * @return the idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nomCliente
     */
    public String getNomCliente() {
        return nomCliente;
    }

    /**
     * @param nomCliente the nomCliente to set
     */
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    /**
     * @return the dirCliente
     */
    public String getDirCliente() {
        return dirCliente;
    }

    /**
     * @param dirCliente the dirCliente to set
     */
    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

    /**
     * @return the telCliente
     */
    public String getTelCliente() {
        return telCliente;
    }

    /**
     * @param telCliente the telCliente to set
     */
    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    /**
     * @return the emailCliente
     */
    public String getEmailCliente() {
        return emailCliente;
    }

    /**
     * @param emailCliente the emailCliente to set
     */
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    /**
     * @return the categoriaCliente
     */
    public String getCategoriaCliente() {
        return categoriaCliente;
    }

    /**
     * @param categoriaCliente the categoriaCliente to set
     */
    public void setCategoriaCliente(String categoriaCliente) {
        this.categoriaCliente = categoriaCliente;
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
