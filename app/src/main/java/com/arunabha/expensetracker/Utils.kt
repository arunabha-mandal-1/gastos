package com.arunabha.expensetracker

import java.text.SimpleDateFormat
import java.util.Locale

object Utils {
    fun formatDateToHumanReadableForm(dateInMillis: Long): String {
        val dateFormatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        return dateFormatter.format(dateInMillis)
    }
}