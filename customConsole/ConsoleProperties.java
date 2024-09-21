package customConsole;

public class ConsoleProperties {
    private int logDelayInMilliseconds;
    public ConsoleProperties()
    {
        this.logDelayInMilliseconds = 1;
    }
    public ConsoleProperties(int logDelayInMilliseconds)
    {
        this.validateConstructor(logDelayInMilliseconds);

        this.logDelayInMilliseconds = logDelayInMilliseconds;
    }
    public int getLogDelayInMilliseconds() {
        return this.logDelayInMilliseconds;
    }
    private void validateConstructor(int logDelayInMilliseconds)
    {
        if (logDelayInMilliseconds <= 0)
        {
            throw new RuntimeException("From ConsoleProperties.validateConstructor(): 0 Or negative integers are invalid.");
        }
    }
}
