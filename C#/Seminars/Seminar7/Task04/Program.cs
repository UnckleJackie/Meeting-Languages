using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _001
{
    internal class Program
    {
        static void Main(string[] args)
        { // Конвертер валют с потенциалом на много разных операций
            float rublesInWallet;
            float dollarsInWallet;

            int rubToUsd = 96, usdToRub = 92;

            float exchangeCurrensyCount;

            string desiredOperation;

            Console.WriteLine("Привет, Вацок. Ты пришел в самый лючщий абменник да!");
            Console.WriteLine("Введи баланс рублей, слющий: ");
            rublesInWallet = Convert.ToSingle(Console.ReadLine());
            Console.WriteLine("Введи баланс долларов, вэу: ");
            dollarsInWallet = Convert.ToSingle(Console.ReadLine());

            Console.WriteLine("Брат, давай выбери аперация нужный да: ");
            Console.WriteLine("1 - рубли на доллары хочу поменять ");
            Console.WriteLine("2 - Доллары на рубли хочу, деньги очень нужны слющий.");
            Console.WriteLine("Какой выбираещь нипасредственно?: ");
            desiredOperation = Console.ReadLine();

            switch (desiredOperation)
            {
                case "1":
                    Console.WriteLine("Обмен рублей на доллары...");
                    Console.WriteLine("Сколько хочищь обменять, да? ");
                    exchangeCurrensyCount = Convert.ToSingle(Console.ReadLine());
                    if (rublesInWallet >= exchangeCurrensyCount)
                    {
                        rublesInWallet -= exchangeCurrensyCount;
                        dollarsInWallet += exchangeCurrensyCount / rubToUsd;
                    }
                    else
                    {
                        Console.WriteLine("Вэу, брат, нэ хуатает чутка да, ц-ц-ц");
                    }
                    break;
                case "2":
                    Console.WriteLine("Обмен долларов на рубли...");
                    Console.WriteLine("Сколько хочищь абмэнять слющий? ");
                    exchangeCurrensyCount = Convert.ToSingle(Console.ReadLine());
                    if (dollarsInWallet >= exchangeCurrensyCount)
                    {
                        dollarsInWallet -= exchangeCurrensyCount;
                        rublesInWallet += exchangeCurrensyCount * usdToRub;
                    }
                    else
                    {
                        Console.WriteLine("Вэу, брат, нэ хуатает чутка да, ц-ц-ц");
                    }
                    break; 
                default:
                    Console.WriteLine("Брат, зачем мазги дэлаешь слющий?!");
                    break;
            }
            Console.WriteLine($"Твой баланс, брат: {rublesInWallet} рублей и {dollarsInWallet} долларов. ");
        }
    }
}
