/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package play.api

import java.time.ZoneId
import java.time.format.DateTimeFormatter

/**
 * Contains standard HTTP constants.
 * For example:
 * {{{
 * val text = ContentTypes.TEXT
 * val ok = Status.OK
 * val accept = HeaderNames.ACCEPT
 * }}}
 */
package object http {

  /** HTTP date formatter, compliant to RFC 1123 */
  val dateFormat = DateTimeFormatter
    .ofPattern("EEE, dd MMM yyyy HH:mm:ss 'GMT'")
    .withLocale(java.util.Locale.ENGLISH)
    .withZone(ZoneId.of("GMT"))
}
