package eu.tutorials.kotlin_findamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

fun main(){
    Strings
    val myStr = "Hello World"
    var firstCharinStr = myStr[0]
    var lastCharinStr = myStr [myStr.length - 1]
    var myLength = myStr.length
    print("First Character $firstCharinStr and the length of myStr is ${myStr.length}")


    //print("Last Character" + lastCharInStr)

    // Arithmetic Operators ("+, -, * , /, %")

    var result = 5+7
    result %= 2
    print(result)
}