/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadadosaula07042020;

/**
 *
 * @author diegoubuntu
 */
public class App2 {

    /**
     * Questão 2 - Exercicios: 
     * Dada uma lista encadeada de letras "No caso deste exemplo numeros", troque a primeira letra da lista por X.
     * 1 = A; 2 = B; 3 = C e X = 4.
     * Foi resolvido de duas formas a Primeira solução foi remover o inicio com removeInicio e Adicionar com insereInicio X simbolizada por 4.
     * Segunda Solução Alterar direto no inicio com a função prim.dado prim.dado=4
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Lista l1 = new Lista();
       
       //Iniciando a lista
        l1.insereInicio(2);
    
        l1.insereInicio(1);
        
        l1.insereInicio(3);
        
        //Solucao 1 remover o valor inicio
        l1.removeInicio();
        
        //Inserir o novo inicio
        l1.insereInicio(4);
        
        // l1.prim.dado=4;
    
        l1.mostraLista();
        
        
      
        
        

    
    }
    
}
