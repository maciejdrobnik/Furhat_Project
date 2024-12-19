package furhatos.app.projectskill

import furhatos.app.projectskill.flow.MainFlow
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class ProjectSkill : Skill() {
    override fun start() {
        Flow().run(MainFlow)
    }
}

fun main(args: Array<String>) {

    val robotIp = if (args.isNotEmpty()) args[0] else "localhost"

    println("Connecting to Furhat at: $robotIp")

    System.setProperty("furhat.server", robotIp)

    Skill.main(args)

}