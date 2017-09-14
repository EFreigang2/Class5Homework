/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author Eric
 */
public interface Animal {
    public abstract String getPhylum();
    
    public abstract void setPhylum(String phylum);
    
    public abstract String getClasS();
    
    public abstract void setClasS(String clasS);
    
    public abstract String getGenus();
    
    public abstract void setGenus(String genus);
    
    public abstract String getSpecies();
    
    public abstract void setSpecies(String species);
}
