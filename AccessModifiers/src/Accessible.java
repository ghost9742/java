public interface Accessible {
    int SOME_CONSTANT = 100; // public
    public void methodA(); // public
    void methodB(); // public - all interface methods are public
    boolean methodC(); // public - all interface methods are public
}
