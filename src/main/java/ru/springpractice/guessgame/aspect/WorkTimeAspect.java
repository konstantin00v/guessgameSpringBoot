package ru.springpractice.guessgame.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Instant;
@Component
@Aspect
@Slf4j
public class WorkTimeAspect {

    @Around("@annotation(ru.springpractice.guessgame.annotation.WorkTime)")
    public Object workTimeMethod (ProceedingJoinPoint point) throws Throwable {
        String methodName = point.getSignature().getName();
        long start = Instant.now().toEpochMilli();
        Object returnedValue = point.proceed();
        long end = Instant.now().toEpochMilli();
        long time = end - start;
        log.info("{} method invoked in {}", methodName, time);
        return returnedValue;
    }

}
