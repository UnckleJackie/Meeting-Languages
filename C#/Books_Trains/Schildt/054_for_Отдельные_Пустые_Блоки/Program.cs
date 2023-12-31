using System;

namespace _054_for_Отдельные_Пустые_Блоки
{ // Отедльные части цикла for могут оставаться пустыми
    class Empty
    {
        static void Main()
        {
            int i;

            for (i = 0; i < 10; )
            {
                Console.WriteLine("Проход №" + i);
                i++; // инкрементировать переменную управления циклом
            }
        }
    }
}
