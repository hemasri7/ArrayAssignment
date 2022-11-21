package arrays

import java.util.Scanner

fun main(args: Array<String>) {
    var scan=Scanner(System.`in`)
    print("Enter the size of an array :")
    var arraySize=scan.nextInt()
    var array= Array(arraySize,{0})
    for(i in 0..arraySize-1)
    {
        array.set(i,scan.nextInt())
    }
    println("Array elements are :")
    for(i in 0..arraySize-1)
    {
        print("${array[i]} ")
    }
    println()
    var sum=0
    for(i in 0..arraySize-1)
    {
        sum+=array[i]
    }
    print("The sum of array elements : $sum")
}