package edu.gus;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HamcrestTest {

    @Test
    public void testHamcrest() {
        //Arrange
        List<String> list = mock(List.class);

        //Act and Assertion
        when(list.get(anyInt())).thenReturn("Gustavo");
        assertThat(list.get(1),equalTo("Gustavo"));
    }



}
