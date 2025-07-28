package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

public class TestStringConcat {
  DailyTasks dt = new DailyTasks();

  @Test
  public void testDoStringConcat() {
    String expected = "Hello World";
    String result = dt.doStringConcat("Hello", "World");
    assertEquals(expected, result);
  }

  @Test
  public void testSortValues() {
    int[] arr = { 1, 9, 1, 3, 6 };
    int[] expected = { 1, 1, 3, 6, 9 };
    int[] result = dt.sortValues(arr);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testCheckPresence() {
    String str = "The quick brown fox jumps over the lazy dog";
    String search = "fox";
    boolean expected = true;
    boolean result = dt.checkPresence(str, search);
    assertEquals(expected, result);
  }
}
