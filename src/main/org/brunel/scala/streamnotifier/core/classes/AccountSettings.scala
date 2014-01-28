package main.org.brunel.scala.streamnotifier.core.classes

import java.util.UUID


case class AccountSettings(id: Option[UUID], account: Account, provider_iplayer: Boolean)