package org.example

fun solution(s: String): String {
    // 문자열이 비어 있는 경우 처리
    if (s.isBlank()) {
        return "다시 숫자를 입력해 주세요"
    }

    // 문자열을 공백을 기준으로 나누어 숫자로 변환
    val numbers = s.split(" ").mapNotNull { it.toIntOrNull() }

    // 변환된 리스트가 비어있는 경우 처리
    if (numbers.isEmpty()) {
        return "다시 숫자를 입력해 주세요"
    }

    // 최소값과 최대값을 찾기
    val minVal = numbers.minOrNull() ?: 0
    val maxVal = numbers.maxOrNull() ?: 0

    // 결과를 "(최소값) (최대값)" 형태의 문자열로 반환
    return "$minVal $maxVal"
}

fun main() {
    // 사용자 입력 받기
    println("숫자들을 공백으로 구분하여 입력하세요:")
    val input = readLine() ?: ""

    // solution 함수 호출 및 결과 출력
    val result = solution(input)
    println(result)
}