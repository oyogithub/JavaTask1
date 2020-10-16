public class Test{

    public static void main(String []args){ //main method
        Parent p=new Parent();
        Childd c=new Childd();
        Parent p1=new Childd();//Parent reference can be assigned to child object a type of polymorphism

        p.method1();
        c.method1(10);
        p.method1(10.5);
        c.method1('a'); //promotes data type to next level and checks if not compile time error
        p.method1(10);
        p.method1(10,20);
        p.marry();
        c.marry();
        p.setbalance(700.0);
        System.out.println(p.getbalance());
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
    }
}
