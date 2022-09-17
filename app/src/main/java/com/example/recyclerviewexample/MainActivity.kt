package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrData = arrayListOf<ContactModel>(
            ContactModel(R.drawable.userone,"Dinesh","8824761042"),
            ContactModel(R.drawable.usertwo,"Deepak","8824761043"),
            ContactModel(R.drawable.userthree,"Abhishek","8800675619"),
            ContactModel(R.drawable.userfour,"Pawan","8800675619"),
            ContactModel(R.drawable.userone,"Dinesh","8824761042"),

            ContactModel(R.drawable.userone,"Dinesh","8824761042"),
            ContactModel(R.drawable.usertwo,"Deepak","8824761043"),
            ContactModel(R.drawable.userthree,"Abhishek","8800675619"),
            ContactModel(R.drawable.userfour,"Pawan","8800675619"),
            ContactModel(R.drawable.userone,"Dinesh","8824761042"),
            ContactModel(R.drawable.userone,"Dinesh","8824761042"),
            ContactModel(R.drawable.usertwo,"Deepak","8824761043"),
            ContactModel(R.drawable.userthree,"Abhishek","8800675619"),
            ContactModel(R.drawable.userfour,"Pawan","8800675619"),
            ContactModel(R.drawable.userone,"Dinesh","8824761042"),
            ContactModel(R.drawable.userone,"Dinesh","8824761042"),
            ContactModel(R.drawable.usertwo,"Deepak","8824761043"),
            ContactModel(R.drawable.userthree,"Abhishek","8800675619"),
            ContactModel(R.drawable.userfour,"Pawan","8800675619"),
            ContactModel(R.drawable.userone,"Dinesh","8824761042"),
            ContactModel(R.drawable.userone,"Dinesh","8824761042"),
            ContactModel(R.drawable.usertwo,"Deepak","8824761043"),
            ContactModel(R.drawable.userthree,"Abhishek","8800675619"),
            ContactModel(R.drawable.userfour,"Pawan","8800675619"),
            ContactModel(R.drawable.userone,"Dinesh","8824761042"),
        )
        //recyclerViewContact.layoutManager = LinearLayoutManager(this)
        recyclerViewContact.layoutManager = GridLayoutManager(this,2)
        recyclerViewContact.adapter = ContactListAdepter(this,arrData)
    }
}