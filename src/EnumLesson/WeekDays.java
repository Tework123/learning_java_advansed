package EnumLesson;

public enum WeekDays {
    MONDAY("bad"), TDAY("bad"), WEDDAY("norm"), THUDAY("norm"),
    FRIDAY("good"), SATURDAY("chillout"), SYNDAY("rest");
    private String mood;

    private WeekDays(String mood) {
        this.mood = mood;
    }

    public void getMood() {
        System.out.println(this.mood);
    }
}

class Today {
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case TDAY:
            case FRIDAY:
            case MONDAY:
            case THUDAY:
            case WEDDAY:
                System.out.println("work...");
                break;
            case SYNDAY:
            case SATURDAY:
                System.out.println("degrodation...");
                break;
        }
    }


}

