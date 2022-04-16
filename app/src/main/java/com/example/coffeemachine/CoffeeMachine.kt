package com.example.coffeemachine

const val WATERPERCUP = 200 //ml
const val MILKPERCUP = 50 //ml
const val COFFEEBEANSPERCUP = 15 //g

fun main() {

    estimateServings()

}


fun estimateServings() {
    print("Write how many ml of water the coffee machine has: ")
    val waterHas = readln().toInt() / WATERPERCUP
    print("Write how many ml of milk the coffee machine has: ")
    val milkHas = readln().toInt() / MILKPERCUP
    print("Write how many grams of coffee beans the coffee machine has: ")
    val coffeeHas = readln().toInt() / COFFEEBEANSPERCUP
    print("Write how many cups of coffee you will need: ")
    val cupsNeed = readln().toInt()

    val cupsWeCanMake = listOf(waterHas, milkHas, coffeeHas).minOf { it }

    when {
        cupsWeCanMake == cupsNeed -> println("Yes, I can make that amount of coffee")
        cupsWeCanMake > cupsNeed -> println("Yes, I can make that amount of coffee (and even ${cupsWeCanMake - cupsNeed} more than that)")
        cupsWeCanMake < cupsNeed -> println("No, I can make only $cupsWeCanMake cups of coffee")
    }
}

fun ingredientCalculator() {
    print("Write how many cups of coffee you will need: ")
    val cups = readln().toInt()
    val water = WATERPERCUP * cups
    val milk = MILKPERCUP * cups
    val coffee = COFFEEBEANSPERCUP * cups

    println(
        """For $cups cups of coffee you will need:
$water ml of water
$milk ml of milk
$coffee g of coffee beans""".trimIndent()
    )

}

fun coffeProccess() {
    println(
        """Starting to make a coffee
Grinding coffee beans
Boiling water
Mixing boiled water with crushed coffee beans
Pouring coffee into the cup
Pouring some milk into the cup
Coffee is ready!""".trimIndent()
    )
}