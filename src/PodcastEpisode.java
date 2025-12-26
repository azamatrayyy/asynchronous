public class PodcastEpisode extends ContentItem {
    private String hostName;
    public PodcastEpisode(String title, int year, int durationMinutes, String hostName) {
        super(title,year,durationMinutes);
        setHostName(hostName);
    }
    String getHostName() {
        return hostName;
    }
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
    public void download() {
        System.out.println("Downloading Podcast Hosted by  "+ getHostName());
    }
    public int getMaxDownloadsPerDay() {
        return 10;
    }
    @Override
    public double getLicenseCost(int currentYear) {
        int ageFactor;
        if(getAge(currentYear) <=2) {
            ageFactor = 3;
        }
        else ageFactor = 1;
        double cost = 0.03*getDurationMinutes()+ageFactor;
        return cost;
    }
    @Override
    public String toString() {
        return "PodcastEpisode{" +
                "hostname='" + hostName + '\'' +
                "} " + super.toString();
    }
}
