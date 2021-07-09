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
public class InstrumentoViento extends Object implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando Instrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Instrumento de viento");
    }

    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }
    
    
}
