public class LogEntry {
    String login;
    String url;

    public LogEntry(String login, String url) {
        this.login = login;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getLogin() {
        return login;
    }
}
