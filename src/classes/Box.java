package classes;

public class Box {
    private double height;
    private double width;
    private double length;

    public Box(double size)
    {
        this(size, size, size);
    }

    public Box(double height, double width, double length)
    {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box Increase()
    {
        return new Box(this.length*2, this.width*2, this.height*2);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
