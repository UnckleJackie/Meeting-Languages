// Используем ресурсы Visual Basic:
using Microsoft.VisualBasic;
using System.Windows.Forms;
class InputDialogDemo
{
    static void Main()
    {
        // Текстовая переменная:
        string name;
        // Отображение окна с полем ввода:
        name = Interaction.InputBox(
            "Как Вас зовут?", // Текст над полем ввода
            "Давайте познакомимся..."); // Название окна
        // Еще одна текстовая переменная:
        string txt = "Очень приятно, " + name + "!";
        // Окно с сообщением:
        MessageBox.Show(txt, "Знакомство состоялось");
    }
}