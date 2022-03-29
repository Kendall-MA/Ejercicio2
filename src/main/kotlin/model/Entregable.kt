package model

interface Entregable {
    fun entregar()
    fun devolver()
    fun isEntregado() : Boolean
}