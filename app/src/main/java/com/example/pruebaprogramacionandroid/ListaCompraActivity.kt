package com.example.pruebaprogramacionandroid

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListaCompraActivity : AppCompatActivity() {

    private lateinit var productoEditText: EditText
    private lateinit var cantidadEditText: EditText
    private lateinit var precioEditText: EditText
    private lateinit var addProductButton: Button
    private lateinit var summaryTextView: TextView
    private lateinit var productListView: ListView

    private val listaProductos = mutableListOf<Product>()
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_compra)

        productoEditText = findViewById(R.id.editTextProducto)
        cantidadEditText = findViewById(R.id.editTextCantidad)
        precioEditText = findViewById(R.id.editTextPrecio)
        addProductButton = findViewById(R.id.buttonAñadir)
        summaryTextView = findViewById(R.id.textViewTotalProductos)
        productListView = findViewById(R.id.listViewProductos)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaProductos.map { it.toString() })
        productListView.adapter = adapter

        addProductButton.setOnClickListener {
            val nombre = productoEditText.text.toString()
            val cantidad = cantidadEditText.text.toString().toIntOrNull() ?: 1
            val precio = precioEditText.text.toString().toDoubleOrNull() ?: 0.0

            if (nombre.isNotEmpty()) {
                val producto = Product(nombre, cantidad, precio)
                listaProductos.add(producto)
                actualizarLista()
                actualizarResumen()
                productoEditText.text.clear()
                cantidadEditText.text.clear()
                precioEditText.text.clear()
            }
        }
    }

    private fun actualizarLista() {
        adapter.clear()
        adapter.addAll(listaProductos.map { it.toString() })
        adapter.notifyDataSetChanged()
    }

    private fun actualizarResumen() {
        val totalProductos = listaProductos.size
        val totalPrecio = listaProductos.sumOf { it.precio * it.cantidad }
        summaryTextView.text = "Productos: $totalProductos, Precio Total: $totalPrecio €"
    }

    data class Product(val nombre: String, val cantidad: Int, val precio: Double) {
        override fun toString(): String = "$nombre - Cantidad: $cantidad - Precio: $precio €"
    }
}