import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    int [] test_numbers = {100, 10, 1, 0 , -1, -10, -100};

    Circle [] test_circle;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        test_circle = new Circle [test_numbers.length];
        for (int i = 0; i < test_numbers.length; i++) { {
            test_circle[i] = new Circle(test_numbers[i]);
        }

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
//        assert 628.31858 == (getCircumference() && radius == 100.0);
    }

    @org.junit.jupiter.api.Test
    void getArea() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
        for (int i = 0; i < test_circle.length; i++) {
            System.out.println("test_circle[" + i + "] -> " + test_circle[i]);
        }
    }
}