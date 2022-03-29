import model.Serie
import model.Videojuego

fun main(args: Array<String>) {
    var series = arrayOf<Serie>()
    var videojuegos = arrayOf<Videojuego>()

    val serie1 = Serie("Breaking Bad", 5, "Accion", "Vince Gilligan")
    val serie2 = Serie("Peaky Blinders", 5, "Accion", "Steven Knight")
    val serie3 = Serie("Flash", 3, "C", "C")
    val serie4 = Serie("House of Cards", 4, "D", "D")
    val serie5 = Serie("Punisher", 5, "E", "E")

    series = series.plus(serie1)
    series = series.plus(serie2)
    series = series.plus(serie3)
    series = series.plus(serie4)
    series = series.plus(serie5)

    val game1 = Videojuego("League of legends", 100.0f, "MOBA", "Riot")
    val game2 = Videojuego("Valorant", 10.0f, "Shooter", "Riot")
    val game3 = Videojuego("Sims", 5.0f, "Simulador", "C")
    val game4 = Videojuego("Need for Speed", 15.0f, "Carros", "D")
    val game5 = Videojuego("Forza", 8.0f, "Carros", "E")

    videojuegos = videojuegos.plus(game1)
    videojuegos = videojuegos.plus(game2)
    videojuegos = videojuegos.plus(game3)
    videojuegos = videojuegos.plus(game4)
    videojuegos = videojuegos.plus(game5)

    series.get(0).entregar()
    series.get(3).entregar()
    series.get(4).entregar()

    videojuegos.get(1).entregar()
    videojuegos.get(2).entregar()
    videojuegos.get(4).entregar()

    var cont = 0
    for (i in series.indices) {
     if (series[i].isEntregado()) {
         series[i].devolver()
         cont += 1
     }
    }
    println("Hay ${cont} series entregadas")

    var cont1 = 0
    for (i in videojuegos.indices) {
        if (videojuegos[i].isEntregado()) {
            videojuegos[i].devolver()
            cont1 += 1
        }
    }
    println("Hay ${cont1} videojuegos entregados")
}