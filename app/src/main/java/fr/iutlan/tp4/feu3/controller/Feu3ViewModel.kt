package fr.iutlan.tp4.feu3.controller

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import fr.iutlan.tp4.feu3.state.Feu3State

class Feu3ViewModel : ViewModel() {
    // État privé et observable
    private val _state = mutableStateOf(Feu3State())

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
        state = Feu3State()
    }

    fun suivant() {
        state = when {
            state.rouge -> Feu3State(rouge = false, vert = true)
            state.vert -> Feu3State(vert = false, orange = true)
            else -> Feu3State(orange = false, rouge = true)
        }
    }
}
