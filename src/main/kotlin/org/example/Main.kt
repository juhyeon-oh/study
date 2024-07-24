package org.example // 패키지 이름 수정

fun main() {
    println("숫자를 입력하세요 (1~9):")
    val input = readLine()?.toIntOrNull()  // 사용자 입력을 받아서 정수로 변환, 실패하면 null

    if (input == null) {
        println("잘못된 입력입니다. 숫자를 입력하세요.")
        return
    }

    if (input in 1..9) {
        println("구구단 $input 단:")
        for (i in 1..9) {
            println("$input x $i = ${input * i}")  // 이제 input은 null이 아니므로 안전하게 연산 가능
        }
    } else {
        println("잘못된 입력입니다. 1부터 9 사이의 숫자를 입력하세요.")
    }
}