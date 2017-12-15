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
public abstract class EntryTable {
    
    
    public String name;
    
    public EntryTable next;
    
    public int scope;
    
    public SymbolTable mytable;
    
}
