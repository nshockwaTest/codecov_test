package com.awesomeness

import org.scalatest.junit.JUnitSuite
import junit.framework.Assert._
import org.junit.Test

class TestAwesome extends JUnitSuite {
 val awesome = new Awesomeness

 @ Test def awesomeExample {
    assertEquals(1, awesome square 1)
    assertEquals(6, awesome multiple (2,3))
    assertEquals(2, awesome divide(4,2))
    assertEquals(2, awesome add(1,1))
    assertEquals(0, awesome subtract(1,1))
  }
}
