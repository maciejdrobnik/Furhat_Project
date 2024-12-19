package furhatos.app.projectskill.flow

import furhatos.app.projectskill.flow.main.Idle
import furhatos.app.projectskill.persona.activate
import furhatos.app.projectskill.persona.mainPersona
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.users

// Define the main flow
val MainFlow: State = state {
    init {
        users.setSimpleEngagementPolicy(1.0, 1)
        activate(mainPersona)
        goto(Idle)
    }
    onEntry {
//        furhat.gesture(BrowRaise)
//        delay(1000)
//        furhat.gesture(Gestures.CloseEyes, async = true)
//        delay(5000)
//        furhat.gesture(Gestures.OpenEyes)
//        delay(2000)
//        furhat.gesture(HeadTiltRight, async = false)
//        delay(2000)
//        furhat.gesture(Gestures.Blink, async = false)
//        delay(1000)
//        furhat.gesture(Frown, async = false)
//        delay(1000)
//        furhat.gesture(NarrowEyes, async = false)
//        delay(1000)
//        furhat.gesture(Smirk, async = false)
//        delay(2000)

    }
}
