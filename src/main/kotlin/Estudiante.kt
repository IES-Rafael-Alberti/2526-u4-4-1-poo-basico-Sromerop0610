class Estudiante (private val nombre: String){
    private var nota: Double = 0.0
        set(value) {
            if (value in 0.0..10.0) {
                field = value
            } else {
                println("Nota inválida ($value). Debe estar entre 0 y 10.")
            }
        }
    fun setNota(nota:Double){
        this.nota = nota
    }

    override fun toString(): String {
        return "Estudiante: $nombre, Nota: $nota)"
    }
}