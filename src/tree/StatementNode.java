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
public class StatementNode extends GeneralNode {
    public Token t1;
    public Token t2;
    
    public StatementNode(Token t, Token t2) {
        super(t);
        t1 = t;
        this.t2 = t2;
    }
    
}
