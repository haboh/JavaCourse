package edu.hw2.Task2;

public class Square extends Rectangle {
    Square(int size) {
        super(size, size);
    }

    @Override
    Square setWidth(int width) {
        return new Square(width);
    }

    @Override
    Square setHeight(int height) {
        return new Square(height);
    }
}
