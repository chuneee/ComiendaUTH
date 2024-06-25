package mx.edu.uthermosillo.a21311072.comandas.data.models

data class Item(
    val type: Int,
    val icon: Int? = null,
    val text: String? = null,
    val userName: String? = null,
    val userEmail: String? = null,
    val userPhotoUrl: String? = null
) {
    companion object {
        const val TYPE_USER_INFO = 0
        const val TYPE_COMMAND = 1
    }
}