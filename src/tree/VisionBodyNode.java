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
public class VisionBodyNode extends GeneralNode{
    public ListNode l;

    public VisionBodyNode(Token t, ListNode l) {
        super(t);
        this.l = l;
    }    
}
