using System;

namespace _012_Вычисляем_радиус_по_площади_круга
{ // Определить радиус окружности по площади круга
    class FindRadius
    {
        static void Main()
        {
            Double r;
            Double area;
            area = 10.0;
            r = Math.Sqrt(area / 3.1416);
            Console.WriteLine("Радиус равен " + r);
        }
    }
}
