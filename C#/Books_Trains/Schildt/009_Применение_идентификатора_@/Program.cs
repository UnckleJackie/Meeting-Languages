using System;

namespace _009_Применение_идентификатора__
{
    class IdTest
    { // Продемонстрировать применение идентификатора со знаком @
        static void Main()
        {
            int @if; // Применение ключевого слова if в качестве идентификатора
            for (@if = 0; @if < 10; @if++)
            {
                Console.WriteLine("@if равно " + @if);
            }
        }
    }
}
