package data.remote.dto.base_response

data class AstroDto(
    val is_moon_up: Int?,
    val is_sun_up: Int?,
    val moon_illumination: String?,
    val moon_phase: String?,
    val moonrise: String?,
    val moonset: String?,
    val sunrise: String?,
    val sunset: String?
)