// Define a class Student with attributes roll no and name. Define default and parameterized constructor. Keep the count of Objects created. Create objects using parameterized constructor and Display the object count after each object is created. 

using System;

class Student
{
    public int rollNumber;
    public string name;

    public static int count = 0;

    public Student()
    {
        //defualt values if none are provided
        this.rollNumber = 0;
        this.name = "STUDENT";
        count += 1;
        Console.WriteLine("Objects created till now are " + count);
    }

    public Student(int rollNumber, string name)
    {
        this.rollNumber = rollNumber;
        this.name = name;
        count += 1;
        Console.WriteLine("Objects created till now are " + count);
    }

}

class Test
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter Student name and roll number. Enter N to exit.");

        string checker = "";
        while (checker != "N" || checker != "n")
        {
            Console.WriteLine("Enter name and roll number one by one");
            string userName = Console.ReadLine();
            string userRollNumber = Console.ReadLine();
            Student s = new Student(Convert.ToInt32(userRollNumber), userName);
            Console.WriteLine("Enter more info or N to exit");
            checker = Console.ReadLine();
        }
    }
}