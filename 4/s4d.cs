// Q4d. Write a C# program to overload the following operators
// - operator to subtract 2 objects
// ++ operator to increment the value of an object.          

using System;


class Box
{
    private int length;   // Length of a box
    private int breadth;  // Breadth of a box
    private int height;   // Height of a box

    public int getVolume()
    {
        return length * breadth * height;
    }

    public Box()
    {
        length = 0;
        breadth = 0;
        height = 0;
    }

    public Box(int length, int breadth, int height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }


    // Overload + operator to add two Box objects.
    public static Box operator -(Box b, Box c)
    {
        Box box = new Box();
        box.length = b.length - c.length;
        box.breadth = b.breadth - c.breadth;
        box.height = b.height - c.height;
        return box;
    }

    public static Box operator ++(Box c)
    {
        Box box = new Box();
        box.length = c.length + 1;
        box.breadth = c.breadth + 1;
        box.height = c.height + 1;
        return box;
    }
}

class OverloadTest
{
    static void Main(string[] args)
    {
        Box Box1 = new Box(12, 13, 10);    // Declare Box1 of type Box
        Box Box2 = new Box(6, 7, 5);   // Declare Box2 of type Box
        Box Box3 = new Box();   // Declare Box3 of type Box
        int volume = 0;    // Store the volume of a box here


        // volume of box 1
        volume = Box1.getVolume();
        Console.WriteLine("Volume of Box1 : {0}", volume);

        // volume of box 2
        volume = Box2.getVolume();
        Console.WriteLine("Volume of Box2 : {0}", volume);

        // Add two object as follows:
        Box3 = Box1 - Box2;

        // volume of box 3
        volume = Box3.getVolume();
        Console.WriteLine("Volume of Box3 : {0}", volume);


        Box3 = ++Box3;
        volume = Box3.getVolume();
        Console.WriteLine("Volume of Box3 after Increment (+ Overload): {0}", volume);
    }
}
