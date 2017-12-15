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
public class VisionClauseNode extends GeneralNode{
    public Token name;
    public VisionBodyNode vb;

    public VisionClauseNode(Token name, VisionBodyNode vb) {
        super(name);
        this.name = name;
        this.vb = vb;
    }
    
    
}
