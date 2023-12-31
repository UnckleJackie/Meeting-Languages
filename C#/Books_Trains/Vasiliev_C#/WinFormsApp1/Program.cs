using System;
using System.Windows.Forms;
using Microsoft.VisualBasic;
class HundredsDemo
{
    static void Main()
    {
        int number, hundreds; // Целочисленные переменные, считывание целого числа
        number = Int32.Parse(
            Interaction.InputBox( // Надпись над полем ввода:
                "Введите целое число: ", "Количество сотен")); // Заголовок окна
        hundreds = number / 100 % 10; // Формула для вычисления количества сотен
        string txt = "В этом числе " + hundreds + " сотен!";
        MessageBox.Show(txt, "Сотни"); // Отображение окна с сообщением
    }
}