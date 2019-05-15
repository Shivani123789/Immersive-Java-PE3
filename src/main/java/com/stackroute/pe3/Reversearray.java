
package com.stackroute.pe3;

public class Reversearray
{

    public String[] evenOdd(int a[])
    {
        String[] result = new String[a.length];
        for(int i=0; i< a.length; i++)
        {
            if(a[i]%2 == 0)
            {
                result[i] ="even";
            }
            else
            {
                result[i]="odd";
            }
        }
        return result;
    }

    public int[] reversearray(int a[])

    {   int b[]=new int[a.length];
    int i;
    int j=0;
        for (i=(a.length)-1;i>=0;i--)
    {
      b[j]+=a[i];
      j++;
    }
        System.out.println(b);
        return b;
    }
public int [] removePrime(int arr[]) {

    int i = 0;
    int j = 0;
    int k = 0;
    int countc = 0;
    int countp = 0;

    for(i = 0; i < arr.length; i++){


        if(isPrime(arr[i]))
            countp++;
        else
            countc++;
    }
    int prim[] = new int[countp];
    int com[] = new int[countc];
    for(i = 0; i < arr.length; i++){
        if(isPrime(arr[i]))
            prim[j++] = arr[i];
        else


            com[k++] = arr[i];
    }
    System.out.println("Prime Numbers:");
    for(i = 0; i < prim.length; i++)
        System.out.print(prim[i] + "\t");
    System.out.println("\nComposite Numbers:");
   // for(i = 0; i < com.length; i++)
    int result[] = new int[com.length];
    int m=0;
    System.out.println(com.length);
    for(i = 0; i < com.length; i++)
    {
        System.out.print(com[i] + "\t");
        result[m]+=com[i];
        m++;
    }
    return result;
}
    public static boolean isPrime(int n){
        int f = 0;
        for(int i = 1; i <= n; i++)
            if(n % i == 0)
                f++;
        if(f == 2)
            return true;
        return false;
    }


}