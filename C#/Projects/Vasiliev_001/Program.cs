// Использование пространства имен:
using System.Windows.Forms;
// Класс с главным методом программы:
class AnotherDialogDemo
{
    // Главный метод программы:
    static void Main()
    {
        // Отображение диалогового окна:
        MessageBox.Show("Всем привет!", // Сообщение
        "Окно с названием",             // Название окна
        MessageBoxButtons.OK,           // Кнопки (одна ОК)
        MessageBoxIcon.Information);     // Пиктограмма
    }
}