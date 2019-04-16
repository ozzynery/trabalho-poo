/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author jnery
 */
public class HumanoTeste {
    
     public static void main(String[] args){
         Humano h1 = new Humano();
         h1.cor= "negra";
         h1.ehBipede= true;
         h1.nome= "Leticia";
         h1.idade= 0;
         Humano h2 = new Humano();
         h2.nome= "oliveira";
         h2.idade= 18;
         Humano h3 = new Humano();
         h3.nome= "andre";
         h3.idade= 28;
         Humano h4 = new Humano();
         h4.nome= "luis";
         h4.idade= 38;
         Humano h5 = new Humano();
         h5.nome= "livia";
         h5.idade= 48;
         Humano h6 = new Humano();
         h6.nome= "ruan";
         h6.idade= 58;
         
         if 
         ((h1.idade>h2.idade)&& (h1.idade>h3.idade)&& (h1.idade>h4.idade)&&(h1.idade>h5.idade)&&(h1.idade>h6.idade))
         System.out.println ( "humano mais velho:"+ h1.nome);
         else
         System.out.println("humano mais novo:"+ h1.nome);
         
         if 
         ((h6.idade>h1.idade)&& (h6.idade>h2.idade)&& (h6.idade>h3.idade)&&(h6.idade>h4.idade)&&(h6.idade>h5.idade))
         System.out.println("humano mais velho:"+h6.nome);
         else
         System.out.println("humano mais novo"+h6.nome);
         
             
     
         
         
                 
         
         
     }
}
