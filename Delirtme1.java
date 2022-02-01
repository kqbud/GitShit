package Ahmet_Abi_ile_Delirmeceler;

public class Delirtme1
{
    /*
            ABSTRACTION ASSIGNMENT
        -------------------------------------
        1)Create an abstract class 'Parent' with a method 'message'.
        It has two subclasses each having a method with the same name 'message' that prints "This is first subclass"
        and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.


        2)Create an abstract class 'Bank' with an abstract method 'getBalance'.
        $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of
        class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of
        each of the three classes.

        3)Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a class 'Cats' with
        a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark",
        both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective
        methods.

        4)We have to calculate the area of a rectangle, a square and a circle.
        Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters,
        'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length
        and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius.
        Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and
        'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area'
        and call all the three methods
     */
    public static void main(String[] args)
    {
        //problem 1
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        c1.message();
        c2.message();

        //problem 2
        BankA ba = new BankA();
        BankB bb = new BankB();
        BankC bc = new BankC();

        ba.getBalance();
        bb.getBalance();
        bc.getBalance();

        System.out.println("BANK A "+ ba.getBalance() );
        System.out.println("BANK B "+ bb.getBalance() );
        System.out.println("BANK C "+ bc.getBalance() );

        //problem 3

        Animals kitty = new Cats();
        Animals doggy = new Dogs();
        kitty.makeNoise();
        doggy.makeNoise();

        //problem 4
        Area are = new Area();
        System.out.println("Square of 2 should be 4 :"+ are.SquareArea(2) );
        System.out.println("Circle of 2 :"+ are.CircleArea(2));
        System.out.println("rectangle of 2 and 3  should be 6 :"+ are.RectangleArea(2,3));
    }
} //public class delirtme end

//problem 1-------------------------------------------------------
/*
   1) Create an abstract class 'Parent' with a method 'message'.
   It has two subclasses each having a method with the same name 'message' that prints "This is first subclass"
   and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.

 */
abstract class Parent
{
    abstract void message();
}

class Child1 extends Parent
{
    void message()
    {
        System.out.println("this is the first subclass");
    }
}

class Child2 extends Parent
{
    void message()
    {
        System.out.println("this is the second subclass");
    }
}
//problem 2-----------------------------------------------
/*
    2) Create an abstract class 'Bank' with an abstract method 'getBalance'.
    $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of
    class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of
    each of the three classes.
 */
abstract class Bank
{
    int balance;
    abstract public int getBalance();
}
class BankA extends Bank
{
    int balance = 100;
    public int getBalance()
    {
        return balance;
    }
}

class BankB extends Bank
{
    int balance = 150;
    public int getBalance()
    {
        return balance;
    }
}

class BankC extends Bank
{
    int balance =200;
    public int getBalance()
    {
        return balance;
    }
}
//problem 3 ---------------------------------------------------

/*
    3) Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a class 'Cats' with
    a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark",
    both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective
    methods.
 */
abstract class Animals
{
    abstract void makeNoise ();

}
class Cats extends Animals
{
    public void makeNoise()
    {
        System.out.println("purr");
    }

}

class Dogs extends Animals
{

    public void makeNoise()
    {
        System.out.println("woof woof");
    }
}
//problem 4 ------------------------------------------------------

/*
    4) We have to calculate the area of a rectangle, a square and a circle.
    Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters,
    'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length
    and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius.
    Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and
    'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area'
    and call all the three methods
 */
abstract class Shape
{
    abstract int SquareArea(int a);
    abstract int CircleArea(int r);
    abstract int RectangleArea(int a, int b);
}
class Area
{
    public int SquareArea(int a)
    {
        return a * a;
    }
    public double CircleArea(int r)
    {
        return 3.14 * r * r;
    }
    public int RectangleArea(int a, int b)
    {
        return a * b;
    }


}



