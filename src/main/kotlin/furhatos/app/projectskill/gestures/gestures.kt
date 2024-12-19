import furhatos.gestures.ARKitParams
import furhatos.gestures.BasicParams
import furhatos.gestures.defineGesture

val BrowRaise = defineGesture("BrowRaise") {
    frame(0.0, persist = true) {
        // Initial state: Neutral
        ARKitParams.BROW_INNER_UP to 0.0
        ARKitParams.BROW_OUTER_UP_LEFT to 0.0
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.0
    }
    frame(0.2) {
        // Dramatically raise eyebrows
        ARKitParams.BROW_INNER_UP to 1.5 // Exaggerate inner brow lift
        ARKitParams.BROW_OUTER_UP_LEFT to 1.2
        ARKitParams.BROW_OUTER_UP_RIGHT to 1.2
    }
    frame(2.0) {
        // Hold the dramatic brow raise
        ARKitParams.BROW_INNER_UP to 1.5
        ARKitParams.BROW_OUTER_UP_LEFT to 1.2
        ARKitParams.BROW_OUTER_UP_RIGHT to 1.2
    }
    frame(2.2) {
        // Gradually lower eyebrows back to neutral
        ARKitParams.BROW_INNER_UP to 0.0
        ARKitParams.BROW_OUTER_UP_LEFT to 0.0
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.0
    }
}


val HeadTiltRight = defineGesture("HeadTiltRight") {
    frame(0.0) {
        BasicParams.NECK_PAN to 0.0 // Center horizontally
        BasicParams.NECK_ROLL to 0.0 // No roll
    }

    // Tilt the head
    frame(0.5) {
        BasicParams.NECK_PAN to 20.0
    }

    frame(1.0) {
        BasicParams.NECK_PAN to -20.0
    }

    frame(1.5) {
        BasicParams.NECK_PAN to 20.0
    }

    frame(2.0) {
        BasicParams.NECK_PAN to -20.0
    }


}


val Frown = defineGesture("Frown") {
    frame(0.0, persist = true) {
        // Neutral face position
        ARKitParams.BROW_DOWN_LEFT to 0.0
        ARKitParams.BROW_DOWN_RIGHT to 0.0
        ARKitParams.MOUTH_SMILE_LEFT to 0.0
        ARKitParams.MOUTH_SMILE_RIGHT to 0.0
    }
    frame(0.5) {
        // Lower both eyebrows to create a frown
        ARKitParams.BROW_DOWN_LEFT to 0.6
        ARKitParams.BROW_DOWN_RIGHT to 0.6

        // Slight pull down of the mouth corners (optional, to enhance the frown)
        ARKitParams.MOUTH_SMILE_LEFT to -0.3
        ARKitParams.MOUTH_SMILE_RIGHT to -0.3
    }
    frame(3.0) {
        // Hold the frown
        ARKitParams.BROW_DOWN_LEFT to 0.6
        ARKitParams.BROW_DOWN_RIGHT to 0.6
        ARKitParams.MOUTH_SMILE_LEFT to -0.3
        ARKitParams.MOUTH_SMILE_RIGHT to -0.3
    }
    frame(3.5) {
        // Return to neutral position
        ARKitParams.BROW_DOWN_LEFT to 0.0
        ARKitParams.BROW_DOWN_RIGHT to 0.0
        ARKitParams.MOUTH_SMILE_LEFT to 0.0
        ARKitParams.MOUTH_SMILE_RIGHT to 0.0
    }
}

val NarrowEyes = defineGesture("NarrowEyes") {
    frame(0.0, persist = true) {
        // Neutral face position (eyes open)
        ARKitParams.EYE_SQUINT_LEFT to 0.0
        ARKitParams.EYE_SQUINT_RIGHT to 0.0
    }
    frame(0.5) {
        // Start narrowing the eyes (squinting)
        ARKitParams.EYE_SQUINT_LEFT to 0.8
        ARKitParams.EYE_SQUINT_RIGHT to 0.8
    }
    frame(3.0) {
        // Hold the narrowed eyes (squint)
        ARKitParams.EYE_SQUINT_LEFT to 0.8
        ARKitParams.EYE_SQUINT_RIGHT to 0.8
    }
    frame(3.5) {
        // Return to neutral position
        ARKitParams.EYE_SQUINT_LEFT to 0.0
        ARKitParams.EYE_SQUINT_RIGHT to 0.0
    }
}

val Smirk = defineGesture("Smirk") {
    frame(0.0, persist = true) {
        // Neutral mouth position
        ARKitParams.MOUTH_SMILE_LEFT to 0.0
        ARKitParams.MOUTH_SMILE_RIGHT to 0.0
    }
    frame(1.0) {
        // Raise the right side of the mouth more noticeably (smirking)
        ARKitParams.MOUTH_SMILE_LEFT to 0.0
        ARKitParams.MOUTH_SMILE_RIGHT to 0.6
    }
    frame(2.0) {
        // Hold the smirk with an even stronger right side smile
        ARKitParams.MOUTH_SMILE_LEFT to 0.0
        ARKitParams.MOUTH_SMILE_RIGHT to 1.0
    }
    frame(4.0) {
        // Hold the smirk for a longer period
        ARKitParams.MOUTH_SMILE_LEFT to 0.0
        ARKitParams.MOUTH_SMILE_RIGHT to 1.0
    }
    frame(5.0) {
        // Return to neutral position
        ARKitParams.MOUTH_SMILE_LEFT to 0.0
        ARKitParams.MOUTH_SMILE_RIGHT to 0.0
    }
}

val Blink = defineGesture("Blink") {
    frame(0.0, persist = true) {
        // Neutral eye position (eyes open)
        BasicParams.BLINK_RIGHT to 1.0
    }
    frame(0.1) {
        // Close the eyes
        BasicParams.BLINK_RIGHT to 0.0
    }
}
