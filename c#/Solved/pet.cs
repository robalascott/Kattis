using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Kattis
{
    class pet
    {

        static void Main(string[] args)
        {
            //Placholder for line reader
            string line;
            //Storage for best pos and points
            var points = 0;
            var currPos = 1;
            //Current Pos placeholder
            var pos = 0;
            while ((line = Console.ReadLine()) != null)
            {
                //Total point counter
                int total = 0;
                //Spilter and loop
                string[] words = line.Split(' ');  
                foreach (string word in words)
                {
                      total += Convert.ToInt32(word);  
                }
                //Best value stored
                if (total >= points)
                {
                    points = total;
                    pos = currPos;
                }
                currPos++;
            }
            Console.WriteLine(pos + " " +points );
        }
    }
}
