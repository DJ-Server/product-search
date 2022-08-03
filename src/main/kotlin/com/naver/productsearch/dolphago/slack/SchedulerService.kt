package com.naver.productsearch.dolphago.slack

import org.slf4j.LoggerFactory
import org.springframework.scheduling.TaskScheduler
import org.springframework.stereotype.Service
import java.time.Duration
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ScheduledFuture

@Service
class SchedulerService(
    private val taskScheduler: TaskScheduler,
    private val slackClient: SlackClient,
    private val interviewService: InterviewService
) {
    private val log = LoggerFactory.getLogger(javaClass)
    private val scheduledTasks: MutableMap<String, ScheduledFuture<*>> = ConcurrentHashMap()

    fun register(scheduleId: String, startNumber: Int = 0) {
        var number = startNumber
        val task = taskScheduler.scheduleAtFixedRate({
            slackClient.send(interviewService.createDaily(number++))
        }, Duration.ofDays(1))

        scheduledTasks[scheduleId] = task
    }

    fun remove(scheduleId: String) {
        log.info(scheduleId + "를 종료합니다.")
        scheduledTasks[scheduleId]!!.cancel(true)
    }
}
