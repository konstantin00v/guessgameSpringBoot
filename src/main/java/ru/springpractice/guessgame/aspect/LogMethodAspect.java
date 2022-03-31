package ru.springpractice.guessgame.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Aspect
@Slf4j
public class LogMethodAspect {

    @Around("@annotation(ru.springpractice.guessgame.annotation.LogMethod)")
    public void logPerfomanceData(ProceedingJoinPoint point) {
        String methodName = point.getSignature().getName();
        List<String> args = Arrays.stream(point.getArgs()).map(Object::toString).collect(Collectors.toList());
        log.info("Invoke method {} with params {}", methodName, args );
    }
}
