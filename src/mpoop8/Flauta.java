/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop8;

/**
 *
 * @author Benchi
 */
public class Flauta extends InstrumentoViento {
    //Puede sobreescribir algún metodo y agregar funcionalidades
    
    public void tocarHimnoALaAlegria(){
        System.out.println("Tocando himno a la Alegria");
    }
    
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
}
