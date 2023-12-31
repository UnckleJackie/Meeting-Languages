// Задание 1. Задайте двумерный массив. Напишите программу, 
// которая поменяет местами первую и последнюю строку массива.
// Например, задан массив:
//1 4 7 2
//5 9 2 3
//8 4 2 4
//В итоге получается вот такой массив:
//8 4 2 4
//5 9 2 3
//1 4 7 2

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

int[,] ChangeArrayRows(int[,] array, int row1, int row2)
{
    if (row1 > array.GetLength(0) || row2 > array.GetLength(1) || row1 < 0 || row2 < 0)
    {
        System.Console.WriteLine("Index of row is out of bound");
        return array;
    }
    else
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            int temp = array[row1, j];
            array[row1, j] = array[row2, j];
            array[row2, j] = temp;
        }
    }
    return array;
}

int row = Prompt("Input rows > "); 
int column = Prompt("Input columns > ");
int min = Prompt("Input minValue > ");
int max = Prompt("Input maxValue > ");

int[,] myArray = Create2DRandomArray(row, column, min, max);
Print2DArray(myArray);

int row1 = Prompt("Input row1: ");
int row2 = Prompt("Input row2: ");
int[,] myArray2 = ChangeArrayRows(myArray, row1, row2);
Print2DArray(myArray2);
