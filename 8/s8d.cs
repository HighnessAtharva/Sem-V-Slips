// Create a class Point(x, y). Overload the following operators.
// + operator to add 2 point objects
// - operator to subtract 2 point objects.  

using System;

class Point
{
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }


    //overloading unary minus operator
    public static Point operator -(Point p1, Point p2)
    {
        Point p = new Point(p1.x - p2.x, p1.y - p2.y);
        return p;
    }

    //overloading unary plus operator
    public static Point operator +(Point p1, Point p2)
    {
        Point p = new Point(p1.x + p2.x, p1.y + p2.y);
        return p;
    }

    public String getPoint()
    {
        return "Point is (" + x + "," + y + ")";
    }
}

class Test
{
    static void Main(string[] args)
    {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = p1 + p2;
        Point p4 = p3 - p1;
        Console.WriteLine("Point P3 (obtained by + overload) is ");
        Console.WriteLine(p3.getPoint());
        Console.WriteLine("Point P4 (obtained by - overload) is ");
        Console.WriteLine(p4.getPoint());

    }
}