// Задайте двумерный массив. Напишите программу,
// которая заменяет строки на столбцы. В случае, если это
// невозможно, программа должна вывести сообщение для
// пользователя.

int Prompt(string message) 
{
    System.Console.Write(message); 
    string value = Console.ReadLine(); 
    int result = Convert.ToInt32(value); 
    return result; 
}

int [,] Create2DRandomArray(int row, int minValue, int maxValue)
{
    int [,] array = new int[row, row];
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < row; j++)
        {
            array[i, j] = new Random().Next(minValue, maxValue + 1);
        }
    }
    return array;
}

void Print2DArray(int[,] array)
{    
    System.Console.WriteLine();
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            System.Console.Write(array[i, j] + " ");
        }
        System.Console.WriteLine();
    }
}

int[,] ChangeArrayRowsToCollumns(int[,] array)
{
    if (array.GetLength(0) != array.GetLength(1))
    {
        System.Console.WriteLine("Invalid Array");
        return array;
    }
    else
    {
        for (int i = 0; i < array.GetLength(0); i++)
        {
            for ( int j = i + 1; j < array.GetLength(0); j++)
            {
            int temp = array[i, j];
            array[i, j] = array[j, i];
            array[j, i] = temp;
            }
        }
    }
    return array;
}

int row = Prompt("Input rows > "); 
int min = Prompt("Input minValue > ");
int max = Prompt("Input maxValue > ");

int[,] myArray = Create2DRandomArray(row, min, max);
Print2DArray(myArray);

int[,] myArray2 = ChangeArrayRowsToCollumns(myArray);
Print2DArray(myArray2);