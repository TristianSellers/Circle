import java.util.Objects;

public class Circle {
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double r) {
        if (r < 0) {
            radius = 0;
        }
        else {
            radius = r;
        }

    }

    public void setRadius(double r) {
        if (r < 0) {
            radius = 0;
        }
        else {
            radius = r;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "" + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
