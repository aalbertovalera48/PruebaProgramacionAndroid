package com.example.pruebaprogramacionandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnListaTareas = findViewById<Button>(R.id.btnListaTareas)
        val btnListaCompras = findViewById<Button>(R.id.btnListaCompras)
        val btnMisTareas2 = findViewById<Button>(R.id.btnMisTareas2)

        btnListaTareas.setOnClickListener {
            startActivity(Intent(this, ListaTareasActivity::class.java))
        }

        btnListaCompras.setOnClickListener {
            startActivity(Intent(this, ListaCompraActivity::class.java))
        }

        // Si le das al boton de pendientes puedes añadir una tarea con sus detalles y que aparezca la lista en pantalla.
        btnMisTareas2.setOnClickListener {
            startActivity(Intent(this, ListadoTareasActivity::class.java))
        }
    }
}
