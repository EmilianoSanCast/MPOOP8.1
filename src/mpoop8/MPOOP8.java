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
public class MPOOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poligono poligono;  //apunta a null
        //System.out.println(poligono); aqui no seria posible ejecutarla 
        poligono = new Poligono(); //poligono apunta al objeto creado por Poligono()
        System.out.println(poligono);
        
        Object objeto = poligono;   //objeto apunta a lo que apunta poligono, sin apuntar a poligono
                                    //objeto apunta al objeto creado por Poligono
        
        System.out.println(objeto);
        
        //una referencia puede ser reasignada a otros objetos
        
        poligono = new Triangulo();
        System.out.println(poligono);
        System.out.println(objeto);
        
        objeto = new Cuadrilatero();
        System.out.println(objeto);
        
        //poligono.setBase(6.5);
        poligono.area();
        
        queTipoEs(poligono);
        
        poligono = new Cuadrilatero();
        queTipoEs(poligono);
        
        System.out.println("###########Interfaz############");
        //Se puede crear una referencia a la interfaz pero, no es posible instanciarla
        InstrumentoMusical inst;
        //inst = new InstrumentoMusical();
        
        
        //A una referencia a la interfaz puede ser asignada cualquier objeto que la implemente
        inst = new Flauta();
        inst.tocar();
        System.out.println(inst.tipoInstrumento());
        
        
    }
    
    public static void queTipoEs(Poligono p){
        if (p instanceof Triangulo){
            Triangulo t = (Triangulo)p;
            System.out.println("Triangulo con base "+t.getBase());
        }else if (p instanceof Cuadrilatero){
            Cuadrilatero c = (Cuadrilatero)p;
            System.out.println("Cuadrilatero");
            
            
            
        }
    }
}
