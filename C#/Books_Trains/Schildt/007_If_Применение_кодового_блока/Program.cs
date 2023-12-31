using System;

namespace _007_If_Применение_кодового_блока
{
    class BlockDemo
    { // Продемонстрировать применение кодового блока
        static void Main()
        {
            int i, j, d;
            i = 5;
            j = 10;
            // Адресатом этого оператора if служит кодовый блок
            if (i != 0)
            {
                Console.WriteLine("i не равно нулю!");
                d = j / i;
                Console.WriteLine("j / i равно " + d);
            }
        }
    }
}
