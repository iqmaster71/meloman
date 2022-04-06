package ru.netology

fun main() {
    val sumLast = 11_000
    val price = 2000
    val meloman = true
    var sum = 0
    if (1001 <= sumLast && sumLast <= 10_000 ) {
        sum = price - 100
        if (meloman){
            val  totalSum = if (meloman) sum * 99/100 else sum
            println("Применение скидки 100 рублей - $sum")
            println("Применение скидки постоянного покупателя 1% - $totalSum")
        } else {
            println("Применение скидки 100 рублей - $sum")
        }
    } else if(sumLast >= 10_001){
        if (meloman){
            sum = price * 95 /100
            val totalSum = sum * 99/100
            println("Применение скидки 5% - $sum")
            println("Применение скидки постоянного покупателя 1% - $totalSum")
        } else {
            println("Применение скидки 5% - $sum")
        }

    } else{
        if (meloman){
            sum = price
            val totalSum = sum * 99/100
            println("Сумма без скидки $sum")
            println("Сумма после применения скидки $totalSum")

        } else {
            sum = price
            sum = price
            println("Сумма без скидки $sum")
        }

    }
}