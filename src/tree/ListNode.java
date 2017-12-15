/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author bruno
 */
public class ListNode extends GeneralNode {
    
    public GeneralNode node;
    public ListNode next;
    
    public ListNode(GeneralNode t2){
        super(t2.position);
        node = t2;
        next = null;
    }
    
   public ListNode(GeneralNode t2, ListNode l) {
        super(t2.position); // passa token de referência para construtor da

        // superclasse. É o mesmo que o do seu filho
        node = t2;
        next = l; // primeiro elemento da lista
    }
   
   public void add(GeneralNode t2) {
        if (next == null) { // verifica se é último da lista
            next = new ListNode(t2); // insere no final
        } else {
            next.add(t2); // insere após o próximo
        }
    }
}
