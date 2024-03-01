package com.brandon.ice1

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.util.Locale

class HomeScreen : AppCompatActivity() {
    private lateinit var btnEnglish : Button;
    private lateinit var btnAfrickaans : Button;
    private lateinit var btnFrench : Button;
    private lateinit var btnSpanish : Button;
    private lateinit var btnRussian : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        btnEnglish = findViewById(R.id.btnEnglish)
        btnAfrickaans = findViewById(R.id.btnAfrikaans)
        btnFrench = findViewById(R.id.btnFrench)
        btnSpanish = findViewById(R.id.btnSpanish)
        btnRussian = findViewById(R.id.btnRussian)


        btnEnglish.setOnClickListener{
            setLang("en")
        }
        btnAfrickaans.setOnClickListener{
            setLang("af")
        }
        btnFrench.setOnClickListener{
            setLang("fr")
        }
        btnSpanish.setOnClickListener{
            setLang("es")
        }
        btnRussian.setOnClickListener{
            setLang("ru")
        }


    }
    fun setLang(lang: String){
        val locale = Locale(lang)
        val config = Configuration(resources.configuration)
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)

        recreate()
    }

}