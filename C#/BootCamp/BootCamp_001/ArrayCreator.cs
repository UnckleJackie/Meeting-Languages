
using System;
using System.Linq;
/// <summary>
///  Это класс, отвечающий за создание массива
/// </summary>
public static class ArrayCreator
{
    /// <summary>
    /// Метод создания массива
    /// </summary>
    /// <param name="n">Количество элементов</param>
    /// <returns>новый массив</returns>
    public static int[] Create(this int n)
    {
        string str = $"[{String.Join(",", array)}]";
        System.Console.WriteLine(str);
        return str;
    }
    /// <summary>
    /// Лепит массив в строку
    /// </summary>
    /// <param name="array">Массив</param>
    /// <returns>Строку с представлением массива</returns>
    public static string ConvertToString(this int[] array)
    {
        return $"[{String.Join(" ", array)}]";
    }

    public static int[] Fill(this int[] array, int min = 0, int max = 10)
    {
        return array = array.Select(item => Random.Shared.Next(min,max)).ToArray();
    }
}