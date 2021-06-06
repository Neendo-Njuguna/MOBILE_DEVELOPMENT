package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

 class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         val etFirstDigit = findViewById<EditText>(R.id.etFirstDigit)
         val etSecondDigit = findViewById<EditText>(R.id.etSecondDigit)
         val btnAdd = findViewById<Button>(R.id.btnAdd)
         val btnLess = findViewById<Button>(R.id.btnLess)
         val btnProduct = findViewById<Button>(R.id.btnProduct)
         val btnDivide = findViewById<Button>(R.id.btnDivide)
         val btnSolution = findViewById<Button>(R.id.btnSolution)


         btnAdd.setOnClickListener {
             if (etFirstDigit.text.toString().isEmpty() ) {
                 etFirstDigit.setError("Input First Digit")
             }
             else if(etSecondDigit.text.toString().isEmpty()){
                 etSecondDigit.setError("Input Second Digit")
             }
             else {
                 var firstDigit = etFirstDigit.text.toString().toInt()
                 var secondDigit = etSecondDigit.text.toString().toInt()
                 var solution = firstDigit + secondDigit
                 btnSolution.text = "Solution: $solution"
             }
             btnLess.setOnClickListener {
                 if (etFirstDigit.text.toString().isEmpty() ) {
                     etFirstDigit.setError("Input First Digit")
                 }
                 else if(etSecondDigit.text.toString().isEmpty()){
                     etSecondDigit.setError("Input Second Digit")
                 }
                  else {
                     var firstDigit = etFirstDigit.text.toString().toInt()
                     var secondDigit = etSecondDigit.text.toString().toInt()
                     var solution = firstDigit - secondDigit
                     btnSolution.text = "Solution: $solution"
                 }
                 btnProduct.setOnClickListener {
                     if (etFirstDigit.text.toString().isEmpty() ) {
                         etFirstDigit.setError("Input First Digit")
                     }
                     else if(etSecondDigit.text.toString().isEmpty()){
                         etSecondDigit.setError("Input Second Digit")
                     }
                     else {
                     }
                     var firstDigit = etFirstDigit.text.toString().toInt()
                     var secondDigit = etSecondDigit.text.toString().toInt()
                     var solution = firstDigit * secondDigit
                     btnSolution.text = "Solution: $solution"
                 }
                 btnDivide.setOnClickListener {
                     if (etFirstDigit.text.toString().isEmpty() ) {
                         etFirstDigit.setError("Input First Digit")
                     }
                     else if(etSecondDigit.text.toString().isEmpty()){
                         etSecondDigit.setError("Input Second Digit")
                     }
                     else {
                     }
                     var firstDigit = etFirstDigit.text.toString().toInt()
                     var secondDigit = etSecondDigit.text.toString().toInt()
                     var solution = firstDigit / secondDigit
                     btnSolution.text = "Solution: $solution"
                 }
             }
         }
     }
 }
