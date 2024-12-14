package ru.netology.javaqa;

public class AlreadyExistsException extends RuntimeException{

    public AlreadyExistsException(int id) {
        super("Товар c id = " + id + " уже существует.");
    }
}
