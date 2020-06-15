package com.ciber.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AgendaAdapter(val lista: ArrayList<Persona>) : RecyclerView.Adapter<AgendaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgendaViewHolder {

        val vista = LayoutInflater.from(parent.context).inflate(R.layout.persona_item,parent,false)
        return AgendaViewHolder(vista)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: AgendaViewHolder, position: Int) {

        val personaActual = lista[position]

        holder.lblNombrePersona.text=personaActual.nombre
        holder.lblTelefono.text=personaActual.telefono
    }

}