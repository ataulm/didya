package com.ataulm.didya;

import com.ataulm.didya.Adder;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class DoublerTest {

    private static final int HALF = 1;
    private static final int WHOLE = 2;

    com.ataulm.didya.Doubler doubler;

    @Mock
    Adder mockAdder;

    @Before
    public void setUp() {
        initMocks(this);
        when(mockAdder.add(HALF, HALF)).thenReturn(WHOLE);
        doubler = new com.ataulm.didya.Doubler(mockAdder);
    }

    @Test
    public void twiceWillReturnDoubleTheInput() {
        int actual = doubler.twice(HALF);

        int expected = WHOLE;
        assertThat(actual).isEqualTo(expected);
    }

}
