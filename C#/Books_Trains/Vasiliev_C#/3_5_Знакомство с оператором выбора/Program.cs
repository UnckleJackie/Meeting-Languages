using System;
using System.Windows.Forms;
using Microsoft.VisualBasic;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_5_Знакомство_с_оператором_выбора
{
    class SwitchDemo
    {
        static void Main()
        {
            int number;
            string name;
            number = Int32.Parse(Interaction.InputBox("Введите число: ", "Число"));

            switch (number)
            {
                case 1:
                    name = "Единица";
                    break;
                case 2:
                    name = "Двойка";
                    break;
                case 3:
                    name = "Тройка";
                    break;
                case 4:
                    name = "Четверка";
                    break;
                default:
                    name = "Неизвестное число";
                    break;
            }
            MessageBox.Show(name, "Число");
        }
    }
}
