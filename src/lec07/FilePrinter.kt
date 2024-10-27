package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
    fun readFile() {    // throws IOException 구문이 필요 없음
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile(path: String) {    // try with resources 구문 대신 use 사용
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}
