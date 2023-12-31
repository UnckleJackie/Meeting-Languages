public void TheMouseIsDown(object sender, MouseEventsArgs e)
{
    // Подготовка области рисования
    System.Drawing.Graphics g = this.CreateGraphics();
    // Использование красной ручки
    System.Drawing.Pen redPen = new System.Drawing.Pen(Color.Red, 3);

    // Рисуем окружность как эллипс с равными осями
    // Окружность рисуется в охватывающем ее квадрате
    // Координаты X и Y левого верхнего угла квадрата
    // определяются координатами текущего положения мыши.
    g.DrawEllipse(redPen, e.X, e.Y, 40, 40);

    // 
    g.Dispose();
}