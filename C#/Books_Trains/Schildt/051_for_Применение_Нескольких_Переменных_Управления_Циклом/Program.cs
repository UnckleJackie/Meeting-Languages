using System;

namespace _051_for_Применение_Нескольких_Переменных_Управления_Циклом
{ // Использовать запятые в операторе цикла for
    class Comma
    {
        static void Main()
        {
            int i, j;

            for (i = 0, j = 10; i < j; i++, j--)
                Console.WriteLine("i и j: " + i + " " + j);
        }
    }
}
