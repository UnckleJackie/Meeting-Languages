package program_020;

class Rectangle {
    private double _width;
    private double _height;

    public Rectangle(double w, double h) {
        this._width = w;
        this._height = h;
    }

    public double getwidth() {
        return this._width;
    }

    public void setwidth(double value) {
        if (value <= 0) {
            this._width = 1;
        } else {
            this._width = value;
        }
    }

    public double getheight() {
        return this._height;
    }

    public void setheigth(double value) {
        if (value <= 0) {
            this._height = 1;
        } else {
            this._height = value;
        }
    }

    public double calcArea() {
        return this._width * this._height;
    }
}
