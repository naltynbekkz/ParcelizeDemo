package com.example.parcelizedemo

actual typealias CommonParcelable = android.os.Parcelable
actual typealias CommonParceler<T> = kotlinx.parcelize.Parceler<T>
actual typealias CommonTypeParceler<T,P> = kotlinx.parcelize.TypeParceler<T, P>
