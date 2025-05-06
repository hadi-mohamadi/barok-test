package ir.barok.poet_list.data.model

import ir.barok.poet_list.domain.model.Location
import ir.barok.poet_list.domain.model.Poet

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
    val deathPlace: String,
    val deathPlaceLatitude: Double,
    val deathPlaceLongitude: Double,
) {
    fun toDomainModel(): Poet {
        return Poet(
            id = this.id,
            name = this.name,
            description = this.description,
            fullUrl = this.fullUrl,
            rootCatId = this.rootCatId,
            nickname = this.nickname,
            published = this.published,
            imageUrl = this.imageUrl,
            birthYearInLHijri = this.birthYearInLHijri,
            validBirthDate = this.validBirthDate,
            deathYearInLHijri = this.deathYearInLHijri,
            validDeathDate = this.validDeathDate,
            pinOrder = this.pinOrder,
            birthPlaceLocation = Location(
                latitude = this.birthPlaceLatitude,
                longitude = this.birthPlaceLongitude
            ),
            deathPlaceName = this.deathPlace,
            deathPlaceLocation = Location(
                latitude = this.deathPlaceLatitude,
                longitude = this.deathPlaceLongitude
            )
        )
    }
}
