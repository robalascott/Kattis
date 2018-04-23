using System;
/* Robert Scott
 * Kattis
 * 
 */


class Speedlimit
    {

        static void Main(string[] args)
        {
           
            string line;
            while ((line = Console.ReadLine()) != null)
            {
                //Scoop number of objects
                var number = Int32.Parse(line);
                //Extra exit point maybe not needed
                if (number==-1)
                {
                    break;
                }
            
                var km = 0;
                var hour = 0;
                //This previous final time
                var final = 0;
                // total distance
                var total = 0;
                //loop in the subtask
                for (int x = 0; x < number; x++)
                {
                    //Scoop the line
                    line = Console.ReadLine();
                    //Spilt
                    string[] get = line.Split(' '); 
                    km = Int32.Parse(get[0]);
                    hour = Int32.Parse(get[1]);
                    //Solve
                    total += km * (hour - final);
                    //Console.WriteLine(final + " miles" + v);
                    final = hour;
                }
                Console.WriteLine(total + " miles");
            }
           

           
        }

        //Test method from file
        public static String[] ReadFile(string dir,string name)
        {
            string[] lines = System.IO.File.ReadAllLines(dir+name);
            return lines;
        }

    }

