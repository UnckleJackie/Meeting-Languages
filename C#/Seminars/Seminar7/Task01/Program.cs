//Задайте двумерный массив размером m×n,
// заполненный случайными целыми числами.
// m = 3, n = 4.
// 1 4 8 19
// 5 -2 33 -2
// 77 3 8 1

int Prompt(string message) 
{
    System.Console.Write(message); 
    string value = Console.ReadLine(); 
    int result = Convert.ToInt32(value); 
    return result; 
}

int [,] Create2DRandomArray(int row, int column, int minValue, int maxValue)
{
    int [,] array = new int[row, column];
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < column; j++)
        {
            array[i, j] = new Random().Next(minValue, maxValue + 1);
        }
    }
    return array;
}

void Print2DArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            System.Console.Write(array[i, j] + " ");
        }
        System.Console.WriteLine();
    }
}

int row = Prompt("Input rows > "); 
int column = Prompt("Input columns > ");
int min = Prompt("Input minValue > ");
int max = Prompt("Input maxValue > ");

int[,] myArray = Create2DRandomArray(row, column, min, max);
Print2DArray(myArray);
