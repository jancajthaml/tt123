package com.github.jancajthaml


/**
 * - Observe that this GNode can be thought of as defining a graph.
 * - In implementing the functions below, you can assume that any graph defined by
 *   a GNode is acyclic (no cycles).
 * - Assume that when a GNode has no children, getChildren() returns an empty list,
 *   and not null.
 * - You can also assume that all children returned by getChildren() are not null.
*/
trait GNode {

  def getName: String
  def getChildren: List[GNode]
}

case class GNodeImpl(name: String, children: List[GNode] = List.empty[GNode]) extends GNode {

  def getName: String = name

  def getChildren: List[GNode] = children

  /*
    Implement a function with the following signature:
      def walkGraph(node: GNode): List[GNode]

    which should return a List containing every GNode in the graph.
    Each node should appear in the List exactly once (i.e. no duplicates).
  */
  def walkGraph(node: GNode): List[GNode] = {
    @scala.annotation.tailrec
    def walk(result: List[GNode], next: List[GNode]): List[GNode] = next match {
      case Nil => result.reverse
      case _ => {
        val iter = next.foldLeft(result)((stack, a) => a :: stack)
        walk(iter, next.flatMap(node => node.getChildren))
      }
    }
    val r = walk(List.empty[GNode], List(this))
    println(s"walkGraph -> ${r}")
    r
  }

  /*
    Implement a function with the following signature:
      def paths(node: GNode): List[List[GNode]]

    which should return a List of Lists, representing all possible paths
    through the graph starting at 'node'.

    The List returned can be thought of as a List of paths, where each
    path is represented as an List of GNodes.
  
    Example:
      Assume the following graph:

       A
         B
           E
           F
         C
           G
           H
           I
         D
           J

    paths(A) = ( (A B E) (A B F) (A C G) (A C H) (A C I) (A D J) )
  */
  def paths(node: GNode): List[List[GNode]] = ???

}