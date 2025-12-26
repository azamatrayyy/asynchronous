public class VideoLecture extends ContentItem {
    private String quality;
    public VideoLecture(String title, int year, int durationMinutes, String quality) {
        super(title,year,durationMinutes);
        setQuality(quality);
    }
    public String getQuality() {
        return quality;
    }
    public void setQuality(String quality) {
       this.quality = quality;
    }
    @Override
    public double getLicenseCost(int currentYear) {
        int ageFactor;
        if(getAge(currentYear)<=2){
            ageFactor=5;
        }
        else ageFactor=2;
        return 0.05*getDurationMinutes() + ageFactor;
    }
    public void download() {
        System.out.println("Downloading Podcast Episode in quality "+ getQuality());
    }
    public int getMaxDownloadsPerDay() {
        return 3;
    }
    @Override
    public String toString() {
        return "VideoLecture{" +
                "quality='" + quality + '\'' +
                "} " + super.toString();
    }
}
