package com.example.chatdemo.ui.fragments

import android.view.Menu
import android.view.MenuInflater
import com.example.chatdemo.R
import com.example.chatdemo.ui.fragments.base_fragment.BaseFragment


class SettingFragment : BaseFragment(R.layout.fragment_setting) {

   override fun onResume() {
      super.onResume()
      setHasOptionsMenu(true)

   }

   override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
      activity?.menuInflater?.inflate(R.menu.settings_action_menu, menu)

   }

}