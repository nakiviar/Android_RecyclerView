package com.ciber.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AgendaViewHolder(vista:View) : RecyclerView.ViewHolder(vista){

    //constructor de view holder debe ser inicializado
    val lblNombrePersona= vista.findViewById<TextView>(R.id.lblNombrePersona)
    val lblTelefono: TextView=vista.findViewById(R.id.lblnroPersona)


}