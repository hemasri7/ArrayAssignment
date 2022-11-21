package arrays

import java.util.Scanner

fun main(args: Array<String>) {
    var scan=Scanner(System.`in`)
    print("Enter the size of an array :")
    var arraySize=scan.nextInt()
    var array=Array(arraySize,{0})
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
    var max=array[0]
    var slar=array[1]
    for(i in 0..arraySize-1)
    {
        if(array[i]>max)
        {
            max=slar
            max=array[i]
        }
        else if(array[i]>slar && array[i]!=max)
        {
            slar=array[i]
        }
    }
    print("The second largest number is : $slar")
}