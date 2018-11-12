/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_metodos_estaticos;

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class EVA2_4_METODOS_ESTATICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Operaciones oObj = new Operaciones();
        System.out.println("Hola" + Operaciones.iValor);
        System.out.println(Math.cos(50));
        
    }
    
}
class Operaciones{
    static int iValor = 100;
    public static int suma(int iVall, int iVal2){
        return iVall + iVal2;
    }
    public static String suma(String sVall, String sVal2){
        return sVall + sVal2;//CONCATENADO
    }
    public static boolean suma(boolean bVal1, boolean bVal2){
        return bVal1 && bVal2; //AND
    }
}
