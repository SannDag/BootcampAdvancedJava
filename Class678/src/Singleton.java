//Identify the main characteristics of the most well-known design patterns,
//indicate what they are used for, and give a use case for each of them.

//Singleton Pattern: It is used when a single instance of a class is needed throughout the system, and when we
//want to prevent multiple instances of the same class from being created. A use case for this
//pattern is in an event logging application, where we want to ensure that there is only one log
//and all events are logged to the same log.

//Factory Pattern: This pattern is used to create objects without specifying the exact class
//of object that will be created. It is used when we want to create objects of different
//subclasses of a common superclass. A use case for this pattern is in a program
//that processes documents of different formats and needs to create objects of different
//classes to process each type of document.

//Observer pattern: It is used when an objects needs to notify other objects about a change in state,
//but we don't know how many objects need to be notified. For example in a stock tracking program,
//where multiple users are notified when a product changes state.

//Decorator Pattern: It is used when we want to add new funcionality to an object at runtime without affecting
//the structure of the original object. For example in an image processing program, where we want to add effects
//like brightness or saturation to an existing image.

//Adapter Pattern: This pattern is used to adapt an existing interface to a desired interface.
//It is used when we want to use an existing class that doesn't have the required interface and we can't
//modify the existing class. A use case for this pattern is in a program that uses an external library,
//where the library uses a different interface than what is required in the program.


//Create a small application implementing the Singleton pattern and demonstrate that it indeed does not create
//new instances. You can use session 7 as a reference.

public class Singleton {
    private static Singleton singleton;
    boolean isRunning = false;

    private Singleton(){
        System.out.println("A singleton instance is created");
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void Run(){
        if(!isRunning){
            isRunning = true;
        } else{
            System.out.println("It was already running");
        }
    }
}