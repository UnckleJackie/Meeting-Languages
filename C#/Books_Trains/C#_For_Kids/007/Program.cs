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
        // ��� ������� ��� - ���������� �������� ����
        // ��� ������� ��� - ������� �������� ����
    }

    public void TheMouseMoved(object sender, MouseEventArgs e)
    {
        // ���������� ������� ���������
        System.Drawing.Graphics g = this.CreateGraphics();
        // ������������� ������� �����
        System.Drawing.Pen redPen = new System.Drawing.Pen(Color.Red, 3);
        // ������ ���������� ��� ������ � ������� �����.
        // ���������� �������� � ������������ �� ��������.
        // ���������� X � Y ������ �������� ���� ��������
        // ������������ ������������ �������� ��������� ����.
        g.DrawEllipse(redPen, e.X, e.Y, 40, 40);
        // �������
        g.Dispose();
    }

    
}