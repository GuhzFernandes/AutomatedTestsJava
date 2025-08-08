package edu.gus;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class MockitoTest {
    @Test
    public void testMockito_SimpleMockingList() {
        //Arrange
        List<String> list = mock(List.class);
        when(list.get(anyInt())).thenReturn("Gustavo");

        //Act and Assertion
        Assertions.assertEquals("Gustavo",list.get(anyInt()));
    }

    @Test
    public void testMockito_MockitoVerify() {
        //Arrange
        List<String> list = mock(List.class);

        //Act
        list.add("Gustavo");

        //Assertion
        verify(list).add("Gustavo");
    }
}
