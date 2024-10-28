package hello.advanced;

import hello.advanced.trace.logtrace.FieldLogTrace;
import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean // 싱글톤
    public LogTrace logTrace() {
        // return new FileLogTrace();
        return new ThreadLocalLogTrace(); // 동시성 문제를 해결한 configuration
    }
}
