using System;
/* Robert Scott
 * Kattis
 * 
 */

//namespace Kattis
//{
    class Quadrant
    {

        static void Main(string[] args)
        {
            //Scoop both positions
            var x = int.Parse(Console.ReadLine());
            var y = int.Parse(Console.ReadLine());
            //Solve if functions
            Console.WriteLine(Solve(x, y));
        }

        private static int Solve(int x, int y)
        {
        
            if (x > 0)
            {
                if (y < 0)
                {
                    return 4;
                }
                return 1;
            }
            else 
            {
                if (y < 0)
                {
                    return 3;
                }
                return 2;
            }

        }

        public static String[] ReadFile(string dir,string name)
        {
            string[] lines = System.IO.File.ReadAllLines(dir+name);
            return lines;
        }

    }
//}
