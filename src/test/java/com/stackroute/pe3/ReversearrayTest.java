package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;

public class ReversearrayTest
{
    Reversearray af;

    @Before
    public void setup()
    {
        //arrenge
        af = new Reversearray();
    }

    @After
    public void tearDown()
    {
        //arrenge
        af = null;
    }

    @Test
    public void evenOddTest() throws Exception
    {

        int[] arr = {4, 3, 7, 8};
        String[] result = af.evenOdd(arr);
        String[] expected = {"even", "odd", "odd", "even"};
        assertArrayEquals(expected, result);

    }
    @Test
    public void reversearrayTest() throws Exception
    {

        int[] arr = {4, 3, 7, 8,4};
        int [] result = af.reversearray(arr);
        int [] expected = {4,8,7,3,4};
        assertArrayEquals(expected, result);

    }
    @Test
    public void removePrimeTest() throws Exception
    {
        int[] arr = {3, 12, 7, 8};
        int[] result = af.removePrime(arr);
        int[] expected = {12,8};
        assertArrayEquals(result, expected);

    }
}