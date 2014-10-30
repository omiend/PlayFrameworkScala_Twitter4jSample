package controllers

import play.api._
import play.api.mvc._
import play.api.Play.current

import play.api.cache._

import twitter4j._

/** Applocation Controller */
object Application extends Controller {

  /** index画面起動 */
  def index = Action {
  	// CacheからTwitter4j.Userオブジェクトを取得し、index画面を機動
  	Ok(views.html.index(Cache.getAs[User]("twitter_user")))
  }

}