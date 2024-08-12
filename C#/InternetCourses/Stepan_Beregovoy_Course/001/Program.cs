using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _001
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("\nFirst Lesson of the C# Language!");
            Console.WriteLine();

            int x = 10;
            int y = -18;
            uint ui = 2870000000;
            byte by = 255;
            sbyte sbminus = -127;
            short s = 16000;
            ushort us = 32000;
            long l = -310_000_000_000_000;
            ulong ul = 620_000_000_000_000;
            Console.WriteLine($"int x = {x},int y = {y}, uint ui = {ui}, byte b = {by}\n" +
                $"sbyte sbminus = {sbminus}\n" +
                $"short s = {s}, ushort us = {us}\n" +
                $"long l = {l}, ulong ul = {ul}");

            // Console.WriteLine(y);

            Console.WriteLine($"Type byte takes 8 bits or 1 byte and max Value is {byte.MaxValue}\n" +
                $"Type short takes 16 bit or 2 bytes and max Value is {short.MaxValue}\n" +
                $"Type int takes 32 bits of information or 4 bytes and max Value is {int.MaxValue}\n" +
                $"Type long takes 64 bits or 8 bytes\n\n" +
                $"Если представить, что необходимо внести в программу возрасты всех жителей на планете, то если использовать int,\n" +
                $"понадобилось бы 7 млрд х 4 байта = {28000000000 / 1024 / 1024 / 1024} Gb против {7000000000 / 1024 / 1024 / 1024} Gb при использовании byte\n");

            string text = "Bambarbia";
            Console.WriteLine($"\nThe length of {text} is {text.Length}\n");
            // Console.ReadLine();

            sbyte sum = (sbyte)(x + y);
            int dif = us - s;

            Console.WriteLine($"sbyte sum = {sum}\n" +
                $"us - s = {dif}");

            Console.WriteLine("Numbers with float point: \n");
            float f = (us / by) / 6.3f;
            double d = (us / by) / 6.3;

            Console.WriteLine($"Type float takes 32 bits or 4 bytes.\n" +
                $"Type double takes 64 bits or 8 bytes.\n" +
                $"float f = {f}\n" +
                $"double d = {d}\n");

            Console.WriteLine($"Порешаем квадратное уравнение ax^2 + bx + c = 0");
            Console.Write("a = ");
            int a = int.Parse(Console.ReadLine());
            Console.Write("b = ");
            int b = int.Parse(Console.ReadLine());
            Console.Write("c = ");
            int c = int.Parse(Console.ReadLine());

            double discriminant = b * b - 4 * a * c;
            double x1 = (-b - Math.Sqrt(discriminant)) / 2 * a;
            double x2 = (-b + Math.Sqrt(discriminant)) / 2 * a;
            Console.WriteLine($"Discriminant = {discriminant}\n" +
                $"x1 = {x1}\n" +
                $"x2 = {x2}\n");
        }
    }
}

