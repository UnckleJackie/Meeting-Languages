using System.Windows.forms;
class AnotherDialogDemo
{
    static void Main()
    {
        //
        MessageBox.Show("Hi, there!", // Сообщение
        "Window Name", // Название окна
        MessageBoxButtons.OK, // Кнопки (одна ОК)
        MessageBoxIcon.Information // Пиктограмма
        );
    }
}
