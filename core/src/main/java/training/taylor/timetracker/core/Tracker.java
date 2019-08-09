package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    private void add(TimeEntry entry) {
        entries.add(entry);
    }

    private void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    private int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        return entries.get(index);
    }
}
