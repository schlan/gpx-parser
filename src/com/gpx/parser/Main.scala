package com.gpx.parser

import scala.io.{BufferedSource, Source}
import scala.xml.{NodeSeq, Elem, XML}
import com.gpx.parser.gpxtype._
import scala.collection.mutable
import scala.collection.mutable.{ListBuffer, Map}
import scala.Some

object Main extends App {

  val gpx : GPX = GPXDecoder.decodeFromFile("res/full.gpx")

  println(gpx)


}




