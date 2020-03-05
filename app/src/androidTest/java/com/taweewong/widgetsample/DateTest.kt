package com.taweewong.widgetsample

import android.util.Log
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.threeten.bp.LocalDateTime

@RunWith(AndroidJUnit4::class)
class DateTest {
    @Test
    fun test() {
        Log.w("TEST:", LocalDateTime.now().dayOfWeek.toString())
        Log.w("TEST:", LocalDateTime.now().dayOfWeek.name)
    }
}