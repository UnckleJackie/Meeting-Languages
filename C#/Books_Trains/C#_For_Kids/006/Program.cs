using System;
using System.Windows.Forms;
class MyButtonClass : Form
{
    private Button mrButton; // Метод-конструктор
    public MyButtonClass()
    {
        mrButton = new Button();
        mrButton.Text = "Нажми меня";
        mrButton.Top = 100;
        mrButton.Left = 100;
        mrButton.Height = 50;
        mrButton.Width = 70;

        mrButton.Click += new System.EventHandler(MyButtonClickEventHandler);
        this.Controls.Add(mrButton);
    }
    // Основной метод
    static void Main()
    {
        Application.Run(new MyButtonClass());
    }
    // Метод-обработчик событий
    void MyButtonClickEventHandler(object sender, System.EventArgs e)
    {
        mrButton.Text = "Вы нажали меня!";
    }

    public void TheMouseIsDown(object sender, MouseEventArgs e)
    {
        if (e.Button == MouseButtons.Left)
            this.Text = "Нажата левая кнопка мыши";
    }
    //this.MouseDown += new MouseEventHandler(TheMouseIsDown);

    public void TheMouseWasClicked(object sender, MouseEventArgs e)
    {
        if (e.Button == MouseButtons.Left) this.Width = this.Width + 100;
        else if (e.Button == MouseButtons.Right) this.Width = this.Width - 100;
        // При нажатии ЛКМ - расширение текущего окна
        // При нажатии ПКМ - сужение текущего окна
    }
}