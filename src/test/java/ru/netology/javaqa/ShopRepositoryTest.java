package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {

    @Test
    public void testRemoveWhenProductExist() {

        ShopRepository repo = new ShopRepository();
        Product p1 = new Product(1, "ноутбук", 50_000);
        Product p2 = new Product(2, "опрыскиватель", 150);
        Product p3 = new Product(3, "гитара", 25_000);
        Product p4 = new Product(4, "блокнот", 250);

        repo.add(p1);
        repo.add(p2);
        repo.add(p3);
        repo.add(p4);
        repo.remove(3);

        Product[] actual = repo.findAll();
        Product[] expected = {p1, p2, p4};

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testRemoveWhenProductNotExist() {

        ShopRepository repo = new ShopRepository();
        Product p1 = new Product(1, "ноутбук", 50_000);
        Product p2 = new Product(2, "опрыскиватель", 150);
        Product p3 = new Product(3, "гитара", 25_000);
        Product p4 = new Product(4, "блокнот", 250);

        repo.add(p1);
        repo.add(p2);
        repo.add(p3);
        repo.add(p4);

        Assertions.assertThrows(NotFoundException.class,
        () -> repo.remove(56)
        );
    }
}