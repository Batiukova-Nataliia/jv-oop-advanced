package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstLength, int secondLength) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void drawable() {
        System.out.println("This figure is Rectangle with area"
                + getArea()
                + " square units"
                + " and properties: "
                + getFirstSide()
                + ", "
                + getSecondSide());
    }
}
