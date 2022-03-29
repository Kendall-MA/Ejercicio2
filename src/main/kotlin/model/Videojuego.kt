package model

class Videojuego : Entregable {
    var titulo : String
    var horasEstimadas : Float
    var entregado : Boolean
    var genero : String
    var compañia: String

    constructor() {
        this.titulo = ""
        this.horasEstimadas = 0.0f
        this.entregado = false
        this.genero = ""
        this.compañia = ""
    }

    constructor(titulo: String, horasEstimadas: Float) {
        this.titulo = titulo
        this.horasEstimadas = horasEstimadas
        this.entregado = false
        this.genero = ""
        this.compañia = ""
    }

    constructor(titulo: String, horasEstimadas: Float, genero: String, compañia: String) {
        this.titulo = titulo
        this.horasEstimadas = horasEstimadas
        this.entregado = false
        this.genero = genero
        this.compañia = compañia
    }

    override fun entregar() {
        this.entregado = true
    }

    override fun devolver() {
        this.entregado = false
    }

    override fun isEntregado() : Boolean {
        return this.entregado
    }
}