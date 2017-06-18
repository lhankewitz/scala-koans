package org.functionalkoans.forscala

import org.scalatest.Matchers
import support.BlankValues.__
import support.KoanSuite

class AboutPreconditions extends KoanSuite with Matchers {

  class WithParameterRequirement(val myValue: Int) {
    require(myValue != 0)


  }

  koan("Violating preconditions throws an exception") {
    intercept[IllegalArgumentException] {


      val myInstance = new WithParameterRequirement(0) // put the value needed to cause IllegalArgumentException in place of the blank

    }
  }
  koan("On precondition violation, intercept expects type of exception thrown") {
    intercept[IllegalArgumentException] {
      // put the exception that will be thrown in place of the blank


      val myInstance = new WithParameterRequirement(0)

    }
  }
}




	
