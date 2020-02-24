package CreationalPattern.Singleton.Solution.Enum_class;

public enum SingletonTest {
    INSTANCE;

    public static SingletonTest getInstance(){
        return INSTANCE;
    }
}
