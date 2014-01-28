package main.org.brunel.scala.streamnotifier.core.classes

import java.util.UUID
import main.org.brunel.scala.streamnotifier.core.enumerables.TitleType.TitleType


case class Title(id: Option[UUID], title: String, titleType: TitleType, episode: Int, season: Int)