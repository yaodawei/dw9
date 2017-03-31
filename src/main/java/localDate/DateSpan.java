package localDate;

import java.time.LocalDate;

public class DateSpan {

    private LocalDate start;
    private LocalDate end;

    public DateSpan(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DateSpan(LocalDate date) {
        this(date, date);
    }

    public DateSpan(LocalDate start, int length) {
        this(start, start.plusDays(length - 1));
    }

    /**
     * The string must represent a valid date and is parsed using
     * {@link java.time.format.DateTimeFormatter#ISO_LOCAL_DATE}.
     */
    public DateSpan(String start, String end) {
        this(LocalDate.parse(start), LocalDate.parse(end));
    }

    public DateSpan(String date) {
        this(LocalDate.parse(date));
    }

    public DateSpan(String start, int length) {
        this(LocalDate.parse(start), length);
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
}
