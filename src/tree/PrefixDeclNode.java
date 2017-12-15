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
public class PrefixDeclNode extends GeneralNode{
    public Token name;

    public PrefixDeclNode(Token position, Token name) {
        super(name);
        this.name = name;
    }    
}
