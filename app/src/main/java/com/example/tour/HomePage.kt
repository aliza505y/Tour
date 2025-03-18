package com.example.tour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePage : AppCompatActivity() {

    private lateinit var navigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val navigationView=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        replaceFragment(Home_Fragment())

        navigationView.setOnItemSelectedListener { menuItem->
            when (menuItem.itemId){
                R.id.home->{
                  replaceFragment(Home_Fragment())
                    true
                }
                R.id.saved->{
                    replaceFragment(Saved_Fragment())
                    true
                }
                R.id.notification->{
                    replaceFragment(Notification_Fragment())
                    true
                }
                R.id.chat->{
                    replaceFragment(Chat_Fragment())
                    true
                }

                else -> {
                    false
                }
            }
        }

    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.framelayout,fragment).commit()
    }

}