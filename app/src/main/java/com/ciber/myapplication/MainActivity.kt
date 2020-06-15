package com.ciber.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // var Juan =Persona("Juan","231293")

      //  Juan = Persona("Pedro", "343431213")

        val listaPersonas = ArrayList<Persona>()
        listaPersonas.add(Persona("JOSE FERNANDO","2222234"))
        listaPersonas.add(Persona("MARIA GUERRA ","3433334234"))
        listaPersonas.add(Persona("JUAN TORRES","344234234"))
        listaPersonas.add(Persona("ALEJANDRO PEREZ","344234234"))
        listaPersonas.add(Persona("MARIA GUERRA ","3433334234"))
        listaPersonas.add(Persona("JUAN TORRES","344234234"))
        listaPersonas.add(Persona("JOSE FERNANDO","2222234"))
        listaPersonas.add(Persona("ALEJANDRO PEREZ","344234234"))
        listaPersonas.add(Persona("MARIA GUERRA ","3433334234"))
        listaPersonas.add(Persona("JUAN TORRES","344234234"))
        listaPersonas.add(Persona("JOSE FERNANDO","2222234"))
        listaPersonas.add(Persona("ALEJANDRO PEREZ","344234234"))
        //
        //

     //Comportamiento , Lista
              // rvAgenda.layoutManager  =  LinearLayoutManager(this)
      //grid
        rvAgenda.layoutManager  =GridLayoutManager(this,2)

       //Cargar adaptador
        rvAgenda.adapter = AgendaAdapter(listaPersonas)
    }
}