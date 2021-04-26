package com.example.test_kotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 마지막 EditText 완료버튼은 Login 함수 호출
        et_age.setOnEditorActionListener { v, actionId, event ->
            if(actionId == EditorInfo.IME_ACTION_SEND){
                Login(v)
                true
            }
            else false
        }
//        btn.setOnClickListener{
//            Toast.makeText(this, "토스트", Toast.LENGTH_SHORT).show()
//        }
    }

    fun Login(v : View) {
        // 키보드 숨기기
        var imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(v.windowToken, 0)

        // 입력정보 비교
        if(et_email.text.toString() == "reviewtalk@reviewtalk.com" && et_password.text.toString() == "1234" &&
            et_name.text.toString() == "아베링" && et_age.text.toString() == "25") {
            Toast.makeText(this, "로그인 성공!", Toast.LENGTH_SHORT).show()

            startActivity(Intent(this, JavaActivity::class.java))
        }

        else Toast.makeText(this, "로그인 실패!", Toast.LENGTH_SHORT).show()
    }

//    fun DDuck(v : View) {
//        tv.text = "뚝"
//    }

}