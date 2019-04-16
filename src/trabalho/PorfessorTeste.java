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
public class PorfessorTeste {
    
    public static void main(String[] args){
        
        Professor pr1 = new Professor();
        pr1.nome = "pr oliveira";
        
        Professor pr2 = new Professor();
        pr2.idade = 30;
        
        Professor pr3 = new Professor();
        pr3.nascimento = "16/18/89";
        
        Professor pr4 = new Professor();
        pr4.turma = " b4 ";
        
        Professor pr5 = new Professor();
        pr5.disciplina = "historia";
        
        System.out.println("nome:"+pr1.nome+",idade:"+pr2.idade+" , nascimento:"+pr3.nascimento+", turma:"+pr4.turma+", disciplina:"+pr5.disciplina);
        
    }
    
}
