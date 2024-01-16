package com.skillstorm.assignments.week9.tuesday;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.EmptyStackException;

public class Appointment {

    private ZonedDateTime start;
    private Duration duration;

    public Appointment(ZonedDateTime start) {
        this.start = start;
        this.duration = Duration.ofMinutes(30);
    }

    public Appointment(ZonedDateTime start, Duration duration) {
        this.start = start;
        this.duration = duration;
    }

    public ZonedDateTime getStart() {
        return start;
    }

    public void setStart(ZonedDateTime start) {
        this.start = start;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void alert() {
        System.out.println(
                "You have a " + duration.toMinutes() + "min appointment on "
                        + start.format(DateTimeFormatter.ofPattern("E LLL dd")) + " at "
                        + start.format(DateTimeFormatter.ofPattern("hh:mm a z")));
    }

    @Override
    public String toString() {
        return "Appointment [start=" + start + ", duration=" + duration + "]";
    }

}
