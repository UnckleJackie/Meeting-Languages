/*Напишите программу, которая перевернёт одномерный массив 
(последний элемент будет на первом месте, а первый - на последнем и т.д.)
[1 2 3 4 5] -> [5 4 3 2 1]
[6 7 3 6] -> [6 3 7 6] */

int Prompt(string message)
{
    System.Console.Write(message);
    string readInput = System.Console.ReadLine();
    int result = Convert.ToInt32(readInput);
    return result;
}

int[] CreateRandomArray(int size, int minValue, int maxValue)
{
    int[] array = new int[size];

    for (int i = 0; i < size; i++)
    {
        array[i] = new Random().Next(minValue, maxValue+1);
    }
    return array;
}

void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        System.Console.Write( array[i] + " ");
    }
    System.Console.WriteLine();
}

int[] ReverseArray(int[] array) // Reverse from end to begin Method (Метод пузырьковой сортировки)
{
    int temp;
    for (int i = 0; i < array.Length / 2; i++)
    {
        temp = array[i];
        array[i] = array[array.Length - 1 - i];
        array[array.Length - i - 1] = temp;
    }
    return array;
}

int size = Prompt("Задай размер массива: "); 
int min = Prompt("Минимальное число диапазона: ");
int max = Prompt("максимальное число диапазона: ");
int[] myArray = CreateRandomArray(size, min, max);
PrintArray(myArray);

int[] myArrayReverse = ReverseArray(myArray);
System.Console.WriteLine("Теперь перевернем наш массив: ");
PrintArray(myArrayReverse);