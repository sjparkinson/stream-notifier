package main.org.brunel.scala.streamnotifier.core.classes

import java.util.UUID
import java.net.URL


case class TitleProvider(id: Option[UUID], title: Title, provider: Provider, url: URL)
