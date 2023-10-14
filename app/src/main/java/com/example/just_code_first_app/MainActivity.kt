package com.example.just_code_first_app

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.just_code_first_app.ui.theme.Just_code_first_appTheme

class MainActivity : ComponentActivity() {
    lateinit var email_edit: EditText
    lateinit var password_edit: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email_edit = super.findViewById(R.id.email_edit)
        password_edit = super.findViewById(R.id.password_edit)


        email_edit.onFocusChangeListener = View.OnFocusChangeListener{_, hasFocus ->
            if(hasFocus){
                email_edit.setBackgroundResource(R.drawable.edittext_border_focus)
            }else{
                email_edit.setBackgroundResource(R.drawable.edittext_border)
            }
        }

        password_edit.onFocusChangeListener = View.OnFocusChangeListener{_, hasFocus ->
            if(hasFocus){
                password_edit.setBackgroundResource(R.drawable.edittext_border_focus)
            }else{
                password_edit.setBackgroundResource(R.drawable.edittext_border)
            }
        }

    }
}