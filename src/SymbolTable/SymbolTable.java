/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymbolTable;

/**
 *
 * @author bruno
 */
public class SymbolTable {
    
    public EntryTable top;
    
    public int scope;
    
    public SymbolTable(){
        top = null;
        scope = 0;
    }
    
    public void add(EntryTable x){
        x.next = top;
        top = x;
        x.scope = scope;
        x.mytable = this;
    }
    
    public void beginScope(){
        scope++;
    }
    
    public void endScope(){
        while(top != null && top.scope == scope)
            top = top.next;
        scope--;
    }
    
}
