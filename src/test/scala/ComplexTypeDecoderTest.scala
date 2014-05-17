import com.droelf.gpx.gpxtype._
import org.scalatest.FunSuite
import scala.Some

class ComplexTypeDecoderTest extends FunSuite with ComplexTypeDecoderConstants{

  test("Test: Email Decoder"){


    val typeEmail = GPXTypeEmailDecoder.decode(email)
    assert(typeEmail.id == id)
    assert(typeEmail.domain == domain)
  }


  test("Test: Copyright Decoder"){

    val typeCopyRight = GPXTypeCopyRightDecoder.decode(copyright)

    assert(typeCopyRight.author == author)
    assert(typeCopyRight.year == Some(year))
    assert(typeCopyRight.license == Some(license))

  }

  test("Test: Link Decoder"){

    val typeLink = GPXTypeLinkDecoder.decode(link)

    assert(typeLink.href == href)
    assert(typeLink.text == Some(text))
    assert(typeLink.typee == Some(typee))

  }


  test("Test: Person Decoder"){
    val typePerson = GPXTypePersonDecoder.decode(person)

    assert(typePerson.name == Some(name))
    //assert(typePerson.email == Some(new GPXTypeEmail(id, domain)))


  }


  //def assertGPXTypeEmail()


}
