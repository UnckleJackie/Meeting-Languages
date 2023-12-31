using System;
using System.Windows.Forms;
using Microsoft.VisualBasic;
namespace _3_6_Оператор_выбора_с_пустыми_case_блоками
{
    class AnotherSwitchDemo
    {
        /// <summary>
        ///  The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            int number; // Переменная для запоминания введенного числа
            string txt = ""; // Переменная для текста сообщения, далее считывание числа
            number = Int32.Parse(Interaction.InputBox("Введите целое число от 1 до 9: ", "Число"));
            switch (number) // Оператор выбора
            {
                case 1: // Если 1 или 9
                case 9:
                    txt = "Вы ввели нечетное,\n но не простое число!";
                    break;
                case 2: // Если значения 2, 3, 5 или 7
                case 3:
                case 5:
                case 7:
                    txt = "Вы ввели простое число.";
                    break;
                case 4: // Если 4 или 8
                case 8:
                    txt = "Вы ввели число - степень двойки!";
                    break;
                case 6:
                    txt = "Вы ввели 6 - совершенное число!";
                    break;
            }
            MessageBox.Show(txt, "Число"); // Отображение диалогового окна с сообщением
        }
    }
}