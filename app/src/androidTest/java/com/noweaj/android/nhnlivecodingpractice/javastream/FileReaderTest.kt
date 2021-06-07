package com.noweaj.android.nhnlivecodingpractice.javastream

import android.content.Context
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import java.io.File

@RunWith(AndroidJUnit4::class)
class FileReaderTest {
    
    lateinit var context: Context
    @Before
    fun setup(){
        context = InstrumentationRegistry.getInstrumentation().targetContext
    }

    @Test
    fun readFileTest() {
        val fileContents = FileReader.readFile(context.assets.open("JavaStreamData.txt"))
        println(fileContents.size)
        for(i in fileContents.indices){
            println(fileContents[i])
        }
    }
}