package main.org.brunel.scala.streamnotifier.core.classes

import java.util.UUID
import scala.slick.driver.SQLiteDriver.simple._


case class AccountPreference(id: UUID, account: Account, provider_iplayer: Boolean)

class AccountPreferences(tag: Tag) extends Table[AccountPreference](tag, "AccountPreferences")
{
    def id = column[UUID]("Id", O.PrimaryKey)

    def provider_iplayer = column[Boolean]("Provider_iPlayer")

    def * = (id, provider_iplayer)
}