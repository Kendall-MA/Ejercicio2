package model

class Serie : Entregable {
    var titulo : String
    var numeroTemporadas : Int
    var entregado : Boolean
    var genero : String
    var creador : String

    constructor() {
        this.titulo = ""
        this.numeroTemporadas = 3
        this.entregado = false
        this.genero = ""
        this.creador = ""
    }

    constructor(p_titulo: String, p_creador: String) {
        this.titulo = p_titulo
        this.numeroTemporadas = 0
        this.entregado = false
        this.genero = ""
        this.creador = p_creador
    }

    constructor(titulo: String, numeroTemporadas: Int, genero: String, creador: String) {
        this.titulo = titulo
        this.numeroTemporadas = numeroTemporadas
        this.entregado = false
        this.genero = genero
        this.creador = creador
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