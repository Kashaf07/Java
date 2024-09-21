class Animals
{
    public void makeSound()
    {
        System.out.println("Animal makes Sound");
    }
}

class Cat extends Animals 
{
    @Override
    public void makeSound() 
    {
        System.out.println("Cat meows");
    }
}

public class Animal
{
    public static void main(String[] args)
    {
        Animals a1= new Animals();
        Cat c1 = new Cat();
                
        a1.makeSound(); 
        c1.makeSound();      
    }
    
}

//Write a Java program to create a class called Animal with a method called makeSound().
//Create a subclass called Cat that overrides the makeSound() method to bark.