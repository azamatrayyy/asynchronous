abstract class ContentItem implements Downloadable {
    private int id;
    private static int idGen=1;
    private String title;
    private int year;
    private int durationMinutes;
    int getId() {
        return id;
    }
    void setId(int id) {
        this.id = id;
    }
    String getTitle() {
        return title;
    }
    void setTitle(String title) {
        if(title==null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        else this.title = title;
    }
    int  getYear() {
        return year;
    }
    void setYear(int year) {
        if(year>=1990 && year<=2025) {
            this.year = year;
        }
        else throw new IllegalArgumentException("Year out of range");
    }
    int getDurationMinutes() {
        return durationMinutes;
    }
    void setDurationMinutes(int durationMinutes) {
        if(durationMinutes<=0) {
            throw new IllegalArgumentException("Duration cannot be negative");
        }
        else this.durationMinutes = durationMinutes;
    }
    public ContentItem(String title, int year, int durationMinutes) {
        id = idGen++;
        setTitle(title);
        setYear(year);
        setDurationMinutes(durationMinutes);
    }
    public int getAge(int currentYear) {
        return currentYear - year;
    }
    public abstract double getLicenseCost(int currentYear);
    @Override
    public String toString() {
        return ("This id= " + id + ", title= " + title + ", year=" + year + ", durationMinutes=" + durationMinutes);
    }

}
