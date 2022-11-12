// Define a class Student with attributes roll no and name. Define default and parameterized constructor. 
// Keep the count of Objects created. Create objects using parameterized constructor and Display the object count after each object is created. 

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
        Console.WriteLine("Enter Student name and roll number.");
        while(true)
        {
            Console.WriteLine("Enter name");
            string userName = Console.ReadLine();
            
            Console.WriteLine("Enter roll number");
            int userRollNumber = Convert.ToInt32(Console.ReadLine());
           
            Student s = new Student(userRollNumber, userName);
           
            Console.WriteLine("Want to add more? -1 to cancel, any other key to continue");
            string userChoice = Console.ReadLine();
            if (userChoice == "-1")
            {
                break; 
            }
        }
    }
}