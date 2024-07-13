package atcoder.utils

import com.google.common.truth.Truth.assertThat
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun judge(input: String, output: String, run: () -> Unit) {
    val inputStream = ByteArrayInputStream(input.toByteArray())
    System.setIn(inputStream)
    val out = ByteArrayOutputStream()
    System.setOut(PrintStream(out))

    run()

    assertThat(output + System.lineSeparator()).isEqualTo(out.toString())
}