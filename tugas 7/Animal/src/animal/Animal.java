/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Arief Anastiar S
 */
public class Animal {
    public void makeNoise() {
        System.out.println("talk");
    }
}

class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        
        Animal animalDog = new Dog();
        animalDog.makeNoise();
        
        if(animal instanceof Animal) {
            System.out.println("animal is Animal");
        }
        
        if(dog instanceof Animal) {
            System.out.println("dog is Animal");
        }
        
        if(animalDog instanceof Animal) {
            System.out.println("animalDog is Animal");
        }
         
        if(animal instanceof Dog) {
            System.out.println("animal is Dog");
        }
    }
}
