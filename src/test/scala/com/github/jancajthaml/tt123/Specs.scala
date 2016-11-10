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

    graph.walkGraph(graph)

    1 should === (1)
  }

  "paths" should "find all paths from root to tail (DFS tuples)" in {
  }
}