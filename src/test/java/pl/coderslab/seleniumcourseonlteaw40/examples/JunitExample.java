package pl.coderslab.seleniumcourseonlteaw40.examples;

import org.junit.jupiter.api.*;

public class JunitExample {
    @Test
    public void firstTest() {
        System.out.println("firstTest");
    }

    @Test
    public void secondTest() {
        System.out.println("secondTest");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("this will run before each @Test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("this will run after each @Test");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("this will run before ALL Tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("this will run after ALL Tests");
    }
}
