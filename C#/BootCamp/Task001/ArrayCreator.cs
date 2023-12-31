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
        return new int[n];
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
}