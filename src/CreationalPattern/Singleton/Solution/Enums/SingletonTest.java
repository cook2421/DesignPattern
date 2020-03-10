package CreationalPattern.Singleton.Solution.Enums;

public enum SingletonTest {

    INSTANCE;

    public static SingletonTest getInstance(){
        return INSTANCE;
    }
}
