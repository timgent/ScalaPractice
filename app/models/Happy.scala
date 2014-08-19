package models

/**
 * Created by timmeh on 19/08/14.
 */
case class Happy(ID: Long, name: String, happy: String)

object Happy {
  var happies = Set(
    Happy(1, "Timmeh","I learned some Scala!"),
    Happy(2, "Timmeh","I taught Ashli some maths!"),
    Happy(3, "Ashli","I got taught some maths!")
  )

  def findAll = happies.toList

}