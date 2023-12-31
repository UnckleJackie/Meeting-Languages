using System;

namespace _025_Неявное_Преобразование_Long_Double
{
    class LtoD
    { // Продемонстрировать неявное преобразование типа long в тип double
        static void Main()
        {
            long L;
            double D;

            L = 100123285L;
            D = L;
            Console.WriteLine("L и D: " + L + " " + D);

            /* *** Эта программа не может быть скомпилирована ***
             * long L;
             * double D;
             * 
             * D = 100123285.0;
             * L = D; // Недопустимо!!!
             * Console.WriteLine("L и D: " + L + " " + D);
             */
        }
    }
}
