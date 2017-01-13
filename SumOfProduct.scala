/*
Write a program to sum of the digits of the product of numbers from 1 to n.
For example: For, n = 5
1*2*3*4*5 = 120
1+2+0 = 3 
*/

object SumOfProduct extends App{
val num = args(0).toInt
var prod = 1
for (i<- 1 to num)prod*=i //calculates product of numbers from 1 to num

def addDigits(n:Int):Int={ //calculates sum of digits of product obtained above
      if ((n/10) > 0) n%10+addDigits(n/10)
      else n
     }

println(s"Sum of the product of first $num digits = ${addDigits(prod)}")
}
