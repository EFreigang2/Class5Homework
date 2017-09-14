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
public class Animal {
    private String animalPhylum;
    private String animalClass;
    private String animalOrder;
    private String animalFamily;
    private String animalGenus;
    private String animalSpecies;
    private String commonName;

    public String getAnimalPhylum() {
        return animalPhylum;
    }

    public void setAnimalPhylum(String animalPhylum) {
        if (animalPhylum == null){
            throw new IllegalArgumentException("All animals have a phylum");
        }
        this.animalPhylum = animalPhylum;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        if (animalClass == null){
            throw new IllegalArgumentException("All animals have a class");
        }
        this.animalClass = animalClass;
    }

    public String getAnimalOrder() {
        return animalOrder;
    }

    public void setAnimalOrder(String animalOrder) {
        if (animalOrder == null){
            throw new IllegalArgumentException("All animals have a order");
        }
        this.animalOrder = animalOrder;
    }

    public String getAnimalFamily() {
        return animalFamily;
    }

    public void setAnimalFamily(String animalFamily) {
        if (animalFamily == null){
            throw new IllegalArgumentException("All animals have a family");
        }
        this.animalFamily = animalFamily;
    }

    public String getAnimalGenus() {
        return animalGenus;
    }

    public void setAnimalGenus(String animalGenus) {
        if (animalGenus == null){
            throw new IllegalArgumentException("All animals have a genus");
        }
        this.animalGenus = animalGenus;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimalSpecies(String animalSpecies) {
        if (animalSpecies == null){
            throw new IllegalArgumentException("All animals have a species");
        }
        this.animalSpecies = animalSpecies;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        if (commonName == null){
            throw new IllegalArgumentException("All animals have a common name");
        }
        this.commonName = commonName;
    }

    
    
}
