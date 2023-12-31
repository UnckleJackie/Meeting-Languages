using System;

namespace _053_Условное_Выражение
{ // Условием выполнения цикла может служить любое выражение типа bool
    class ForDemo
    {
        static void Main()
        {
            int i, j;
            bool done = false;

            for (i = 0, j = 100; !done; i++, j--)
            {
                if (i * i >= j) done = true;
                Console.WriteLine("i, j: " + i + " " + j);
            }
        }
    }
}
