// Напишите программу, которая возводит число А в целую степень В

int NumDegree(int A, int B)
{
    if (B == 0) return 1;
    else return A * NumDegree(A, B - 1);
}

System.Console.Write("Введите A: ");
int A = Convert.ToInt32(Console.ReadLine());
System.Console.Write("Введите B: ");
int B = Convert.ToInt32(Console.ReadLine());
int result = NumDegree(A, B);
System.Console.WriteLine($"{A} в степени {B} = {result}");