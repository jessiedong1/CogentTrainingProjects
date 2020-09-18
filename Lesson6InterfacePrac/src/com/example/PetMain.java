package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();
        
        Fish fish = new Fish();
        fish.eat();
        fish.walk();
        fish.play();
        
        Cat cat = new Cat();
        cat.eat();
        cat.walk();
        cat.play();
        
        playWithAnimal(cat);
        playWithAnimal(s);
    }
    
    public static void playWithAnimal(Animal a) {
        // completed in practice
    	if ( a instanceof Pet) {
//    		Pet pet = (Pet)a;
//    		pet.play();
    		((Pet) a).play();
    	}
    	else {
    		System.out.println("Danger! Wild Animal");
    	}
    }
    
}