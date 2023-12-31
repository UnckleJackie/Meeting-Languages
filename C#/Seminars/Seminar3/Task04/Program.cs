// Напишите программу, которая принимает на вход координаты точки (X и Y), причём X ≠ 0 и Y ≠ 0 и 
//выдаёт номер четверти плоскости, в которой находится эта точка.

// System.Console.WriteLine("Input x: ");
// double x = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine("Input y: ");
// double y = Convert.ToInt32(Console.ReadLine());

// void FindQuarter()
// {
//     if(x != 0 && y != 0)
//     {
//         if (x > 0 && y > 0)
//         {
//             System.Console.WriteLine("First Quarter");
//         }        
//         if (x > 0 && y < 0)
//         {
//             System.Console.WriteLine("Second Quarter");
//         }
//         if (x < 0 && y < 0)
//         {
//             System.Console.WriteLine("Third Quarter");
//         }
//         if (x < 0 && y > 0)
//         {
//             System.Console.WriteLine("Forth Quarter");
//         }
//     } 
//     else
//     {
//          System.Console.WriteLine("Invalid Input");
//     }
// }
// FindQuarter();

int Prompt(string message)
{ //говорят, с помощью Vvod мы получаем координаты
    System.Console.Write(message);
    int number = Convert.ToInt32(System.Console.ReadLine());
    return number;
}

int x = Prompt("Введите координату X: ");
int y = Prompt("Введите координату Y: ");
int Quarter(int A, int B)
{
    if(A > 0 && B > 0) return 1;
    if(A > 0 && B < 0) return 2;
    if(A < 0 && B < 0) return 3;
    if(A < 0 && B > 0) return 4;
    else return 0;
}
System.Console.WriteLine(Quarter(x, y));