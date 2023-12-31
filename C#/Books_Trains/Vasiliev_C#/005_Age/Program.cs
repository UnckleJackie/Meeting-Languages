using System;
using Microsoft.VisualBasic;
using System.Windows.Forms;
class EnteringInteger
{
    static void Main()
    {
        string res, txt; // Текстовые переменные
        int year = 2023, age, born; // Целочисленные переменные
        res = Interaction.InputBox("В каком году вы родились?", "Год рождения");
        // Отображение окна с полем ввода
        born = Int32.Parse(res); // Преобразование текста в число
        age = year - born; // Вычисление возраста
        txt = "Получается, что Вам " + age + " лет"; // Окно с сообщением:
        MessageBox.Show(txt, "Возраст");
    }
}
