
fun main() {
    val name = "Salawat"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = false
//    Ayra
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val karma = (Math.pow(Math.random(), (100 - healthPoints) / 100.0) *
            20).toInt()
    val auraColor = when (karma) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> ""
    }
    // val auraColor = if (auraVisible) "GREEN" else "NONE"
    //println("Aura: $auraColor " + "Blased: ${if (isBlessed) "Yes" else "NO"}")
    // println("$name здорвье $healthPoints %")
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    println("(HP: $healthPoints %)" + ("(Аура: $auraColor)") + " -->" + "\"$name" + "$healthStatus\"")


}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
    val healthStatus = when (healthPoints) {
        100 -> " в отличном состоянии!"
        in 90..99 -> " имеет несколько царапин"
        in 75..89 -> if (isBlessed) {
            " имеет незначительные раны, но заживает довольно быстро!"
        } else {
            " имеет незначительные раны"
        }
        in 15..74 -> " выглядит довольно больной."
        else -> {
            "в ужасном состоянии!"
        }
    }
    return healthStatus
}