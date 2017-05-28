/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package entregajefe;

import java.util.ArrayList;

/**
 *
 * @author dmorenoar
 */
public class EntregaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Movil mov = new Movil("3210", MarcaMovil.NOKIA); 
       Movil mov2 = new Movil("Galaxy", MarcaMovil.SAMSUNG);
       Movil mov3 = new Movil("G3", MarcaMovil.MOTOROLLA);
       
       
       Funda funda = new Funda("lila",23.5);
       
       ArrayList<Movil> listaTienda = new ArrayList<Movil>();
       listaTienda.add(mov);
       listaTienda.add(mov2);
       listaTienda.add(mov3);
       
       mov.setFunda(funda);
       
       listaTienda.get(0).getFunda().getPrecio();
       
       
       
       mov.setFunda(funda);
       
       System.out.println("La funda:" + mov.getFunda().getColor());
       
       mov.deleteFunda();
       
       try{
        System.out.println("La funda:" + mov.getFunda().getColor());
       }catch(Exception e){
           System.out.println("No tienes funda niño!!!");
       }
       
       
       System.out.println(mov.getMarca());
        
       System.out.println(mov.getPantalla().getPulgadas());
       
    }
    
}
