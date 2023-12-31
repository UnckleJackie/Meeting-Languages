using System;

namespace _014_Расчет_скидки_decimal
{
    class UseDecimal
    { // Использовать тип decimal для расчета скидки
        static void Main()
        {
            decimal price;
            decimal discount;
            decimal discounted_price;

            // Рассчитать цену со скидкой.
            price = 19.95m;
            discount = 0.15m; // норма скидки составляет 15%
            discounted_price = price - (price * discount);

            Console.WriteLine("Цена со скидкой: $" + discounted_price);
        }
    }
}
