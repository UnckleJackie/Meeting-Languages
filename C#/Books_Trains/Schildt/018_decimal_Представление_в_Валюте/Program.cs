using System;

namespace _018_decimal_Представление_в_Валюте
{
    internal class UseDecimal
    { // Использовать спецификатор формата С для вывода результата в местной валюте
        static void Main()
        {
            decimal price;
            decimal discount;
            decimal discounted_price;
            // рассчитать цену со скидкой
            price = 19.95m;
            discount = 0.15m;
            discounted_price = price - (price * discount);

            Console.WriteLine("Цена со скидкой {0:C}", discounted_price);
        }
    }
}
