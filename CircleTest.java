import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    double [] test_numbers = {100.5, 10.1, 1.7, 0 , -1, -10, -100};
    double [] test_circumference = {631.46, 63.46, 10.68, 0, 0, 0, 0};
    double [] test_area = {31730.87, 320.47, 9.08, 0, 0, 0, 0};


    Circle [] test_circle;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        test_circle = new Circle [test_numbers.length];
        for (int i = 0; i < test_numbers.length; i++) {
            test_circle[i] = new Circle(test_numbers[i]);
        }
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        test_circle = null;
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
    }

    @org.junit.jupiter.api.Test
    void getRadius() {
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        for (int i = 0; i < test_circumference.length; i++) {
            double circumference = test_circle[i].getCircumference();
            String formattedNumber = String.format("%.2f", circumference);
            circumference = Double.parseDouble(formattedNumber);
            assert circumference == test_circumference[i];
            System.out.println("Circumference[" + i + "] -> " + circumference);
        }
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        for (int i = 0; i < test_area.length; i++) {
            double area = test_circle[i].getArea();
            String formattedNumber = String.format("%.2f", area);
            area = Double.parseDouble(formattedNumber);
            assert area == test_area[i];
            System.out.println("Area[" + i + "] -> " + area);
        }
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        for (int i = 0; i < test_circle.length; i++) {
            System.out.println("test_circle[" + i + "] -> " + test_circle[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        Circle obj1 = new Circle(5);
        Circle obj2 = new Circle(5);
        Circle obj3 = new Circle(10);

        assertTrue(obj1.equals(obj2));
        assertTrue(obj1.equals(obj1));
        assertFalse(obj1.equals(obj3));
        assertFalse(obj1.equals(null));
        assertFalse(obj1.equals(test_circle));
        assertFalse(obj1.equals(new Circle(7)));
        assertTrue(obj1.equals(new Circle(5)));
    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
        for (int i = 0; i < test_circle.length; i++) {
            System.out.println("test_circle[" + i + "].hashCode() -> " + test_circle[i].hashCode());
        }
    }
}