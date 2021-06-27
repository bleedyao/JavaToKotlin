package com.example.lesson.entity

class Lesson(var date: String, var content: String, var state: State) {
    operator fun component1() = date
    operator fun component2() = content
    operator fun component3() = state
    enum class State {
        PLAYBACK {
            override fun stateName(): String {
                return "有回放"
            }
        },
        LIVE {
            override fun stateName(): String {
                return "正在直播"
            }
        },
        WAIT {
            override fun stateName(): String {
                return "等待中"
            }
        };

        abstract fun stateName(): String
    }

}