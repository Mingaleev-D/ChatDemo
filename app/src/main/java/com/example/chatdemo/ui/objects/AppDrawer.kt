package com.example.chatdemo.ui.objects

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.chatdemo.R
import com.example.chatdemo.ui.fragments.SettingFragment
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem

/**
 * @author : Mingaleev D
 * @data : 2/01/2023
 */

class AppDrawer(val mainActivity: AppCompatActivity, val toolBar: Toolbar) {

   private lateinit var mDrawer: Drawer
   private lateinit var mHeader: AccountHeader

   fun create() {
      createHeader()
      createDrawer()
   }

   private fun createDrawer() {
      mDrawer = DrawerBuilder()
         .withActivity(mainActivity)
         .withToolbar(toolBar)
         .withActionBarDrawerToggle(true)
         .withSelectedItem(-1)
         .withAccountHeader(mHeader)
         .addDrawerItems(
            PrimaryDrawerItem()
               .withIdentifier(100)
               .withIconTintingEnabled(true)
               .withName(R.string.to_create_a_group)
               .withSelectable(false)
               .withIcon(R.drawable.ic_menu_create_groups),
            PrimaryDrawerItem()
               .withIdentifier(101)
               .withIconTintingEnabled(true)
               .withName(R.string.to_create_a_secret_chat)
               .withSelectable(false)
               .withIcon(R.drawable.ic_menu_secret_chat),
            PrimaryDrawerItem()
               .withIdentifier(102)
               .withIconTintingEnabled(true)
               .withName(R.string.create_a_channel)
               .withSelectable(false)
               .withIcon(R.drawable.ic_menu_create_channel),
            PrimaryDrawerItem()
               .withIdentifier(103)
               .withIconTintingEnabled(true)
               .withName(R.string.contacts)
               .withSelectable(false)
               .withIcon(R.drawable.ic_menu_contacts),
            PrimaryDrawerItem()
               .withIdentifier(104)
               .withIconTintingEnabled(true)
               .withName(R.string.calls)
               .withSelectable(false)
               .withIcon(R.drawable.ic_menu_phone),
            PrimaryDrawerItem()
               .withIdentifier(105)
               .withIconTintingEnabled(true)
               .withName(R.string.favorites)
               .withSelectable(false)
               .withIcon(R.drawable.ic_menu_favorites),
            PrimaryDrawerItem()
               .withIdentifier(106)
               .withIconTintingEnabled(true)
               .withName(R.string.settings)
               .withSelectable(false)
               .withIcon(R.drawable.ic_menu_settings),
            DividerDrawerItem(),
            PrimaryDrawerItem()
               .withIdentifier(107)
               .withIconTintingEnabled(true)
               .withName(R.string.invite_friends)
               .withSelectable(false)
               .withIcon(R.drawable.ic_menu_invate),
            PrimaryDrawerItem()
               .withIdentifier(108)
               .withIconTintingEnabled(true)
               .withName(R.string.questions_about_telegram)
               .withSelectable(false)
               .withIcon(R.drawable.ic_menu_help),
         )
         .withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener {
            override fun onItemClick(
               view: View?,
               position: Int,
               drawerItem: IDrawerItem<*>
            ): Boolean {
               when (position) {
                  7 ->
                     mainActivity.supportFragmentManager.beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.dataContainer, SettingFragment()).commit()
               }
               return false
            }
         })
         .build()
   }

   private fun createHeader() {
      mHeader = AccountHeaderBuilder()
         .withActivity(mainActivity)
         .withHeaderBackground(R.drawable.header)
         .addProfiles(
            ProfileDrawerItem()
               .withName(R.string.test_name)
               .withEmail(R.string.test_Email)

         ).build()
   }
}