package com.example.chatdemo.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.chatdemo.R
import com.example.chatdemo.databinding.ActivityMainBinding
import com.example.chatdemo.ui.fragments.ChatsFragment
import com.example.chatdemo.ui.objects.AppDrawer

class MainActivity : AppCompatActivity() {

   private val binding by lazy {
      ActivityMainBinding.inflate(layoutInflater)
   }

   private lateinit var mToolbar: Toolbar
   private lateinit var mAppDrawer: AppDrawer

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(binding.root)
   }

   override fun onStart() {
      super.onStart()
      initFields()
      initFunct()
   }

   private fun initFunct() {
      setSupportActionBar(mToolbar)
      mAppDrawer.create()
      supportFragmentManager.beginTransaction()
         .replace(R.id.dataContainer, ChatsFragment()).commit()
   }


   private fun initFields() {
      mToolbar = binding.mainToolbar
      mAppDrawer = AppDrawer(this, mToolbar)
   }
}