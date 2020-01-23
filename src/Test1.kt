fun main() {
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = false
    formatHealthStatus(healthPoints, isBlessed)
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) {
    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds, but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
}

