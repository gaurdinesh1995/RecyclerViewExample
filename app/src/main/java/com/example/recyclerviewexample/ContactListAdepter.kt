package com.example.recyclerviewexample

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contact_row.view.*

class ContactListAdepter(val context:Context, val arrData:ArrayList<ContactModel>):RecyclerView.Adapter<ContactListAdepter.ViewHolder>() {

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        //we will just find the ID's here
        val imgContact = view.imgContact
        val txtName = view.txtContactName
        val txtNo = view.txtContactNumber
        val rootView = view.rootView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.contact_row_grid,parent,false)
      return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = arrData[position]
        holder.imgContact.setImageResource(model.img)
        holder.txtName.text = model.name
        holder.txtNo.text = model.no

        //placing the animation on the contact cards
        AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(holder.rootView, View.ALPHA, 0f,1f).apply {
                    duration = 500
                    //start()
                },
            ObjectAnimator.ofFloat(holder.rootView, View.TRANSLATION_X,500f, 0f).apply {
                duration = 500
            }

            )
            start()
        }


    }

    override fun getItemCount(): Int {
        return arrData.size
    }
}