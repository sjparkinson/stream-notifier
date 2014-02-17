package main.org.brunel.scala.streamnotifier.core.classes

import java.util.UUID
import scala.slick.driver.SQLiteDriver.simple._

case class Account(id: Option[UUID], name: String, email: String, settings: AccountSetting)

case class Account(id: UUID, name: Option[String], email: String, preferencesId: UUID)

class Accounts(tag: Tag) extends Table[Account](tag, "Accounts")
{
    def id = column[UUID]("Id", O.PrimaryKey)

    def name = column[String]("Name")

    def email = column[String]("Email")

    def preferences = foreignKey("PreferencesForeignKey", preferencesId, AccountPreferences)

    def * = (id, name.?, email)
}
