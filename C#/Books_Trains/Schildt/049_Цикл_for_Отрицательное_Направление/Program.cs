using System;

namespace _049_Цикл_for_Отрицательное_Направление
{ // Выполнение цикла for в отрицательном направлении
    class DecrFor
    {
        static void Main(string[] args)
        {
            int x;

            for (x = 100; x > -100; x -= 5)
                Console.WriteLine(x);
        }
    }
}
