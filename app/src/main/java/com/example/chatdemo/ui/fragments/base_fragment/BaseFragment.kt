package com.example.chatdemo.ui.fragments.base_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.chatdemo.R

/**
 * @author : Mingaleev D
 * @data : 2/01/2023
 */

open class BaseFragment(val layout: Int) : Fragment() {

   private lateinit var mRootView: View

   override fun onCreateView(
      inflater: LayoutInflater,
      container: ViewGroup?,
      savedInstanceState: Bundle?
   ): View? {
      mRootView = inflater.inflate(layout, container, false)
      return mRootView

   }

   override fun onStart() {
      super.onStart()
   }
}