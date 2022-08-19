//  Create a class Employee(eid, ename, sal). Derive a class Manager(hra, ta) from Employee. Override the getSalary() method

using System;

class Employee
{
    public int eid;
    public string ename;
    public int sal;
     
    public Employee(int eid, string ename, int sal){
        this.eid = eid;
        this.ename = ename;
        this.sal = sal;
    }
    public virtual int getSalary(){
        Console.Write("\nFrom Employee Class");
        Console.Write("\nEmployee Salary: {0}", sal);
        return 0;

    }
}

class Manager : Employee
{
    public int hra;
    public int ta;

    //calls the base class constructor to get the values of eid, ename and sal.
    public Manager(int eid, string ename, int sal, int hra, int ta) : base(eid, ename, sal)
    {
        this.hra = hra;
        this.ta = ta;
    }
    public override int getSalary()
    {
        Console.Write("\nFrom Manager Class - (Overridden Method)");
        Console.Write("\nManager Salary: {0}", sal + hra + ta);
         return 0;
    }
}

class Driver{
    static void Main(string[] args){
        Employee e=new Employee(1,"John",10000);
        e.getSalary();
        Manager m = new Manager(1, "John", 10000, 5000, 1000);
        m.getSalary();
    }
}