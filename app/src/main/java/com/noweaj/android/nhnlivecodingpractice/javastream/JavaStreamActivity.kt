package com.noweaj.android.nhnlivecodingpractice.javastream

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.noweaj.android.nhnlivecodingpractice.R
import com.noweaj.android.nhnlivecodingpractice.databinding.ActivityJavastreamBinding

class JavaStreamActivity: AppCompatActivity() {
    
    lateinit var binding: ActivityJavastreamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_javastream)
        
        setView()
    }
    
    private fun setView(){
        
    }

    override fun onResume() {
        super.onResume()
        // read txt file
    }
}