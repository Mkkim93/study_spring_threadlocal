package hello.advanced.trace;

/**
 * log 를 시작할 때 상태 정보의 데이터를 가지고 있는 클래스
 */
public class TraceStatus {

    private TraceId traceId;
    private Long StartTimeMs;
    private String message;

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        StartTimeMs = startTimeMs;
        this.message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return StartTimeMs;
    }

    public String getMessage() {
        return message;
    }
}
