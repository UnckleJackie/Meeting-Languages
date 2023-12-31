using System;

namespace _098_Создание_и_Выведение_Символьной_Строки
{ // Создать и вывести символьную строку
    class StringDemo
    {
        static void Main()
        {
            char[] charray = { 'Э', 'т', 'о', ' ', 'с', 'т', 'р', 'о', 'к', 'а', };

            string str1 = new string(charray);
            string str2 = "Еще одна строка.";

            Console.WriteLine(str1);
            Console.WriteLine(str2);
        }
    }
}
