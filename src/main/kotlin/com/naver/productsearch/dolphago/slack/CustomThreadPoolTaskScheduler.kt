package com.naver.productsearch.dolphago.slack

import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler
import java.util.*
import java.util.concurrent.ScheduledFuture


@Configuration
class CustomThreadPoolTaskScheduler : ThreadPoolTaskScheduler() {
    override fun scheduleAtFixedRate(task: Runnable, period: Long): ScheduledFuture<*> {
        return if (period <= 0) {
            throw IllegalStateException()
        } else super.scheduleAtFixedRate(task, period)
    }

    override fun scheduleAtFixedRate(task: Runnable, startTime: Date, period: Long): ScheduledFuture<*> {
        return if (period <= 0) {
            throw IllegalStateException()
        } else super.scheduleAtFixedRate(task, startTime, period)
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}

