package models

import java.util.{Date}
import play.api.db._
import play.api.Play.current
import anorm._
import anorm.SqlParser._
import scala.language.postfixOps

case class Feed(id: Pk[Long] = NotAssigned, title: String, xmlurl: String, htmlurl: String)

object Feed {
  
  // -- Parsers
  
  /**
   * Parse a Computer from a ResultSet
   */
  val simple = {
    get[Pk[Long]]("feed.id") ~
	get[String]("feed.title") ~
	get[String]("feed.xmlurl") ~
	get[String]("feed.htmlurl") map {
      case id~title~xmlurl~htmlurl => Feed(id, title, xmlurl, htmlurl)
    }
  }
  
  // -- Queries
  
  /**
   * Retrieve a computer from the id.
   */
  def findById(id: Long): Option[Feed] = {
    DB.withConnection { implicit connection =>
      SQL("select * from subscriptions where id = {id}").on('id -> id).as(Feed.simple.singleOpt)
    }
  }
  
 
  /**
   * Update a computer.
   *
   * @param id The computer id
   * @param computer The computer values.
   *case class Feed(id: Pk[Long] = NotAssigned, title: String, xmlurl: String, htmlurl: String)
   */
   
  def update(id: Long, feed: Feed) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          update subscriptions
          set title = {title}, xmlurl = {xmlurl}, htmlurl = {htmlurl}
          where id = {id}
        """
      ).on(
        'id -> id,
        'title -> feed.title,
        'xmlurl -> feed.xmlurl,
        'htmlurl -> feed.htmlurl
      ).executeUpdate()
    }
  }
  
  /**
   * Insert a new computer.
   *
   * @param computer The computer values.
   */
  def insert(feed: Feed) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          insert into subscriptions values (
            (select nextval('feed_seq') ), 
            {title}, {xmlurl}, {htmlurl}
          )
        """
      ).on(
          'title -> feed.title,
          'xmlurl -> feed.xmlurl,
          'htmlurl -> feed.htmlurl
      ).executeUpdate()
    }
  }
  
  /**
   * Delete a computer.
   *
   * @param id Id of the computer to delete.
   */
  def delete(id: Long) = {
    DB.withConnection { implicit connection =>
      SQL("delete from subscriptions where id = {id}").on('id -> id).executeUpdate()
    }
  }
  
}


