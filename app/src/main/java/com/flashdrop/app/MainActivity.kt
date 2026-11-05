package com.flashdrop.app

import android.app.Activity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.graphics.Color
import android.view.Gravity

class MainActivity : Activity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  val layout = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; gravity = Gravity.CENTER; setPadding(48,48,48,48) }
  val title = TextView(this).apply { text = "⚡ FlashDrop"; textSize = 32f; setTextColor(Color.rgb(37,99,235)); gravity = Gravity.CENTER }
  val subtitle = TextView(this).apply { text = "\nنقل الملفات بسرعة وخصوصية\n\nيتم تطوير الاتصال المباشر بين الأجهزة في الإصدار القادم."; textSize = 18f; gravity = Gravity.CENTER }
  layout.addView(title); layout.addView(subtitle); setContentView(layout)
 }
}
