import java.util.*;

public class TestGenerics1{
    public static void main(String[] args){
        new TestGenerics1().go();
    }
    
    public void go() {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        takeAnimals(animals);

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        takeAnimals(dogs); //Without specifying generics this does not work
    }

    public <T extends Animal> void takeAnimals (ArrayList<? extends Animal> animals){
        for(Animal a: animals){
            a.eat();
        }
    }
    
    class Dog extends Animal{
        void bark(){};
    }

    class Cat extends Animal{
        void meow(){};
    }
}

/* "Remember, the keyword "extends" in <T extends Animal> means either extends OR
 * implements depending on the type. So if you want to take an ArrayList of types
 * that implement the Pet interface, you'd declare it as: ArrayList<? extends Pet>
 * 
 * "When you use a wildcard in your method argument, the compiler will STOP you
 * from doing anything that could hurt the list referenced by the method 
 * parameter.
 *
 * You can still invoke methods on the elements in the list, but you cannot add
 * elements to the list.
 *
 * In other words, you can do things with the list elements, but you can't put
 * new things in the list. So you're safe at runtime, because the compiler won't
 * let you do anything that might be horrible at runtime" (Java Head First, pg, 574).
 * */
