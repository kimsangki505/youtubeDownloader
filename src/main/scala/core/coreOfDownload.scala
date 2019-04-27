package core
import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom
import org.scalajs.dom.html
import scalatags.JsDom.all._

@JSExport
object coreOfDownload {
  @JSExport
  def main(target: html.Div): Unit = {
    target.appendChild(
      p("at").render).render
  }
}
