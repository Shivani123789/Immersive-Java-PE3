package com.stackroute.pe3;

public class ArrayOfPlace {

    public String[] place(String s[]) {
        for (int i = 0; i < s.length; i++) {
            String str=s[i].substring(1);
            str = str.replaceAll("[aeiou]", "");
            s[i] = s[i].substring(0, 1) + str;


        }
        return s;
    }
}
//     int stringlength=s.length;
//for(int i=0;i<s.length;i++)
//{
//   String str=s[i];
//    for(int j=0;j<str.length();j++)
//    {
////        if(j==0)
////        {
////            continue;
////        }
////        else
////        {
//            if(str.charAt(j)=='a'|| str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u')
//            {
//
//                str.replace("str.charAt(j)", "" );
//            }
//
//        instruments[i] = instruments[i].replace("[aeiou]", "");
//       System.out.println("my string " +str);
//    }
//
// //  System.out.println("my string " +str);
//}
//
//return null;
//    }
//}

//
//
//        }
//