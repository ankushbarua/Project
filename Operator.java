package com.ankush.javascratchpad;
/* & 1 1 = 1
 * & 1 0 = 0
 * | 1 1 = 1
 * | 1 0 = 1
 * | 0 0 = 0
 */

public class Operator 
{
       public static void main(String args[])
       {
       int a = 25;  //11001
       int b = 15; // 11111
       int c = a & b ; 
       int d = a|b;
       System.out.println(c+" and "+d);
       }
}
