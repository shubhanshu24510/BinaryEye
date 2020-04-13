package de.markusfisch.android.binaryeye.app

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

fun Context.showSoftKeyboard() {
	(getSystemService(
		Context.INPUT_METHOD_SERVICE
	) as InputMethodManager).toggleSoftInput(
		InputMethodManager.SHOW_FORCED, 0
	)
}

fun Context.hideSoftKeyboard(view: View) {
	(getSystemService(
		Context.INPUT_METHOD_SERVICE
	) as InputMethodManager).hideSoftInputFromWindow(
		view.windowToken, 0
	)
}