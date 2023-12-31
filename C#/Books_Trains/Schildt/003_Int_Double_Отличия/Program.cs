using System;

namespace _003_Int_Double_Отличия
{ // Эта программа демонстрирует отличия между типами данных int и double.
    internal class Program
    {
        static void Main()
        {
            int ivar; // Объявить целочисленную переменную
            double dvar; // Объявить переменную с плавающей точкой

            ivar = 100; // Присвоить переменной ivar значение 100
            dvar = 100.0; // Присвоить переменной dvar значение 100.0

            Console.WriteLine(" ivar: " + ivar);
            Console.WriteLine(" dvar: " + dvar);

            Console.WriteLine(); // Вывести пустую строку
            // Разделить значения обеих переменных на 3
            ivar = ivar / 3;
            dvar = dvar / 3;

            Console.WriteLine(" ivar : " + ivar);
            Console.WriteLine(" dvar : " + dvar);
        }
    }
}
