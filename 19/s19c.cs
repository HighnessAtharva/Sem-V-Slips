/*
Write C# program to display tables of 10 and 20 like a matrix as follows.                                                                                             (15)
10	20
20	40
30	60
40	80
*/

using System;

namespace ArrayApplication
{
    class MyArray
    {

        static void Main(string[] args)
        {
            for (int i = 10; i <= 100; i = i + 10)
            {
                {
                    Console.Write("{0} \t {1} \n", i, i * 2);
                }
            }

        }
    }
}
