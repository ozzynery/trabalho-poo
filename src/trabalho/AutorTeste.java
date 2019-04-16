/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author HP
 */
public class AutorTeste {
    
    public static void main(String[] args){
    
    Autor aut1 = new Autor();
    aut1.nome="George R.R. Martin";
    System.out.println(aut1.nome);
    
    Autor sex = new Autor();
    sex.sexo = 'M';
    
    Autor nac = new Autor();
    nac.nacionalidade = "eua";
    
    Autor esc = new Autor();
    esc.escolaridade = "doutorado";        
    
    Autor dat = new Autor();
    dat.dataDeNascimento = "17/09/1965";
    
    Autor cid = new Autor();
    cid.cidadeNatal = "dalas";
    
    System.out.println("sexo:"+sex.sexo+" ,nacionaliodade: "+nac.nacionalidade+", esolaridade: "+esc.escolaridade+" , data nascimento:"+ dat.dataDeNascimento+", cidade: "+cid.cidadeNatal);
}
}
