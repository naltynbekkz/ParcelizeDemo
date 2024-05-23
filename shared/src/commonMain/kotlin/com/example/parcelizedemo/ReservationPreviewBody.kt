package com.example.parcelizedemo

import kotlinx.serialization.Serializable

@Serializable
@CommonParcelize
data class SomeData(
    @LocalDateTimeAsStringTypeParceler val date: LocalDateTimeAsString,
) : CommonParcelable