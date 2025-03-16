package fr.iutlan.tp4.feu3.controller

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import fr.iutlan.tp4.feu3.state.Feu3StateV1

class Feu3ViewModel : ViewModel() {
    // État privé et observable
    private val _state = mutableStateOf(Feu3StateV1())

    // Getter pour l'état public
    var state
        get() = _state.value
        private set(newState) {
            _state.value = newState
        }

    init {
        reset()
    }

    // Méthodes pour modifier l'état
    fun reset() {
        state = Feu3StateV1()
    }

    fun suivant() {
        state = when {
            state.rouge -> Feu3StateV1(rouge = false, vert = true)
            state.vert -> Feu3StateV1(vert = false, orange = true)
            else -> Feu3StateV1(orange = false, rouge = true)
        }
    }
}
