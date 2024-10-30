package com.example.pruebaprogramacionandroid

data class Tarea(val titulo: String, val descripcion: String, val fecha: String, val prioridad: String, val coste: Int) {

    object TareasRepository {
        private val tareas = mutableListOf<Tarea>()

        fun agregarTarea(tarea: Tarea) {
            tareas.add(tarea)
        }

        fun obtenerTarea(index: Int): Tarea {
            return tareas[index]
        }

        fun obtenerTitulosTareas(): List<String> {
            return tareas.map { it.titulo }
        }

        fun obtenerTareas(): List<Tarea> {
            return tareas
        }
    }
}