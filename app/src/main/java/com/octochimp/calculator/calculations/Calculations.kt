package com.octochimp.calculator.calculations

class Calculations {

    fun calculate(operator: String, firstLine: Double, secondLine: Double) : String{
        var answer:Double = 0.0

        when(operator){
            "+" -> {
                answer = firstLine+secondLine
            }
            "-" ->{
                answer = firstLine-secondLine
            }
            "/" ->{
                answer = firstLine/secondLine
            }
            "*" ->{
                answer = firstLine*secondLine
            }

        }
        return answer.toString()

    }
}