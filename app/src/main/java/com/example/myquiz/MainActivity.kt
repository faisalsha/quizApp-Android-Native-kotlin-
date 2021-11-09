package com.example.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val btn_start:Button=findViewById(R.id.btn_start)
        val edit_btn:EditText=findViewById(R.id.edit_btn)
        btn_start.setOnClickListener {

            if(edit_btn.text.isEmpty()){
                Toast.makeText(this,"PLease enter your name",Toast.LENGTH_LONG).show()
            }else{
                //navigate the user to questions screen

                val intent=Intent(this,QuizQuestions::class.java);
                intent.putExtra(Constants.USER_NAME,edit_btn.text.toString())
                startActivity(intent)
                finish();


            }



        }
    }
}