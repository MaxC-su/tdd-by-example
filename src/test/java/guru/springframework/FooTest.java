package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    void getBar() {
        Foo foo = new Foo();
        assertEquals("Foobar", foo.getBar());
    }
}