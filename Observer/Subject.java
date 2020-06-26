
public interface Subject {
    public void registerObserver(JobObserver observer);
    public void removeObserver(JobObserver observer);
    public void notifyAllObservers();
}
