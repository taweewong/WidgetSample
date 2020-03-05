package com.taweewong.widgetsample

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews

class MyWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)
        for (element in appWidgetIds) {
            val views = RemoteViews(context.packageName, R.layout.widget_sample_layout).apply {
                setTextViewText(R.id.widget_small_text_view, "ป้าจะมาวันที่ ${WaterShopUtil.getNextRoundOfWaterShopAsFormat()}")
                setTextViewText(R.id.widget_large_text_view, "ป้าจะมาในอีก ${WaterShopUtil.findRangeToNextRound()} วัน!")
            }
            appWidgetManager.updateAppWidget(element, views)
        }
    }
}