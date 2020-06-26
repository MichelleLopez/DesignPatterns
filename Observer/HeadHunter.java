
import java.util.ArrayList;

public class HeadHunter implements Subject{
    ArrayList<JobObserver> observers = new ArrayList();
    String job;
    
    public HeadHunter() {
    }

    @Override
    public void registerObserver(JobObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(JobObserver observer) {
        observers.remove(observer);
    }
    
     @Override
    public void notifyAllObservers() {
        observers.forEach((observer) -> {
            observer.Update(this);
        });
    }

    public void addJob(String job) {
        this.job = job;
        notifyAllObservers();
    }

    public String getjob() {
        return this.job;
    }

    @Override
    public String toString() {
        return ", HeadHunter ha subido una nueva oferta de empleo: " + this.job;
    }

    
    


   

}
