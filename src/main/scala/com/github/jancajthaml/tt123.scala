package com.github.jancajthaml


trait GNode {

  def getName: String
  def getChildren: List[GNode]
}
