package ir.barok.poet_list.data.model

data class PoetDto(
    val id: Int,
    val name: String,
    val description: String?,
    val fullUrl: String,
    val rootCatId: Int,
    val nickname: String,
    val published: Boolean,
    val imageUrl: String,
    val birthYearInLHijri: Int,
    val validBirthDate: Boolean,
    val deathYearInLHijri: Int,
    val validDeathDate: Boolean,
    val pinOrder: Int,
    val birthPlaceLatitude: Double,
    val birthPlaceLongitude: Double,
    val deathPlace: String?,
    val deathPlaceLatitude: Double,
    val deathPlaceLongitude: Double,
)
