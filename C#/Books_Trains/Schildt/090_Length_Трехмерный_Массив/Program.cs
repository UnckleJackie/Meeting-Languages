using System;

namespace _090_Length_Трехмерный_Массив
{ // Использовать свойство Length трехмерного массива
    class LengthDemo3D
    {
        static void Main()
        {
            int[,,] nums = new int[10, 5, 6];
            Console.WriteLine("Длина массива nums равна " + nums.Length);
        }
    }
}
