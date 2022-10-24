/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package play.api.libs.jcache

import play.api.Environment

import javax.cache.CacheManager
import javax.cache.Caching

/**
 * Components for JCache CacheManager
 */
trait JCacheComponents {
  def environment: Environment

  lazy val cacheManager: CacheManager = Caching.getCachingProvider(environment.classLoader).getCacheManager
}
