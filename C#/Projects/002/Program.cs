public void TheMouseIsDown(object sender, MouseEventsArgs e)
{
    // ���������� ������� ���������
    System.Drawing.Graphics g = this.CreateGraphics();
    // ������������� ������� �����
    System.Drawing.Pen redPen = new System.Drawing.Pen(Color.Red, 3);

    // ������ ���������� ��� ������ � ������� �����
    // ���������� �������� � ������������ �� ��������
    // ���������� X � Y ������ �������� ���� ��������
    // ������������ ������������ �������� ��������� ����.
    g.DrawEllipse(redPen, e.X, e.Y, 40, 40);

    // 
    g.Dispose();
}