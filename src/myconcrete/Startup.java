package myconcrete;

/**
 *
 * @author Eric
 */
public class Startup {
    public static void main(String[] args) {
        
        Cat cat = new Cat();
        cat.setPhylum("Chordata");
        cat.setClasS("Mammalia");
        cat.setGenus("Felis");
        cat.setSpecies("concolor");
        cat.setName("Puma");
        System.out.println("The following animal's taxanomical name is: " + 
                cat.getPhylum() + " " + cat.getClasS() + " " + cat.getGenus() + " " + 
                cat.getSpecies() + ". Otherwise known as a " + cat.getName());
    }
}
