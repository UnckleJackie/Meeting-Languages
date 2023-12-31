// Задайте двумерный массив. Найдите элементы, у
// которых оба индекса чётные, и замените эти элементы на их
// квадраты.
// Например, изначально массив
// выглядел вот так:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Новый массив будет выглядеть
// вот так:
// 1 4 7 2
// 5 81 2 9
// 8 4 2 4

int Prompt(string message) 
{
    System.Console.Write(message); 
    string value = Console.ReadLine(); 
    int result = Convert.ToInt32(value); 
    return result; 
}

int[,] Create2DRandomArray(int row, int column, int minValue, int maxValue)
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

int[,] EvenPositionsQuadsArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j <  array.GetLength(1); j++)
        {
            if (i % 2 == 0 && j % 2 == 0)
            {
                array[i,j] *= array[i,j];
            }
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
System.Console.WriteLine();
int[,] ReverseArray = EvenPositionsQuadsArray(myArray);
Print2DArray(ReverseArray);
