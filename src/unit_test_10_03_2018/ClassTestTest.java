package unit_test_10_03_2018;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ClassTestTest {
    HashMap<String, Integer> map;

    @Test
    public void mapNotEmptyHappyFlow() {
        map = new HashMap<>();
        map.put("Alexey", 2);
        assertEquals("Error", map.containsKey("Alexey"), true);
    }

    @Test
    public void testValueExistHappyFlow() {
        Integer num = 7;
        map = new HashMap<>();
        map.put("Lior", 7);
        assertEquals("Error", map.get("Lior"), num);
    }

    @Test()
    public void testNullPointerException() {
        map = new HashMap<>();
        assertNull(map.get("Alexey"));
    }

    @Test
    public void happyPersonFlow() {
        Map<Person, Integer> map = new HashMap<>();
        Person p1 = new Person("Alex", 5);
        Person p2 = new Person("Alex", 3);
        map.put(p1, 10);
        assertEquals("Error", (Integer) 10, map.get(p2));
    }

    @Test
    public void rannyPersonFlow() {
        Map<Person, Integer> map = new HashMap<>();
        Person p1 = new Person("Alex", 5);
        Person p2 = new Person("Alexqqqqq", 5);
        map.put(p1, 10);
        assertNotEquals("Error", (Integer) 10, map.get(p2));
    }

    @Test()
    public void exceptionPersonFlow() {
        Map<Person, Integer> map = new HashMap<>();
        Person p1 = new Person("Alex", 5);
        Person p2 = new Person("Alex", 5);
        assertNull(map.get(p1));
    }
}