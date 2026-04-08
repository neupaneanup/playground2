class Animal {
    void sound(){
        system.out.println ("Animal makes sound");
    }
}

class Dog extends Animal{
    void bark(){
        system.out.println("Dog Barks");
    }
}

public class Inheritance {
    public static void Main(String[] args){
        Dog nuppy= new Dog();
        nuppy.sound();
        nuppy.bark();
    }
}