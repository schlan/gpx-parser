package com.droelf.gpxparser.extensions.track

import com.droelf.gpx.gpxtype.{DecoderUtils, GPXTopNodeDecoder}
import scala.xml.Node


class TrackExtension(var displayColor : Option[String] = None) {}

object TrackExtensionDecoder extends GPXTopNodeDecoder[Option[TrackExtension]] with DecoderUtils{

  override def decode(rawData: Node): Option[TrackExtension] ={
    val trackExtension = new TrackExtension()

    var trackExtensionRaw : Option[Node] = None
    rawData.child.foreach(
      _ match {
        case elem @ <TrackExtension>{_*}</TrackExtension> => trackExtensionRaw = Some(elem)
        case _ =>
      }
    )

    trackExtensionRaw match{
      case Some(x) => x.child.foreach(
        _ match {
          case <DisplayColor>{data}</DisplayColor> => trackExtension.displayColor = nodeAsTextOption(data)
          case _ =>
        }
      )
      case None => return None
    }

    return Some(trackExtension)
  }
}
