package by.epam.itcompany.entity;

final class IdGenerator {
    private static final long MAX_ID = 3_000_000;
    private static final long MIN_ID = 1;
    private static long counter;

     static long generateId() {
        if (++counter > MAX_ID) {
            counter = 1;
        }
        return counter;
    }

}
