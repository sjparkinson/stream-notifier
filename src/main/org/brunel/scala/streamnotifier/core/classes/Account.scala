package main.org.brunel.scala.streamnotifier.core.classes

import java.util.UUID


case class Account(id: Option[UUID], name: String, email: String, settings: AccountSetting)

//ACCOUNT