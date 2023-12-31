// Ниже показана программа, которая умножает 12 на 30 и выводит на экран результат 360

// using System;                   // Импортирование пространства имен
// class Test                      // Объявление класса
// {
//     static void Main()          // Объявление метода
//     {
//         int x = 12 * 30;        // Оператор 1
//         Console.WriteLine (x);  // Оператор 2
//     }                           // Конец метода
// }                               // Конец класса

using System;
class Test
{
    static void Main()
    {
        Console.WriteLine (FeetToInches (30)); // 360
        Console.WriteLine (FeetToInches (100)); // 1200
    }
    static int FeetToInches (int feet)
    {
        int inches = feet * 12;
        return inches;
    }
}