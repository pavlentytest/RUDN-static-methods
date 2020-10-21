package task2;

public class Vector2D {
    public double x;
    public double y;

    /* public Vector2D() {

    } */

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // конструктор копирования
    public Vector2D(Vector2D vector) {
        this.x = vector.x;
        this.y = vector.y;

    }
}
