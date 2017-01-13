/*
Write a program using string interpolation and a list.
For example:  if the list is List(10,20,30,40) output should be
0 = 10
1 = 20
2 = 30
*/
object StrInterpolation extends App{
val myList = List(10,20,30) //List of items
for(i<-myList.indices) println(s"$i = ${myList(i)}") //Printing using string interpolation
}

