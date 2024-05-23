package com.example.parcelizedemo

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
@CommonParcelize
data class SomeData(
    @CommonTypeParceler<LocalDateTime, LocalDateTimeAsStringParceler> val date: LocalDateTimeAsString,
) : CommonParcelable