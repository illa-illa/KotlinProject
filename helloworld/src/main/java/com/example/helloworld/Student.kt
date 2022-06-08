package com.example.helloworld

class Student(val sno: Int, val grade: Int, name: String, age: Int) : Person(name, age) {
    init {//主构造函数添加逻辑
        print("sno = " + sno + " grrade = " + grade)
    }

    constructor(name: String, age: Int) : this(0, 0, name, age) {

    }

    constructor() : this("", 0) {

    }

    fun study(){
        println("study")
    }
}