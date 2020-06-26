
public class JobSeeker implements JobObserver{
    private String name;
   
    public JobSeeker(){
    }
    
    public JobSeeker(String name) {
        this.name = name;
    }
    
    @Override
    public void Update(Subject subject){
        System.out.println(this.name + subject);
    }
}
