using System;
using System.Windows.Forms;
using Microsoft.VisualBasic;

namespace _006_OddEven
{
    internal static class Program
    {
        /// <summary>
        /// Главная точка входа для приложения.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Form1());

            int number, reminder;
            number = Int32.Parse(Interaction.InputBox("Введите целое число: ", "Проверка"));
            reminder = number % 2;
            string txt = "Вы ввели ";
            txt += (reminder == 0 ? "четное" : "нечетное") + " число!";
            MessageBox.Show(txt);
        }
    }
}
