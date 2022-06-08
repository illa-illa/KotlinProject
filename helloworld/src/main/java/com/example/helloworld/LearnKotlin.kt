package com.example.helloworld

import java.util.*
import kotlin.collections.HashMap
import kotlin.math.max;

fun main() {
    println("hello kotlin" + max1(1, 6))

    println("andy is " + getScore11("andy1111"))

    checkNumber(1)

    forin()

    val person = Person("andy", 55)
    person.eat()

    val student = Student()
    val student1 = Student("illa", 1)
    val student2 = Student(100, 1, "illa", 1)


    testCellPhone()

    singleton.singletonTest()

    testList()

    testMap()

    //调用java 接口简写
//    Thread(object : Runnable {
//        override fun run() {
//            println("Thread is running")
//        }
//    }).start()

//    Thread{
//        println("dosomething")
//    }.start()


    testNullPointer(null)

    testLeftOrRightIsNull(null,"bbbbbbbb")

}

fun max(i: Int, j: Int): Int {
    return max(i, j)
}

fun max1(i: Int, j: Int) = max44(i, j)


fun max22(i: Int, j: Int): Int {
    val value = if (i > j) {
        i
    } else {
        j
    }
    return value
}


fun max33(i: Int, j: Int) = if (i > j) {
    i
} else {
    j
}


fun max44(i: Int, j: Int) = if (i > j) i else j

fun getScore(name: String) = when (name) {
    //匹配值 -> { 执行逻辑 }
    //当你的执行逻辑只有一行代码时，{ }可以省略
    "tom" -> 88
    "andy" -> 89
    else -> 0
}


fun checkNumber(num: Number) = when (num) {
    //匹配值 -> { 执行逻辑 }
    //当你的执行逻辑只有一行代码时，{ }可以省略
    is Int -> println("Number is int")
    is Double -> println("Number is double")
    else -> println("Number is not support")
}

fun getScore11(name: String) = when {
    name == "tom" -> 86
    name.startsWith("and") -> 86
    else -> 0
}

fun forin() {
    for (i in 1..10 step 3) {
        println(i)
    }
    for (j in 1 until 10) {
        println(j)
    }
    for (j in 20 downTo 15 step 2) {
        println(j)
    }
}

fun testCellPhone() {
    val cellphone = Cellphone("iphone", 5999)
    val cellphone1 = Cellphone("iphone", 5999)
    println(cellphone)
    println("cellphone equals cellphonen1 == " + (cellphone == cellphone1))
}

fun testList() {
    //listof 是创建不可变的list
    val list = listOf("apple", "banana", "kiwi", "orange")
    for (fruit in list)
        println(fruit)

    //mutablelistof 创建可变list
    val mutableList = mutableListOf("watermelon")
    mutableList.add("blueberry")
    for (fruit in mutableList)
        println(fruit)

    //找出最长的单词
    val lambda = { fruit: String -> fruit.length }
    val maxLengthFruit = list.maxByOrNull(lambda)
    //可以省略成 val maxLengthFruit = list.maxByOrNull {it.length}
    println("maxLengthFruit is " + maxLengthFruit)

    //单词都转换成大写
    val listUpperCase = list.map { it.uppercase(Locale.getDefault()) }
    for (fruit in listUpperCase)
        println(fruit)

    //filter 过滤集合的数据,只保留符合lambda条件的元素
    val filterList = list.filter { it.length < 5 }
        .map { it.uppercase(Locale.getDefault()) }
    for (fruit in filterList)
        println("filterList == " + fruit)

    //any函数就表示集合中是否存在5个字母以内的单词，而all函数就表示集合中是否所有单词都在5个字母以内。
    val anyResult = list.any { it.length <= 5 }
    println("anyResult = " + anyResult)
    val allResult = list.all { it.length <= 5 }
    println("allResult = " + allResult)
}

fun testMap() {
    val map = HashMap<String, Int>()
    map["apple"] = 1
    map["orange"] = 2
    map["blueberry"] = 3
    for ((fruit, number) in map)
        println("fruit " + fruit + "number is " + number)
    //<>里面的可以省略
    val map1 = mapOf<String, Int>("watermelon" to 1, "kiwi" to 88)
    for ((fruit, number) in map1) {
        println("fruit " + fruit + " number is " + number)
        println("fruit =$fruit number is $number")
    }


}

fun testNullPointer(student: Student?) {
    student?.eat()
    student?.study()

//用let可以避免重复使用？判空
    student?.let {
        it.eat()
        it.study()
    }
}

fun testLeftOrRightIsNull(a: String?, b: String?) {
    val c = a ?: b
    println(c)
}



