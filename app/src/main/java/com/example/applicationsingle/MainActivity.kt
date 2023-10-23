package com.example.applicationsingle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.mybutton)
        button.setOnClickListener(){

            val intent = Intent(applicationContext, imageView::class.java)
            startActivity(intent)

        }



    }
}



/*
   //  Token Code---------------------------------------------------

        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
             //       textview.text = "Fetching FCM registration token failed"
                return@OnCompleteListener
            }

            // fetching the token
            val token = task.result

            Log.d("fmtoken", token)

//                textview.text = "Token saved successfully!"

            // toast to show message
            Toast.makeText(
                baseContext,
                "Firebase Generated Successfully and saved to realtime database",
                Toast.LENGTH_SHORT
            ).show()
        })
    }
}

*/

/*
        //ripple Button code--------------------------------------------------

        button = findViewById<Button>(R.id.mybutton)

        button.setOnClickListener {
            Toast.makeText(this@MainActivity, "click", Toast.LENGTH_SHORT).show()

            val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            button.startAnimation(animationFadeIn)
        }
    }
}


*/