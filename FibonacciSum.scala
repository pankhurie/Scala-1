/*Write  a program to get the nth Fibonacci number.
For example: Fibonacci series (0,1,1,2,3,5,8.....)
if n is 3 then it should return 2
if n is 4 then it should return 3*/

object FibonacciSum extends App{
val n=args(0).toInt //Value of n

def fibonacci(n: Int): Int= { //Recursive function to retrieve nth fibonacci number
      if(n==0)
      n
      else if(n==1)
      n
      else fibonacci(n-2)+fibonacci(n-1)
      }
val sum=fibonacci(n) //Value at n

println(sum) 
}
