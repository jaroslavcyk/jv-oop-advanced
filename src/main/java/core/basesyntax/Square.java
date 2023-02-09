package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        setColor(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: square, area: "
                + calculateArea() + " sq.units, side: "
                + side + " units, color: "
                + getColor().name());
    }
}

