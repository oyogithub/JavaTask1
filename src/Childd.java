public class Childd extends Parent {  //Inheritance concept using extends keyword(All parent class methods
    // can be used in child claspublic void marry(){

    public void marry() {    //Concept of overriding //overriding method //example of polymorphism
        //if child class is not satisfied then it can implement its own implementation
        //also known as runtime polymorphism
        System.out.println("I want to marry Kajal");

    }
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}
