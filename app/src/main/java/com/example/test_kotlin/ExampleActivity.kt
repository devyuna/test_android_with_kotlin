package com.example.test_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ExampleActivity : AppCompatActivity() {
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

//        println(describe(1)) // One
//        println(describe("Hello")) // Greeting
//        println(describe(5L)) // Long
//        println(describe(4f)) // Not a string
//        println(describe("뚝")) // Unknown

//        val x = 10
//        val y = 9
//        if(x in 1...y+1) {
//            println("범위 안")
//        }
//
//        if(x >= 1 && x <= y+1) {
//            println("범위 안")
//        }


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

//        println(describe(1)) // One
//        println(describe("Hello")) // Greeting
//        println(describe(5L)) // Long
//        println(describe(4f)) // Not a string
//        println(describe("뚝")) // Unknown

//        [if문에서 범위 설정]
//        val x = 10
//        val y = 9
//        if(x in 1...y+1) {
//            println("범위 안")
//        }
//
//        if(x >= 1 && x <= y+1) {
//            println("범위 안")
//        }

//        val list = listOf("a", "b", "c")
////        list[0]
//        if (-1 !in 0..list.lastIndex) { // -1 이 0과 리스트의 마지막 인덱스까지 (0~2까지) 있는지 없는지
//            println("-1은 범위 안에 없다")
//        }
//        if (list.size !in list.indices) { // list.indices : 0,1,2 리턴 / 리스트 사이즈는 3인데 0~2 사이에 없음
//            println("리스트 인덱스 넘어갔다")
//        }

//        [for문에서 범위 설정]
//        for (x in 1..5) { // x가 1~5를 반복 1,2,3,4,5 출력
//            println(x)
//        }

//        for (x in 1..10 step 2) { // x 가 1~10 범위 안에 있지만 2씩 띄어서 1,3,5,7,9 출력
//            println(x)
//        }
//        println("띄고")
//        for (x in 9 downTo 0 step 3) { // x 가 9 에서 0으로 내려감 9,6,3,0 출력
//            println(x)
//        }

//        val items = setOf("apple", "banana", "kiwifruit")
//        when {
//            "orange" in items -> println("juicy")
//            "apple" in items -> println("apple is fine too")
//        }

//        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
//        fruits
//            .filter { it.startsWith("a")}
//            .sortedBy { it }
//            .map { it.toUpperCase() }
//            .forEach { println(it) }
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

//    fun describe(obj: Any): String =
//        when (obj) {
//            1           -> "one"
//            "Hello"     -> "Greeting"
//            is Long     -> "Long"
//            !is String  -> "Not a string"
//            else        -> "Unknown"
//        }
}