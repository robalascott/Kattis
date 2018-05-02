using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


    class Zamka
    {

        static void Main(string[] args)
        {
            //Lower int
            var Lower = int.Parse(Console.ReadLine());
            //Max int value
            var Max = int.Parse(Console.ReadLine());
            //Sum int value
            var Sum = int.Parse(Console.ReadLine());
            Console.WriteLine(SolveMinRec(Lower,Max,Sum));
            Console.WriteLine(SolveMaxRec(Max, Lower, Sum));
            Console.WriteLine("Press any key to exit.");
            System.Console.ReadKey();
        }
        //Get the first entry which match requirements
        private static int SolveMinRec(int lower, int max, int sum)
        {
            
            if (lower <= max && SumOf(lower)==sum)
            {
                return lower;
            }

            return SolveMinRec(lower+1,max,sum);
        }
        //Get the first entry which match requirements
        private static int SolveMaxRec(int max, int lower, int sum)
        {
            if (max >= lower && SumOf(max) == sum)
            {
                return max;
            }
            return SolveMaxRec(max - 1, lower, sum);
        }
        //Gets the sum value of Digits and put them together 
        private static int SumOf(int value)
        {
            int sum = 0;
            while (value != 0)
            {
                int rem;
                value = Math.DivRem(value, 10, out rem);
                sum += rem;
            }
            return sum;
        }
     
    }

