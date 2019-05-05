package com.gindoc.arcseekbar

import android.util.Log


typealias Supplier<T> = () -> T

inline fun log(supplier: Supplier<String>) = logd(supplier)

inline fun logd(supplier: Supplier<String>) = Log.d("logger", supplier())

inline fun logi(supplier: Supplier<String>) = Log.i("logger", supplier())

inline fun logw(supplier: Supplier<String>) = Log.w("logger", supplier())

inline fun loge(supplier: Supplier<String>) = Log.e("logger", supplier())