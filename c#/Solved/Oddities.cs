using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Kattis
{
    class Oddities
    {
  
        static void Main(string[] args)
        {
            string line;
            Console.ReadLine();
            while ((line = Console.ReadLine()) != null)
            {

                int v = Convert.ToInt32(line);
                if (v % 2 == 0)
                {
                    Console.WriteLine(v + " is even");
                }
                else
                {
                    Console.WriteLine(v + " is odd");
                }
            }
          //  Console.WriteLine("Press any key to exit.");
          //  System.Console.ReadKey();
        }

        public static String[] ReadFile(string dir,string name)
        {
            string[] lines = System.IO.File.ReadAllLines(dir+name);
            return lines;
        }

    }
}
