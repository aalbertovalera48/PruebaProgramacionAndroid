package com.example.pruebaprogramacionandroid

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListadoTareasActivity : AppCompatActivity() {

    private lateinit var listadoTareasListView: ListView
    private lateinit var agregarTareaButton: Button
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_tareas)

        listadoTareasListView = findViewById(R.id.listViewTareas)
        agregarTareaButton = findViewById(R.id.buttonPendientes)

        actualizarListaTareas()

        agregarTareaButton.setOnClickListener {
            startActivity(Intent(this, RegistroTareasActivity::class.java))
        }

        // ListadoTareasActivity.kt
        listadoTareasListView.setOnItemClickListener { _, _, position, _ ->
            val tarea = Tarea.TareasRepository.obtenerTarea(position)
            val intent = Intent(this, DetallesTareaActivity::class.java)
            intent.putExtra("tareaTitulo", tarea.titulo)
            intent.putExtra("tareaDescripcion", tarea.descripcion)
            intent.putExtra("tareaFecha", tarea.fecha)
            intent.putExtra("tareaPrioridad", tarea.prioridad)
            intent.putExtra("tareaCoste", tarea.coste)
            startActivity(intent)
        }
        }

    override fun onResume() {
        super.onResume()
        actualizarListaTareas()
    }

    private fun actualizarListaTareas() {
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Tarea.TareasRepository.obtenerTitulosTareas())
        listadoTareasListView.adapter = adapter
    }
}