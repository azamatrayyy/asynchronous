import java.util.ArrayList;
import java.util.Scanner;

public class ContentDemo {
    public static void main(String[] args) {
        ArrayList<ContentItem> items = new ArrayList<>();
        VideoLecture videoLecture = new VideoLecture("Trigonometry", 2025, 30, "1080p");
        VideoLecture videoLecture1 = new VideoLecture("Kinematics", 2022, 45, "480p");
        PodcastEpisode podcastEpisode = new PodcastEpisode("Inner spirit of humanity", 2023, 60, "1440p");
        PodcastEpisode podcastEpisode1 = new PodcastEpisode("Problems of society", 2024, 120, "1080");
        items.add(videoLecture);
        items.add(videoLecture1);
        items.add(podcastEpisode);
        items.add(podcastEpisode1);
        System.out.println("Input the current year");
        int currentYear = new Scanner(System.in).nextInt();

        for(int i=0; i<items.size(); i++){
            ContentItem item = items.get(i);
            System.out.println(item.toString() + "| licenseCost=" + item.getLicenseCost(currentYear) );
            if(item instanceof Downloadable){
                Downloadable downloadable = (Downloadable) item;
                downloadable.download();
                System.out.println("Max downloads per day is " + downloadable.getMaxDownloadsPerDay());
            }
        }

    }

}
