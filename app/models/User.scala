package models

import java.util.{Date}
import play.api.db._
import play.api.Play.current
import anorm._
import anorm.SqlParser._
import scala.language.postfixOps

case class User(id: Pk[Long] = NotAssigned, email: String, password: String)

object User {
  
  // -- Parsers
  
  /**
   * Parse a Computer from a ResultSet
   */
  val simple = {
    get[Pk[Long]]("user.id") ~
	get[String]("user.email") ~
	get[String]("user.password") map {
      case id~email~password => User(id, email, password)
    }
  }
  
  // -- Queries
  
  /**
   * Retrieve a computer from the id.
   */
  def findById(id: Long): Option[User] = {
    DB.withConnection { implicit connection =>
      SQL("select * from users where id = {id}").on('id -> id).as(User.simple.singleOpt)
    }
  }
  
 
  /**
   * Update a computer.
   *
   * @param id The computer id
   * @param computer The computer values.
   *case class User(id: Pk[Long] = NotAssigned, title: String, xmlurl: String, htmlurl: String)
   */
   
  def update(id: Long, user: User) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          update users
          set email = {email}, password = {password}
          where id = {id}
        """
      ).on(
        'id -> id,
        'email -> user.email,
        'password -> user.password
      ).executeUpdate()
    }
  }
  
  /**
   * Insert a new computer.
   *
   * @param computer The computer values.
   */
  def insert(user: User) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          insert into users values (
            (select nextval('users_seq') ), 
            {email}, {password}
          )
        """
      ).on(
          'email -> user.email,
          'password -> user.password
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
      SQL("delete from users where id = {id}").on('id -> id).executeUpdate()
    }
  }
  
}


