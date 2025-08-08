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

    @Test
    public void testMockito_MockitoVerifyTimes() {
        //Arrange
        List<String> list = mock(List.class);
        int timesAdd = 2;

        //Act
        for (int i = 0; i < timesAdd; i++) list.add("Gustavo");

        //Assertion
        verify(list,times(timesAdd)).add("Gustavo");
    }

    @Test
    public void testMockito_MockitoVerifyTimesAtLeast() {
        //Arrange
        List<String> list = mock(List.class);
        int timesAdd = 2;
        int timesAddAtLeast = 1;
        int timesAddAtMost = 5;

        //Act
        for (int i = 0; i < timesAdd; i++) list.add("Gustavo");

        //Assertion
        verify(list,atLeast(timesAddAtLeast)).add("Gustavo");
        verify(list,atLeastOnce()).add("Gustavo");
        verify(list,atMost(timesAddAtMost)).add("Gustavo");
    }

    

}
