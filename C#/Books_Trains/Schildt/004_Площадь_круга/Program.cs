using System;

namespace _004_Площадь_круга
{
    class Circle
    { // Вычислить площадь круга
        static void Main()
        {
            double radius;
            double area;

            radius = 10.0;
            area = radius * radius * 3.1416;

            Console.WriteLine("Площадь равна " + area);
        }
    }
}
