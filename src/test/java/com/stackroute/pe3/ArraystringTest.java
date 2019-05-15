package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraystringTest {



    Arraystring  af;

        @Before
        public void setup()
        {
            //arrenge
            af = new Arraystring();
        }

        @After
        public void tearDown()
        {
            //arrenge
            af = null;
        }

        @Test
        public void ElementsTest(){

            String array1[]=new String[] {"a","b","c","d","e"};
            String array2[]=new String[] {"a","b","c","d","e"};
            String expected="The array elements in both the arrays are equal";
            String actual=af.Elements(array1,array2);
            assertEquals(expected,actual);

        }

        @Test
        public void ElementsTestFailure()
        {
            String array1[]=new String[] {"e","a","d","c","b"};
            String array2[]=new String[] {"a","b","c","d","e"};
            assertNotEquals("The array elements in both the arrays are equal", af.Elements(array1, array2));
        }


        @Test
        public void removeDuplicate()
        {
            String[] array1 = { "a" , "b" , "a" , "d" , "e"};
            String[] array2 = { "f" , "g" , "h" , "g" , "j"};
            String[] actual1 = af.removeDuplicateElements(array1);
            String[] expected1 = {"a" , "b" , "d" , "e"};
            assertArrayEquals(expected1, actual1);
            String[] actual2 = af.removeDuplicateElements(array2);
            String[] expected2 = {"f" , "g" , "h" , "j"};
            assertArrayEquals(expected2, actual2);
        }

        @Test
        public void removeDuplicateFailure()
        {
            String[] array1 = { "a" , "b" , "a" , "d" , "e"};
            String[] array2 = { "f" , "g" , "h" , "g" , "j"};
            assertNotEquals("a, b, a, d, e", af.removeDuplicateElements(array1));
            assertNotEquals("f, g, h, g, j", af.removeDuplicateElements(array2));
        }


        @Test
        public void appendFirst()
        {
            String[] array1 = { "a" , "b" , "c" , "d" , "e"};
            String[] array2 = { "f" , "g" , "h" , "i" , "j"};
            String[] actual = af.appendFirstElement(array1, array2);
            String[] expected = { "a" , "f" , "g" , "h" , "i" , "j"};
            assertArrayEquals(expected, actual);
        }

        @Test
        public void appendFirstFailure()
        {
            String[] array1 = { "a" , "b" , "c" , "d" , "e"};
            String[] array2 = { "f" , "g" , "h" , "i" , "j"};
            assertNotNull(af.appendFirstElement(array1, array2));
            assertNotEquals("f, g, h, i, j", af.appendFirstElement(array1, array2));
        }


        @Test
        public void PrependMid()
        {
            String[] array1 = { "a" , "b" , "c" , "d" , "e"};
            String[] array2 = { "f" , "g" , "h" , "i" , "j"};
            String[] actual = af.prependMidElement(array1, array2);
            String[] expected = { "h" , "a" , "b" , "c" , "d" , "e"};
            assertArrayEquals(expected, actual);
        }

        @Test
        public void PrependMidFailure()
        {
            String[] array1 = { "a" , "b" , "c" , "d" , "e"};
            String[] array2 = { "f" , "g" , "h" , "i" , "j"};
            assertNotNull(af.prependMidElement(array1, array2));
            assertNotEquals("a, b, c, b, e", af.prependMidElement(array1, array2));
        }

    }



