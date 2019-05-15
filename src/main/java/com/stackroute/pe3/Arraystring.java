package com.stackroute.pe3;
import java.lang.*;
import java.io.StringWriter;
public class Arraystring {

        //Compare the elements of both the arrays
        public String Elements(String array1[],String array2[])
        {
            String  result="";
            boolean flag=true;
            for (int i=0;i<array1.length;i++ ){
                flag=array1[i].equals(array2[i]);

                if(flag==false) {
                    result = "The array elements in both the arrays are not equal";
                    break;
                }
            }
            if (flag==true)
                result="The array elements in both the arrays are equal";

            return result;
        } //end of Elements


        //Loop through each array, to remove any duplicate elements.
        public String[] removeDuplicateElements(String[] str)
        {
            String[] result1 = new String[str.length-1];
            int m, n, count1=0;
            for(m=0; m<str.length; m++)
            {
                for(n=0; n<count1; n++)
                {
                    if(str[m]==result1[n])
                    {
                        break;
                    }

                }
                if(n==count1)
                {
                    result1[count1] = str[m];
                    count1++;
                }

            }
            int t=count1-2;
            System.out.println("total non duplicate numbers"+t);

//
           return result1;
        }//End of removeDuplicateElements


        //Append the first element of array1 to array2.
        public String[] appendFirstElement(String[] s1,String[] s2)
        {
            String[] result = new String[s2.length+1];
            result[0] = s1[0];
            int j=0;
            for (int i=1; i<result.length; i++)
            {
                result[i] = s2[j];
                j++;
            }
            return result;
        }//End of appendFirstElement


        //Prepend the mid element of array2 to array1.
        public String[] prependMidElement(String[] s1, String[] s2)
        {
            String[] result= new String[s1.length+1];
            int pos = s2.length/2,j=0;

            result[0] = s2[pos];

            for (int i=1; i<result.length; i++)
            {
                result[i]=s1[j];
                j=j+1;

            }
            return result;
        }//End of PrependMidElement
    }





