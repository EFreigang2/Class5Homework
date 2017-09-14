/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author Eric
 */
public class Mammal extends Animal{
    private String dietType;

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        if (dietType == null){
            throw new IllegalArgumentException("All Mammals must eat");
        }
        this.dietType = dietType;
    }
    
    
}
