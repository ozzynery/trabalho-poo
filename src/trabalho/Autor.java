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
public class Autor {
    String nome;
    String nacionalidade;
    String escolaridade;
    char sexo;
    String dataDeNascimento;
    String cidadeNatal;
    
    public String data(){
      return this.dataDeNascimento;
    }
    
    public void mostrarNomeAutor(){
        nome="George R.R. Martin";
    }
     
     public void cadastrarNomeAutor(){
         Autor aut1 = new Autor();
         aut1.nome="George R.R. Martin";
    
}
}
