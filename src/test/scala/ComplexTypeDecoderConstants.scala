import com.droelf.gpx.gpxtype._

/**
 * Created by basti on 3/7/14.
 */
trait ComplexTypeDecoderConstants {

  // CopyRight
  val author = "Flippy"
  val year = "2020"
  val license ="http://www.apache.org/licenses/LICENSE-2.0.html"
  val copyright = <copyright author={author}><year>{year}</year><license>{license}</license></copyright>

  // Link
  val href = "http://www.google.at"
  val text = "Sample Text"
  val typee = "Website"
  val link = <link href={href}><text>{text}</text><type>{typee}</type></link>

  // Email
  val domain = "wurst.at"
  val id = "hans"
  val email = <email id={id} domain={domain} />

  // Person
  val name = "Jon Doe"
  val person = <person>
                  <name>{name}</name>
                  <email id={id} domain={domain} />
                  <link href={href}><text>{text}</text><type>{typee}</type></link>
              </person>



}
