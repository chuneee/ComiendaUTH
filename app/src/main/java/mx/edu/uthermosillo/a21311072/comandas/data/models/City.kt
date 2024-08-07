package mx.edu.uthermosillo.a21311072.comandas.data.models

data class City (
    var id: Int,
    var name: String,
    var isCapital: Boolean,
    var state: State
)