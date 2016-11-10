package com.github.jancajthaml

import org.scalatest.{FlatSpec, Matchers}

class Specs extends FlatSpec with Matchers {

  val graph = GNodeImpl("A", List(
    GNodeImpl("B", List(
      GNodeImpl("E"),
      GNodeImpl("F")
    )),
    GNodeImpl("C", List(
      GNodeImpl("G"),
      GNodeImpl("H"),
      GNodeImpl("I")
    )),
    GNodeImpl("D", List(
      GNodeImpl("J")
    ))
  ))

  "walkGraph" should "traverse each node exactly once (BFS traversal)" in {
    val reference =  List(
      GNodeImpl("A"),
      GNodeImpl("B"),
      GNodeImpl("C"),
      GNodeImpl("D"),
      GNodeImpl("E"),
      GNodeImpl("F"),
      GNodeImpl("G"),
      GNodeImpl("H"),
      GNodeImpl("J"),
      GNodeImpl("I")
    )

    val result = graph.walkGraph(graph)

    println(s"walkGraph -> ${result}")

    result.map(_.toString) should contain theSameElementsAs reference.map(_.toString)
  }

  "paths" should "find all paths from root to tail (DFS tuples)" in {
    val reference =  List(
      List(GNodeImpl("A"), GNodeImpl("B"), GNodeImpl("E")),
      List(GNodeImpl("A"), GNodeImpl("B"), GNodeImpl("F")),
      List(GNodeImpl("A"), GNodeImpl("C"), GNodeImpl("G")),
      List(GNodeImpl("A"), GNodeImpl("C"), GNodeImpl("H")),
      List(GNodeImpl("A"), GNodeImpl("C"), GNodeImpl("I")),
      List(GNodeImpl("A"), GNodeImpl("D"), GNodeImpl("J"))
    )

    val result = graph.paths(graph)

    println(s"paths -> ${result}")

    result.map(_.map(_.toString)) should contain theSameElementsAs reference.map(_.map(_.toString))
  }
}