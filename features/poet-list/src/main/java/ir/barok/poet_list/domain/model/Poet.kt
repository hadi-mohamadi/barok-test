package ir.barok.poet_list.domain.model

data class Poet(
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
    val birthPlaceLocation: Location,
    val deathPlaceName: String,
    val deathPlaceLocation: Location,
)