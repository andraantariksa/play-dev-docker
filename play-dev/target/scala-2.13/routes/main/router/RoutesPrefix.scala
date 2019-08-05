// @GENERATOR:play-routes-compiler
// @SOURCE:/opt/play/conf/routes
// @DATE:Mon Aug 05 06:10:10 UTC 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
