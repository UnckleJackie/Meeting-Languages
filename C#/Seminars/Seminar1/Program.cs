//System.Console.WriteLine("Input number: ");
// Данное число надо куда-то записать, в какую переменную
//int num = Convert.ToInt32(Console.ReadLine());
//System.Console.WriteLine("Your num is -> " + num);

//System.Console.WriteLine("Input number: ");
//int num = Convert.ToInt32(Console.ReadLine());
//System.Console.WriteLine($"Quad of {num} => {num*num} " );
// $ необходим, чтобы убрать плюсик и можно было внедрять в фигурных скобочках значение {num}

//Напишите программу, которая на вход принимает два числа и проверяет, 
//является ли первое число квадратом второго.

//a = 25; b = 5 -> да
//a = 2 b = 10 -> нет
//a = 9; b = -3 -> да
//a = -3 b = 9 -> нет

// System.Console.WriteLine("Input first number: ");
// int num1 = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine("Input second number: ");
// int num2 = Convert.ToInt32(Console.ReadLine());

// if(num2 * num2 == num1)
// {
//    System.Console.WriteLine($"{num1} является квадратом {num2}");
// }
// else

// /System.Console.WriteLine($"{num1} не является квадратом {num2}");
// }

// Задача 3. Напишите программу, которая на вход принимает одно число (N), 
//а на выходе показывает все целые числа в промежутке от -N до N.

// 4 -> "-4, -3, -2, -1, 0, 1, 2, 3, 4"
// 2 -> " -2, -1, 0, 1, 2"

// System.Console.WriteLine("Input N: ");
// int n = Convert.ToInt32(Console.ReadLine());

// int count = -n; //Счетчик, ему присваиваем значение -n
// while (count <= n)
// {
//    System.Console.Write(count++ + " ");
// }


// Задача 4.  Напишите программу, которая принимает на вход трёхзначное число и 
// на выходе показывает **последнюю** цифру этого числа.
    
    // 456 -> 6 
    
    // 782 -> 2
    
    // 918 -> 8

// System.Console.WriteLine("Input THREE-digital n: ");
// int num = Convert.ToInt32(Console.ReadLine());
// Остаток от деления 8%3 - это остаток от 8 = 2. Здесь, чтобы увидеть последнюю
// цифру, необходимо получить остаток от деления на 10
// if(num > 99 && num < 1000) //&& - должны выполняться ОБА условия
// {
//    System.Console.WriteLine($"Last digit of {num} > {num%10} ");
// }
// else
// {
//    System.Console.WriteLine("Don't fuck my brain, motherfucker!");
// }


