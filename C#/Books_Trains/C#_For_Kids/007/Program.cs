using System.Windows.Forms;
class SimpleWindowsForm : Form
{
    static void Main()
    {
        Application.Run(new SimpleWindowsForm());
    }
    public void TheMouseWasClicked(object sender, MouseEventArgs e)
    {
        if (e.Button == MouseButtons.Left) this.Width = this.Width + 100;
        else if (e.Button == MouseButtons.Right) this.Width = this.Width - 100;
        // При нажатии ЛКМ - расширение текущего окна
        // При нажатии ПКМ - сужение текущего окна
    }

    public void TheMouseMoved(object sender, MouseEventArgs e)
    {
        // Подготовка области рисования
        System.Drawing.Graphics g = this.CreateGraphics();
        // Использование красной ручки
        System.Drawing.Pen redPen = new System.Drawing.Pen(Color.Red, 3);
        // Рисуем окружность как эллипс с равными осями.
        // Окружность рисуется в охватывающем ее квадрате.
        // Координаты X и Y левого верхнего угла квадрата
        // определяются координатами текущего положения мыши.
        g.DrawEllipse(redPen, e.X, e.Y, 40, 40);
        // Очистка
        g.Dispose();
    }

    
}