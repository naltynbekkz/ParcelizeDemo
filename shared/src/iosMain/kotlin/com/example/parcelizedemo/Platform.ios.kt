package com.example.parcelizedemo

actual interface CommonParcelable

@Suppress("unused")
@Retention(AnnotationRetention.SOURCE)
@Repeatable
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY)
actual annotation class CommonTypeParceler<T, P : CommonParceler<in T>>

actual interface CommonParceler<T>