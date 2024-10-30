package com.example.pruebaprogramacionandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListaTareasActivity : AppCompatActivity() {

    private lateinit var tareaEditText: EditText
    private lateinit var addTaskButton: Button
    private lateinit var taskListView: ListView
    private lateinit var listTitleTextView: TextView
    private lateinit var buttonVolver: Button

    private val tareasPendientes = mutableListOf<String>()
    private val tareasRealizadas = mutableListOf<String>()
    private lateinit var adapter: TareaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_tareas)

        tareaEditText = findViewById(R.id.tareaEditText)
        addTaskButton = findViewById(R.id.addTaskButton)
        taskListView = findViewById(R.id.taskListView)
        listTitleTextView = findViewById(R.id.listTitleTextView)
        buttonVolver = findViewById(R.id.buttonVolver)

        adapter = TareaAdapter(this, tareasPendientes, this::marcarComoHecha, this::eliminarTarea)
        taskListView.adapter = adapter

        addTaskButton.setOnClickListener {
            val tarea = tareaEditText.text.toString()
            if (tarea.isNotEmpty()) {
                tareasPendientes.add(tarea)
                actualizarLista()
                tareaEditText.text.clear()
            }
        }

        buttonVolver.setOnClickListener {
            finish()
        }
    }

    private fun eliminarTarea(position: Int) {
        tareasPendientes.removeAt(position)
        actualizarLista()
    }

    private fun marcarComoHecha(position: Int) {
        val tarea = tareasPendientes.removeAt(position)
        tareasRealizadas.add(tarea)
        actualizarLista()
    }

    private fun actualizarLista() {
        adapter.notifyDataSetChanged()
    }
}