using System;

namespace _072_Применение_Параметров_В_Методе
{ // Простой пример применения параметра
    class ChkNum
    {
        // Возвратить значение true, если значение параметра х окажется простым числом 
        public bool IsPrime(int x)
        {
            if (x <= 1) return false;

            for (int i = 2; i <= x / i; i++)
                if ((x % i) == 0) return false;
            return true;
        }
    }
    class ParmDemo
    {
        static void Main()
        {
            ChkNum ob = new ChkNum();

            for (int i = 2; i < 10; i++)
                if (ob.IsPrime(i)) Console.Write(i + " простое число.");
                else Console.WriteLine(i + " непростое число.");

        }
    }
}
