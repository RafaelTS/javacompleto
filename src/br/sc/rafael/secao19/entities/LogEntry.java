package br.sc.rafael.secao19.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String userName;
    private Date Moment;

    public LogEntry(String userName, Date moment) {
        this.userName = userName;
        Moment = moment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getMoment() {
        return Moment;
    }

    public void setMoment(Date moment) {
        Moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry)) return false;
        LogEntry logEntry = (LogEntry) o;
        return getUserName().equals(logEntry.getUserName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName());
    }
}
