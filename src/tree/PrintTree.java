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
public class PrintTree {
    int kk;

    public PrintTree() {
        kk = 1; // inicializa contador de nós
    }

    public void printRoot(ListNode x) {
        if (x == null) {
            //System.out.println("Empty syntatic tree. Nothing to be printed");
        } else {
            numberPrefixDeclListNode(x);
            //numberVisionClauseNode(v);
            printPrefixDeclListNode(x);
            //printVisionClauseNode(v);
        }

        System.out.println();
    }
    
    public void numberPrefixDeclListNode(ListNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        //numberPrefixDeclNode(x.node);
        numberPrefixDeclListNode(x.next);
        
    }

    public void printPrefixDeclListNode(ListNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": ListNode (PrefixDeclNode)  ===> " +
            x.position + " " +
            ((x.next == null) ? "null" : String.valueOf(x.next.number)));

        //printPrefixDeclNode((PrefixDeclNode) x.node);
        printPrefixDeclListNode(x.next);
    }
    
    
    /*-----------------------------DECLARAÇÃO DE PREFIXOS------------------------*/
    
    
     public void numberPrefixDeclNode(GeneralNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        //numberPrefixListNode(x.vars);
    }

    public void printPrefixDeclNode(PrefixDeclNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": PrefixDeclNode ===> " + x.position.image +
            " ");
        //printvarListNode(x.vars);
    }
    /*
    // -------------------- Declaracão de variável --------------------
    public void numberVarDeclNode(VarDeclNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numbervarListNode(x.vars);
    }

    public void printVarDeclNode(VarDeclNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": VarDeclNode ===> " + x.position.image +
            " " + x.vars.number);
        printvarListNode(x.vars);
    }
    
    /*---------------------visão------------------*/
    /*
    public void numberVisionClauseNode(VisionClauseNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberVisionBodyNode(x.vb);
    }

    public void printVisionClauseNode(VisionClauseNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": VisionClauseNode ===> " + x.name.image +
            " "  + " " +
            ((x.vb == null) ? "null" : String.valueOf(x.vb.number)));

        printVisionBodyNode(x.vb);
*/}
