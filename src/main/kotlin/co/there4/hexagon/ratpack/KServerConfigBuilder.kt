package co.there4.hexagon.ratpack

import ratpack.server.ServerConfigBuilder
import java.net.InetAddress
import java.nio.file.Path

class KServerConfigBuilder(private val delegate: ServerConfigBuilder) :
    ServerConfigBuilder by delegate {

    var port: Int = 5050
        set (value) {
            field = value
            delegate.port(value)
        }

    var address: InetAddress = InetAddress.getLocalHost()
        set (value) {
            field = value
            delegate.address(value)
        }

    var baseDir: Path? = null
        set (value) {
            field = value
            delegate.baseDir(value)
        }
}