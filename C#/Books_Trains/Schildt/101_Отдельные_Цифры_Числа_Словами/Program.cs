using System;

namespace _101_Отдельные_Цифры_Числа_Словами
{ // Вывести отдельные цифры целого числа словами
    class ConvertDigitsToWords
    {
        static void Main()
        {
            int num;
            int nextdigit;
            int numdigits;
            int[] n = new int[20];
            string[] digits = { "ноль", "один", "два", "три", "четыре", "пять", 
                "шесть", "семь", "восемь", "девять"};
            num = 139602986;

            Console.WriteLine("Число: " + num);
            Console.Write("Число словами: ");
            nextdigit = 0;
            numdigits = 0;

            // Получить отдельные цифры и сохранить их в массиве n
            do
            {
                nextdigit = num % 10;
                n[numdigits] = nextdigit;
                numdigits++;
                num = num / 10;
            }
            while (num > 0);
            numdigits--;

            // Вывести полученные слова
            for (; numdigits >= 0; numdigits--)
                Console.Write(digits[n[numdigits]] + " ");
            Console.WriteLine();
        }
    }
}
