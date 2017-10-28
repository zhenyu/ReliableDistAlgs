package se.sics.test

import se.sics.kompics.sl._
import se.sics.kompics.{Kompics, KompicsEvent, Start}

object HelloWorld extends App {
    Kompics.createAndStart(classOf[HelloWorldC]);
}

class HelloWorldC extends ComponentDefinition {
    ctrl uponEvent {
        case _: Start => handle {
            println("Hello Paxos!")
            Kompics.asyncShutdown()
        }
    }

    /*
    val startHandler = (e: KompicsEvent) => e match {
        case _ : Start => () => {
            println("Hello ETH")
            Kompics.asyncShutdown()
        }
    }
    ctrl uponEvent startHandler
    */
}