package com.akanshi32.materialdesign3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akanshi32.materialdesign3.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.floatingActionButton.setOnClickListener {
                MaterialAlertDialogBuilder(binding.root.context)
                    .setTitle(resources.getString(R.string.dialog_title))
                    .setMessage(resources.getString(R.string.dialog_message))
                    .setNegativeButton(resources.getString(R.string.dialog_negative)) { dialog, which ->
                        dialog.dismiss()
                    }
                    .setPositiveButton(resources.getString(R.string.dialog_positive)) { dialog, which ->
                        dialog.dismiss()
                    }
                    .show()
            }

    }


}