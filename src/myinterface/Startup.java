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
public class Startup {
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
