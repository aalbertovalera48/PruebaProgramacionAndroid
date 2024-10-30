package com.example.pruebaprogramacionandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistroTareasActivity : AppCompatActivity() {

    private lateinit var tareaTituloEditText: EditText
    private lateinit var tareaDescripcionEditText: EditText
    private lateinit var guardarTareaButton: Button
    private lateinit var tareatextViewFecha: EditText
    private lateinit var tareatextViewPrioridad: EditText
    private lateinit var tareatextViewCoste: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_tareas)

        tareaTituloEditText = findViewById(R.id.editTextNombre)
        tareaDescripcionEditText = findViewById(R.id.editTextDescripcion)
        guardarTareaButton = findViewById(R.id.buttonRegistrar)
        tareatextViewFecha = findViewById(R.id.editTextFecha)
        tareatextViewPrioridad = findViewById(R.id.editTextPrioridad)
        tareatextViewCoste = findViewById(R.id.editTextCoste)

        guardarTareaButton.setOnClickListener {
            val titulo = tareaTituloEditText.text.toString()
            val descripcion = tareaDescripcionEditText.text.toString()
            val fecha = tareatextViewFecha.text.toString()
            val prioridad = tareatextViewPrioridad.text.toString()
            val coste = tareatextViewCoste.text.toString().toIntOrNull() ?: 0

            if (titulo.isNotEmpty()) {
                val tarea = Tarea(titulo, descripcion, fecha, prioridad, coste)
                Tarea.TareasRepository.agregarTarea(tarea)
                finish()
            } else {
                Toast.makeText(this, "El título es obligatorio", Toast.LENGTH_SHORT).show()
            }
        }
    }
}