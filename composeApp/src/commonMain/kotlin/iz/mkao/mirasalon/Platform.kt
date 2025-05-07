package iz.mkao.mirasalon

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform