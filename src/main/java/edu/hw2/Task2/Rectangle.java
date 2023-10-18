package edu.hw2.Task2;

public class Rectangle {
    private final int width;
    private final int height;

    Rectangle(int width0, int height0) {
        width = width0;
        height = height0;
    }

    Rectangle setWidth(int newWidth) {
        return new Rectangle(newWidth, height);
    }

    Rectangle setHeight(int newHeight) {
        return new Rectangle(width, newHeight);
    }

    double area() {
        return width * height;
    }
}
