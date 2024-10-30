package com.example.pruebaprogramacionandroid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView

class TareaAdapter(context: Context, private val tareas: MutableList<String>, private val onMarcarHecha: (Int) -> Unit, private val onEliminar: (Int) -> Unit) :
    ArrayAdapter<String>(context, 0, tareas) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.lista_item_tarea, parent, false)
        val textViewTarea = view.findViewById<TextView>(R.id.textViewTarea)
        val buttonMarcarHecha = view.findViewById<Button>(R.id.buttonMarcarHecha)
        val buttonEliminar = view.findViewById<Button>(R.id.buttonEliminar)

        textViewTarea.text = tareas[position]

        buttonMarcarHecha.setOnClickListener {
            onMarcarHecha(position)
        }

        buttonEliminar.setOnClickListener {
            onEliminar(position)
        }

        return view
    }
}