package controllers

import models.Happy
import play.api.mvc.{Action, Controller}

/**
 * Created by timmeh on 19/08/14.
 */
object Happies extends Controller {
  def list = Action {
    val happies = Happy.findAll
    Ok(views.html.happies.list(happies))
  }
}
