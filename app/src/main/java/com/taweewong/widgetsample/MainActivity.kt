package com.taweewong.widgetsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: Find the way to update at midnight
//        val mSrvcIntent = Intent(applicationContext, MyWidgetProvider::class.java)
//        val mSrvcPendingingIntent = PendingIntent.getService(applicationContext,0, mSrvcIntent, PendingIntent.FLAG_UPDATE_CURRENT)
//        val mAlarmManager = getSystemService(android.content.Context.ALARM_SERVICE) as AlarmManager
//        mAlarmManager.set(AlarmManager.RTC_WAKEUP, 600000, mSrvcPendingingIntent)
    }
}
