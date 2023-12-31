using System;
using System.Windows.Forms;
using Microsoft.VisualBasic;

namespace _3_16_Знакомство_с_Перехватом_Исключений_try_catch
{
    internal static class TryCatchDemo
    {
        /// <summary>
        ///  The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        { // Сообщение о начале выполнения программы
            MessageBox.Show("Выполняется программа!", "Начало");
            // Перехват и обработка исключений
            try     // Контролируемый код
            {       // Попытка преобразовать текст в число
                Double.Parse(Interaction.InputBox("Введите действительное число", 
                    "Число"));  // Отображение сообщения
                MessageBox.Show("Да, это было число!", "Число");
            }
            catch   // Блок обработки исключений
            {       // Отображение сообщения
                MessageBox.Show("Надо было ввести число!", "Эррор йопт!", 
                    MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            // Завершение блока обработки исключений и сообщ-е о зав-ии программы
            MessageBox.Show("Программа завершена", "Давай, некогда!");
        }
    }
}