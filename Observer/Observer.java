
public class Observer {

    public static void main(String[] args) {
        HeadHunter hunter = new HeadHunter();
        JobSeeker seeker = new JobSeeker("Pedro");
        hunter.registerObserver(seeker);
        JobSeeker seeker2 = new JobSeeker("Maria");
        hunter.registerObserver(seeker2);
        hunter.addJob("Web developer");
    }
    
}
