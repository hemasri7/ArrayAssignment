package arrays

import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    print("Enter the size of array :")
    var arraySize = scan.nextInt()
    var array = Array(5, { 0 })
    for (i in 0..(arraySize - 1)) {
        array.set(i, scan.nextInt())
    }
    println("Array elements :")
    for (i in 0..(arraySize - 1)) {
        print("${array[i]} ")
    }
    println()
    for (i in 0..(arraySize - 1)) {
        for (j in 1..(arraySize - 1)) {
            if (array[i] < array[j]) {
                var temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
    }
    print("The smallest element of the array is : ${array[0]}")
}
