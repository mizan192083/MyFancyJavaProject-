interface Shape
{
    void draw();
}


class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("a circle drawn");
    }
}


class Square implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("a square drawn");
    }
}

class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("a rectangle drawn");
    }
}


public Shape getShape(String type) throws Exception {
        switch (type) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                throw new Exception("Shape type : " + type + " cannot be instantiated");
        }
}


class Painter
{
    public static void main(String[] args) throws Exception
    {

        ShapeFactory printerShape = new ShapeFactory();
        printerShape circle=printerShape.getShape("Circle");
        circle.draw();
        Shape Rectangle = printerShape.getShape("Rectangle");
        square.draw();

        Shape rombus = printerShape.getShape("Rombus");
        rombus.draw();
    }
}