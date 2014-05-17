package com.droelf.gpx.gpxtype

object Main extends App {

  val gpx: GPX = GPXDecoder.decodeFromFile("res/demo2.gpx")
  //println(gpx)

  gpx.tracks.foreach(
    _.trackStatsExtension match{
      case Some(x) => println(x.ascent)
      case None =>
  }
  )

}




