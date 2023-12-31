// Напишите программу, которая выводит случайное трёхзначное число 
//и удаляет вторую цифру этого числа.
//456 -> 46
//782 -> 72
//918 -> 98

void Reduction ()
{
    int x = new Random().Next(100, 999 +1);
    System.Console.WriteLine(x);
    int num = ((x / 100) * 10 + x % 10);
    System.Console.WriteLine(num);
}

Reduction ();

//System.Console.WriteLine("Введите число: ");
//int x = new Random().Next(100, 1000);
