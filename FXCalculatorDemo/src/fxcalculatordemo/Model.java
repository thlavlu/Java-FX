/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fxcalculatordemo;

public class Model {

    public float calculate(long number1, long number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;

            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) {
                    return 0;
                } else {
                    return number1 / number2;
                }
            default:
                return 0;
        }
    }
}
