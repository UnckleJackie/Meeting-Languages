using System;

namespace _067_Практическое_Применение_GoTo
{ // Продемонстрировать практическое применение оператора goto
    class Use_goto
    {
        static void Main()
        {
            int i = 0, j = 0, k = 0;

            for (i = 0; i < 10; i++)
            {
                for (j = 0; j < 10; j++)
                {
                    for (k = 0; k < 10; k++)
                    {
                        Console.WriteLine("i, j, k: " + i + " " + j + " " + k);
                        if (k == 3) goto stop;
                    }
                }
            }
        stop: Console.WriteLine("Остановлено! i, j, k: " + i + ", " + j + ", " + k);
        }
    }
}
