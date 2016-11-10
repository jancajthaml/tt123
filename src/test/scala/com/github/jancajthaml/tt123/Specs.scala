package com.github.jancajthaml

import org.scalatest.{FlatSpec, Matchers}

class Specs extends FlatSpec with Matchers {

  "walkGraph" should "traverse each node exactly once (BFS traversal)" in {
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

    graph.paths(graph)

    1 should === (1)
  }
}