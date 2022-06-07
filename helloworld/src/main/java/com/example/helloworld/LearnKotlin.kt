package com.example.helloworld

import kotlin.math.max;

fun main() {
    println("hello kotlin" + max1(1, 6))

    println("andy is " + getScore11("andy1111"))

    checkNumber(1)

    forin()

    val person = Person("andy",55)
    person.eat()

    val student = Student()
    val student1 = Student("illa",1)
    val student2 = Student(100,1,"illa",1)
}

fun max(i: Int, j: Int): Int {
    return max(i, j)
}

fun max1(i: Int,j: Int) = max44(i, j)


fun max22(i: Int,j: Int): Int{
    val value = if (i > j){
        i
    }else{
        j
    }
    return value
}


fun max33(i: Int,j: Int) = if (i > j){
        i
    }else{
        j
    }


fun max44(i: Int,j: Int) = if (i > j) i else j

fun getScore(name : String) = when(name){
    //匹配值 -> { 执行逻辑 }
    //当你的执行逻辑只有一行代码时，{ }可以省略
    "tom" -> 88
    "andy" -> 89
    else -> 0
}


fun checkNumber(num : Number) = when(num){
    //匹配值 -> { 执行逻辑 }
    //当你的执行逻辑只有一行代码时，{ }可以省略
    is Int -> println("Number is int")
    is Double -> println("Number is double")
    else -> println("Number is not support")
}

fun getScore11(name: String) = when{
    name == "tom" -> 86
    name.startsWith("and") ->86
    else -> 0
}

fun forin(){
    for (i in 1..10 step 3){
        println(i)
    }
    for (j in 1 until 10 ){
        println(j)
    }
    for (j in 20 downTo 15  step 2){
        println(j)
    }
}


