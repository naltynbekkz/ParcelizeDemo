package com.example.parcelizedemo

expect interface CommonParcelable

@Suppress("unused")
@Retention(AnnotationRetention.SOURCE)
@Repeatable
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY)
expect annotation class CommonTypeParceler<T, P : CommonParceler<in T>>()

expect interface CommonParceler<T>