package com.example.pruebaprogramacionandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetallesTareaActivity : AppCompatActivity() {
    private lateinit var tareaTituloTextView: TextView
    private lateinit var tareaDescripcionTextView: TextView
    private lateinit var volverButton: Button
    private lateinit var tareatextViewFecha: TextView
    private lateinit var tareatextViewPrioridad: TextView
    private lateinit var tareatextViewCoste: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles_tareas)

        tareaTituloTextView = findViewById(R.id.textViewTitulo)
        tareaDescripcionTextView = findViewById(R.id.textViewDescripcion)
        volverButton = findViewById(R.id.buttonVolver)
        tareatextViewFecha = findViewById(R.id.textViewFecha)
        tareatextViewPrioridad = findViewById(R.id.textViewPrioridad)
        tareatextViewCoste = findViewById(R.id.textViewCoste)

        tareaTituloTextView.text = intent.getStringExtra("tareaTitulo")
        tareaDescripcionTextView.text = intent.getStringExtra("tareaDescripcion")
        tareatextViewFecha.text = intent.getStringExtra("tareaFecha")
        tareatextViewPrioridad.text = intent.getStringExtra("tareaPrioridad")
        tareatextViewCoste.text = intent.getIntExtra("tareaCoste", 0).toString()

        volverButton.setOnClickListener {
            finish()
        }
    }
}