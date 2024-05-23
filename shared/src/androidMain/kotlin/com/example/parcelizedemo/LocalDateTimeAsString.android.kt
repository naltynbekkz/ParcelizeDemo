package com.example.parcelizedemo

import android.os.Parcel
import kotlinx.datetime.LocalDateTime

actual object LocalDateTimeAsStringParceler : CommonParceler<LocalDateTime> {
    override fun create(parcel: Parcel): LocalDateTime {
        return LocalDateTime.parse(parcel.readString()!!)
    }

    override fun LocalDateTime.write(parcel: Parcel, flags: Int) {
        parcel.writeString(this.toString())
    }
}