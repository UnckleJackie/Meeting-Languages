//  Задайтедвумерный массив из целых чисел.
// Напишите программу, которая удалит строку и столбец, на
// пересечении которых расположен наименьший элемент
// массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7
// Наименьший элемент - 1, на выходе получим
// следующий массив:
// 9 4 2
// 2 2 6
// 3 4 7

int Prompt(string message) 
{
    System.Console.Write(message); 
    string value = Console.ReadLine(); 
    int result = Convert.ToInt32(value); 
    return result; 
}

int [,] Create2DRandomArray(int row, int columns, int minValue, int maxValue)
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
            System.Console.Write($"{array[i, j]}\t");
        }
        System.Console.WriteLine();
    }
}

int[,] ModifiedArray(int[,] array)
{
    int min = array[0,0];
    int jmin = 0;
    int imin = 0;
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            if (array[i,j] <= min) 
            {
               min = array[i,j];
               imin = i;
               jmin = j;
            }
        }
    }
    for (int j = 0; j < array.GetLength(1); j++) array[imin,j] = 0;
    for (int i = 0; i < array.GetLength(0); i++) array[i,jmin] = 0;
    return array;
}

int row = Prompt("Введите количество строк: ");
int columns = Prompt("Введите количество столбцов: ");
int minValue = Prompt("Введите минимальное значение: ");
int maxValue = Prompt("Введите максимальное значение: ");

int[,] myArray = Create2DRandomArray(row, columns, minValue, maxValue);
Print2DArray(myArray);
int[,] ModArray = ModifiedArray(myArray);
Print2DArray(ModArray);