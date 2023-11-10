package creational.singleton;

public class singleton{
    private static singleton instance;
    private singleton(){}
    public static singleton getInstance(){
        if (instance == null){
            instance = new singleton();
        }
        return instance;
    }
}
