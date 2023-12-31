using System;

namespace _013_Демонстрация_тригонометрических_функций
{
    class Trigonometry 
    { // Продемонстрировать применение тригонометрических функций.
        static void Main()
        {
            Double theta; // угол в радианах

            for (theta = 0.1; theta <= 1.0; theta = theta + 0.1)
            {
                Console.WriteLine("Синус угла " + theta + " равен " + Math.Sin(theta));
                Console.WriteLine("Косинус угла " + theta + " равен " + Math.Cos(theta));
                Console.WriteLine("Тангенс угла " + theta + " равен " + Math.Tan(theta));
                Console.WriteLine();
            }
        }
    }
}
