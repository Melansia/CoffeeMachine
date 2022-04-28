package com.example.coffeemachine

fun main(){
    CoffeeMachine().start()
}

class CoffeeMachine {
    private var WATER = 400
    private var MILK = 540
    private var COFFEEBEANS = 120
    private var DISPOSABLECUPS = 9
    private var MONEY = 550

    fun start() {
        while (true) {
            print("Write action (buy, fill, take, remaining, exit): ")
            when (readln()) {
                "buy" -> buy()
                "fill" -> fill()
                "take" -> take()
                "remaining" -> stats()
                "exit" -> break
            }
        }
    }


    private fun buy() {
        println()
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
        when (readln()) {
            "1" -> espresso()
            "2" -> latte()
            "3" -> cappuccino()
            "back" -> return
        }
    }

    private fun fill() {
        println()
        print("Write how many ml of water do you want to add: ")
        val waterToAdd = readln().toInt()
        print("Write how many ml of milk do you want to add: ")
        val milkToADD = readln().toInt()
        print("Write how many grams of coffee beans do you want to add: ")
        val coffeeBeansToAdd = readln().toInt()
        print("Write how many disposable cups of coffee do you want to add: ")
        val disposableCupsToAdd = readln().toInt()

        WATER += waterToAdd
        MILK += milkToADD
        COFFEEBEANS += coffeeBeansToAdd
        DISPOSABLECUPS += disposableCupsToAdd

        println()
    }

    private fun take() {
        println("\nI gave you $$MONEY")
        MONEY -= MONEY
    }

    private fun stats() {
        println()
        println(
            """The coffee machine has:
        |$WATER ml of water
        |$MILK ml of milk
        |$COFFEEBEANS g of coffee beans
        |$DISPOSABLECUPS disposable cups
        |$$MONEY of money
    """.trimMargin()
        )
        println()
    }

    private fun espresso() {
        val waterNeed = 250
        val coffeeNeed = 16
        val cupNeed = 1
        val cost = 4

        when {
            WATER < waterNeed -> println("Sorry, not enough water!")
            COFFEEBEANS < coffeeNeed -> println("Sorry, not enough Coffee!")
            DISPOSABLECUPS < cupNeed -> println("Sorry, not enough Cups!")
            else -> {
                println("I have enough resources, making you a coffee!")
                WATER -= waterNeed
                COFFEEBEANS -= coffeeNeed
                DISPOSABLECUPS -= cupNeed
                MONEY += cost
            }
        }
        println()
    }

    private fun latte() {
        val waterNeed = 350
        val milkNeed = 75
        val coffeeNeed = 20
        val cupNeed = 1
        val cost = 7

        when {
            WATER < waterNeed -> println("Sorry, not enough water!")
            MILK < milkNeed -> println("Sorry, not enough milk!")
            COFFEEBEANS < coffeeNeed -> println("Sorry, not enough Coffee!")
            DISPOSABLECUPS < cupNeed -> println("Sorry, not enough Cups!")
            else -> {
                println("I have enough resources, making you a coffee!")
                WATER -= waterNeed
                MILK -= milkNeed
                COFFEEBEANS -= coffeeNeed
                DISPOSABLECUPS -= cupNeed
                MONEY += cost
            }
        }
        println()
    }

    private fun cappuccino() {
        val waterNeed = 200
        val milkNeed = 100
        val coffeeNeed = 12
        val cupNeed = 1
        val cost = 6

        when {
            WATER < waterNeed -> println("Sorry, not enough water!")
            MILK < milkNeed -> println("Sorry, not enough milk!")
            COFFEEBEANS < coffeeNeed -> println("Sorry, not enough Coffee!")
            DISPOSABLECUPS < cupNeed -> println("Sorry, not enough Cups!")
            else -> {
                println("I have enough resources, making you a coffee!")
                WATER -= waterNeed
                MILK -= milkNeed
                COFFEEBEANS -= coffeeNeed
                DISPOSABLECUPS -= cupNeed
                MONEY += cost
            }
        }
        println()
    }
}