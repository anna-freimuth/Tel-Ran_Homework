import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class LogEntryService {

    public Map<String, Long> countUrlVisits(List<LogEntry> logEntryList) {
        return logEntryList.stream()
                .collect(Collectors.groupingBy(url -> url.getUrl(),
                        Collectors.counting())

                );
    }

    public Map<String, Long> countUniqVisits(List<LogEntry> logEntryList) {

        Map<String, List<LogEntry>> map = logEntryList.stream()
                .collect(Collectors.groupingBy(logEntry -> logEntry.url));

        return map.entrySet().stream().collect(
                Collectors.toMap(
                        Map.Entry::getKey, entry -> entry.getValue().stream().map(logEntry -> logEntry.login).distinct().count()
                )
        );
    }
}
