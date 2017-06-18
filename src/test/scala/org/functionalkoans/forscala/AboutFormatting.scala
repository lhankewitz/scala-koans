package org.functionalkoans.forscala

import org.scalatest.Matchers
import support.KoanSuite

class AboutFormatting extends KoanSuite with Matchers {

  koan("""Character Literals can either be an a single character,
          |   an escape sequence, a Unicode octal up to 255 or a hexadecimal""") {

    //format(a) is a string format, meaning the "%c".format(x)
    //will return the string representation of the char.

    val a = 'a'
    "%c".format(a) should be("a")

    val b = 'B'
    "%c".format(b) should be("B")

    val c = '\u0061' //unicode for a
    "%c".format(c) should be("a")

    //val d = '\141' //octal is deprecated in scala
    //"%c".format(d) should be("a") // octal number literals are deprecated in scala since 2.11 see SI-7618

    val e = '\"'
    "%c".format(e) should be("\"")

    val f = '\\'
    "%c".format(f) should be("\\")
  }

}