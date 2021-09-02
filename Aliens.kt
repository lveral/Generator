fun main () {
    val Generator: AlienGroupGenerator = AlienGroupGenerator()
    var Aliens = Generator.getAliens(3, 4)
    for (alien in Aliens){
        println("height: ${alien.height}  weight: ${alien.weight}  tentacles: ${alien.tentacles}  eyes: ${alien.eyes}")
    } 
}

class Alien{
    var height: Int = (0..10).random()
    var weight: Int = (0..10).random()
    var tentacles: Int = (0..10).random()
    var eyes: Int = (0..10).random()
}

class AlienGroupGenerator{
    fun getAliens(_minAlienCount: Int, _maxAlienCount: Int): List<Alien>{
        var aliens = ArrayList<Alien>()
        var count = (_minAlienCount.._maxAlienCount).random()
        for(n in 1..count){
            var alien = Alien()
            aliens.add(alien)
        }
        return aliens
    }
}