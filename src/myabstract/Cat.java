/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author Eric
 */
public class Cat extends Mammal {
    private String catType;

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        if (catType == null){
            throw new IllegalArgumentException("The cat must have a type (wild, tabby, black, persian, etc)");
        }
        this.catType = catType;
    } 
}
