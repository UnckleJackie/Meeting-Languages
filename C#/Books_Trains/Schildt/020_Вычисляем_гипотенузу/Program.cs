using System;

namespace _020_Вычисляем_гипотенузу
{
    class DynInit
    { // Вычисляем гипотенузу
        static void Main()
        {
            // Длина сторон прямоугольного треугольника
            double s1 = 4.0;
            double s2 = 5.0;
            // Инициализировать переменную hypot динамически
            double hypot = Math.Sqrt((s1 * s1) + (s2 * s2));
            Console.Write("Гипотенуза треугольника со сторонами " + s1 + " и " + s2 + " равна ");
            Console.WriteLine("{0:#.###}.", hypot);
        }
    }
}
