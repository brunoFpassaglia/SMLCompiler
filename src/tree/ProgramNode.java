/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import parser.Token;

/**
 *
 * @author bruno
 */
public class ProgramNode extends GeneralNode{
    public Token name;
    public ListNode l;

    public ProgramNode(Token name, ListNode l) {
        super(name);
        this.name = name;
        this.l = l;
    }
    
}
