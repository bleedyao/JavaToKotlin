package com.example.core

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.util.*

abstract class BaseViewHolder(itemView: View) : ViewHolder(itemView) {
    @SuppressLint("UseSparseArrays")
    private val viewHashMap: MutableMap<Int, View?> = HashMap()
    protected fun <T : View> getView(@IdRes id: Int): T {
        return (viewHashMap[id] as T).apply {
            viewHashMap[id] = itemView.findViewById(id)

        }
    }

    protected fun setText(@IdRes id: Int, text: String?) {
        (getView<View>(id) as TextView).text = text
    }
}