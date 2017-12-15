/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;
import parser.*;

/**
 *
 * @author bruno
 */
public class VariableDeclNode extends GeneralNode {
    //public Token t;
    public ListNode l;

    public VariableDeclNode(Token t, ListNode l) {
        super(t);

        this.l = l;
    }
    
    
}
