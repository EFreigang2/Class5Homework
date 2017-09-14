package myconcrete;

/**
 *
 * @author Eric
 */
public class Startup {
    public static void main(String[] args) {
        
        Cat cat1 = new Cat();
        cat1.setAnimalPhylum("Chordata");
        cat1.setAnimalClass("Mammalia");
        cat1.setAnimalOrder("");
        cat1.setAnimalFamily("");
        cat1.setAnimalGenus("Felis");
        cat1.setAnimalSpecies("concolor");
        cat1.setCommonName("Puma");
        cat1.setDietType("carnivore");
        cat1.setCatType("wild");
        System.out.println("The following animal's taxanomical name is: " + 
                cat1.getAnimalPhylum() + " " + cat1.getAnimalClass() + " " + cat1.getAnimalGenus() + " " + 
                cat1.getAnimalSpecies() + ". Otherwise known as a " + cat1.getCommonName() + ". They are " + 
                cat1.getDietType() + " and are " + cat1.getCatType() + ".");
    }
}
