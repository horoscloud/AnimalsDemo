package at.campus02.wagenhofer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal test;

    @BeforeEach
    void setUp() {
        test = new Animal("Test", 3, "Katze", "Miau");
    }

    @Test
    void giveAnimalLoud() {
        assertTrue(test.giveAnimalLoud().equals("Animal loud: Miau"));
    }

    @Test
    void getNameAndAge() {
        assertTrue(test.getNameAndAge().equals("Name: Test, Age: 3"));
    }

    @Test
    void ageCategory() {
        assertTrue(test.ageCategory().equals("young animal"));
    }
}