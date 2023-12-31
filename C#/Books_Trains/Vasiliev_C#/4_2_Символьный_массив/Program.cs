using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4_2_Символьный_массив
{
    internal class CharArrayDemo
    {
        static void Main(string[] args)
        {
            Random rnd = new Random(); // Генерируем случайные числа
            int size = 10, k;           // Размер массива и индексная переменная
            char[] symbs = new char[size]; // Создание символьного массива
            Console.WriteLine("Массив случайных символов: ");

            for (k = 0; k < symbs.Length; k++)
            { // Заполняем массив случайными элементами
                symbs[k] = (char)('A' + rnd.Next(26));
                Console.Write("| " + symbs[k] + " ");
            }
            Console.WriteLine("|");
            Console.WriteLine("Массив в обратном порядке: ");

            for(k = symbs.Length - 1; k >= 0; k--)
            {
                Console.Write("| " + symbs[k] + " ");
            }
            Console.WriteLine("|");
        }
    }
}
