﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(text.Length);
            int count = 0;

            for (int i = 0; i < text.Length; i++)
            {
                if (text[i] == ' ')
                {
                    count++;
                }
            }
            Console.WriteLine(count);
        }
    }
}