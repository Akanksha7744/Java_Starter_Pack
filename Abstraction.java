import Java_Basics.Animal;

public class Abstraction {

    public static void main(String args[])
    {
        Mustang myHorse=new Mustang(); 
       // Horse h=new Horse();
        //h.eat();
        //h.walk();
        //System.out.println(h.color);

       // Chicken ch=new Chicken();
       // ch.eat();
        //ch.walk();
        //System.out.println(ch.color);

       // Error  Animal a=new Animal();  Cannot instantiate the type Animal

    }
    
}
abstract class Animal{

    String color;

    Animal(){
      //  color="brown";
      System.out.println("Animal Constructor is called");
    }
    void eat()
{
    System.out.println("animal eats");
}
abstract void walk();
}

class Horse extends Animal{

    Horse(){
        super();
        System.out.println("Horse Constructor is called");
    }
    void changeColor(){
        color="Dark Brown";
    }
    void walk(){
        System.out.println("Horse has 4 legs");
    }
}
class Mustang extends Animal{
    Mustang(){
        super();
        System.out.println("Mustang Constructor is called");
    }
    void walk(){
        System.out.println("Mustang has 2 legs");
    }
    
}

class Chicken extends Animal{
    void changeColor(){
        color="Yellow";
    }
    void walk(){
        System.out.println("Chicken has 2 legs");
    }
}