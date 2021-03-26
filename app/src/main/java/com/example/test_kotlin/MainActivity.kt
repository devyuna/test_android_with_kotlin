package com.example.test_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        출력하기
//        println("안녕하세요")
//        println("아벨이에요")

//        1. 정수 합 출력하기
//        println(sum(1, 2));

//        2. 실수 합 출력하기
//        println(sum(1, 2.0f));

//        3. 합 출력하기 응용
//        sum(3,4)

//        val로 지정된 불변 타입 변수는 초기에 값이 할당되면 나중에 값 변경 불가능 (초기화 값을 넣어주려면 val a: Int = 1)
//        var로 지정된 가변 타입 변수는 초기화 후 값 변경 가능
//        val a: Int
//        var b: Int (= var b = 2, 초기화를 해줬다면 다음과 같이 사용 가능하다)
//        a = 1 (O)
//        a = 2 (X)
//        b = 1 (O)
//        b = 2 (O)
//        전역변수로 사용시 초기화 해야한다

//        val str = "코로나 조심하세요"
////        val str2 = str.replace("조심하세요", "이겨내요")
//        val str2 = "${str.replace("조심하세요", "이겨내요")}"
//        println(str2)

//        maxOf(3, 4)

//        "1"
//        println(parseInt("100")) // 100
//        println(parseInt("무엇")) // null 반환

//        println(getStringLength("하이 헬로우 안녕 ?!")) // 12

//        배열 출력
//        val items = listOf("apple", "banana", "kiwifruit")
//        for(item in items){
//            println(item)
//        }

//        배열과 인덱스값 출력
//        val items = listOf("apple", "banana", "kiwifruit")
//        for(index in items.indices){
//            println("인덱스 : $index, 값 : ${items[index]}")
//        }

//        배열의 길이만큼 배열과 인덱스값 출력
//        val items = listOf("사과", "바나나", "키위")
//        var index = 0
//        while(index < items.size){
//            println("item at $index is $items[index]}")
//            index++
//        }

        println(describe(1)) // One
        println(describe("Hello")) // Greeting
        println(describe(5L)) // Long
        println(describe(4f)) // Not a string
        println(describe("뚝")) // Unknown
        

    }

//    1. 정수 합 출력하는 함수
//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }

//    1번을 2번과 같이 짧게 사용할 수 있다

//    2. 정수 합 출력하는 함수
//    fun sum(a: Int, b: Int) = a + b
//    3. 실수 합 출력하는 함수
//    fun sum(a: Int, b: Float) = a + b

//    3. 합 출력하는 함수 응용
//    fun sum(a: Int, b: Int) {
//        println("$a 과 $b 의 합은 ${a+b}") // 7
//    }

//    fun maxOf(a: Int, b: Int): Int {
//        if (a > b) return a
//        else return b
//    }

//    fun maxOf(a: Int, b: Int) = if(a > b) a else b

//    fun parseInt(str: String): Int? { // ?  : 반환 형식에 null 이 들어갈 수 있다
//        var myNum : Int? = null
//
//        try { myNum = str.toInt() }
//        catch (nfe : NumberFormatException) { return null }
//
//        return myNum
//    }

//    fun getStringLength(obj: Any): Int? {s
//        if(obj is String) {
//            return obj.length
//        }
//        return null
//    }

    fun describe(obj: Any): String =
        when (obj) {
            1           -> "one"
            "Hello"     -> "Greeting"
            is Long     -> "Long"
            !is String  -> "Not a string"
            else        -> "Unknown"
        }
}