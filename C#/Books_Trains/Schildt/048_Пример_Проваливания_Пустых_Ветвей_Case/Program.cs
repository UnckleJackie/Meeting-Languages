using System;

namespace _048_Пример_Проваливания_Пустых_Ветвей_Case
{ // Пример "проваливания" пустых ветвей case
    class EmptyCasesCanFall
    {
        static void Main()
        {
            int i;

            for (i = 1; i < 5; i++)
                switch(i)
                {
                    case 1:
                    case 2:
                    case 3: Console.WriteLine("i равно 1, 2 или 3");
                        break;
                    case 4: Console.WriteLine("i равно 4");
                        break;
                }
        }
    }
}
