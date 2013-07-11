package sa.ai

import sa.ai.model.Card

/**
 * Entry point
 */
object Main extends App
{
  val firstGameCardNames =
    Card.FirstGame.map(_.name)

  println(s"First game cards are: ${firstGameCardNames.mkString(", ")}")
}
