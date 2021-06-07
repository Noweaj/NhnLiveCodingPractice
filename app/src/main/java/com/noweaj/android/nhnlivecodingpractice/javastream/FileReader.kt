package com.noweaj.android.nhnlivecodingpractice.javastream

import java.io.InputStream

object FileReader {
    
    fun readFile(inputStream: InputStream): List<String>{
        val returnList = mutableListOf<String>()
        inputStream.bufferedReader().forEachLine { returnList.add(it) }
        return returnList
    }
}