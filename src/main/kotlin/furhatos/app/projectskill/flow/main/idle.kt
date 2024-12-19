package furhatos.app.projectskill.flow.main

import HeadTiltRight
import furhatos.app.projectskill.flow.Parent
import furhatos.flow.kotlin.*

val Idle: State = state {

    init {
        when {
            users.count > 0 -> {
                furhat.attend(users.random)
                goto(Start)
            }
            users.count == 0 && furhat.isVirtual() -> goto(Start)
//            users.count == 0 && !furhat.isVirtual() -> furhat.say("I can't see anyone. Step closer please. ")
        }
    }

    onEntry {
        furhat.attendNobody()
    }

    onUserEnter {
        furhat.attend(it)

        goto(Start)
    }
}

val Start : State = state(Parent) {

    onEntry {
        furhat.gesture(HeadTiltRight, async = false)
    }
}