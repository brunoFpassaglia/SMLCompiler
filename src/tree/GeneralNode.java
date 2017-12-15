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
abstract public class GeneralNode {
    public Token position;
    public int number;

    public GeneralNode(Token position) {
        this.position = position;
        number = 0;
    }
}
