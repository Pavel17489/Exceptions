package ru.netology.javaqa;

public class NotFoundException extends RuntimeException {

    public NotFoundException(int id) {
        super("Товар c id = " + id + " не найден.");
    }
}
