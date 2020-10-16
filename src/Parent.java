

//Hello Akshay..this is code which implements oops using
//Data Hiding
//Abstraction
//Inheritance
//Encapsulation
//Polymorphism using overloading and overriding

public class Parent {               //parent class
    private double balance=100.0;

    public double getbalance(){      //encapsulation process all data members declared as private
                                     //sensitive data is hidden from the User
        //getter method              // can be achieved using getter and setter method
        return balance;
    }
    public double setbalance(double t){
        //setter method
        this.balance=t;
        return balance;
    }
     public void method1(){         //same method name but different arguments (method overloading example of polymorphism)
        System.out.println("No Arg method");  //overloading also called compile time polymorphism or early binding
     }
    public void method1(int x){     //same method name but different arguments (method overloading example of polymorphism)
        System.out.println("Int Arg method");

    }
    public void method1(double d){   //same method name but different arguments (method overloading example of polymorphism)
        System.out.println("Double Arg method");
    }
    public void method1(int...x){   //same method name but different arguments (method overloading example of polymorphism)
        System.out.println("Var Arg method");
    }
    public void property(){
         System.out.println("Cash+gold+land");
    }
    public void marry(){    //Concept of overriding //overriden method example of polymorphism
        System.out.println("parents arranged marriage with ramya");
    }

}
