/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package entregajefe;

/**
 *
 * @author dmorenoar
 */
public class Movil {    
    private MarcaMovil marca= MarcaMovil.ALCATEL;
    private String modelo;
    Pantalla pantalla = new Pantalla(); 
    Funda funda;

    public Movil() {    }
    
    public Movil(String modelo, MarcaMovil marca) {
        this.modelo = modelo;
        this.marca = MarcaMovil.ALCATEL;
    }

    public MarcaMovil getMarca() {
        return marca;
    }

    public void setMarca(MarcaMovil marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Funda getFunda() {
        return funda;
    }
    
    public void deleteFunda(){
        this.funda = null;
    }

    public void setFunda(Funda funda) {
        this.funda = funda;
    }
    
   
    
}
