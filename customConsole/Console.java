package customConsole;

public class Console {
    private final Logger logger;
    public Console()
    {
        this.logger = new Logger();
    }
    public void logText(String text)
    {
        this.logger.execute(text);
    }
    public void logText(String text, ConsoleProperties consoleProperties)
    {
        this.validateTextAndConsoleProperties(text, consoleProperties);

        this.logger.execute(text, consoleProperties);
    }
    public void logNewLine()
    {
        this.logger.execute("\n");
    }
    public void logTab()
    {
        this.logger.execute("\t");
    }
    public void clearAllLogs() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    private void validateTextAndConsoleProperties(String text, ConsoleProperties consoleProperties)
    {
        if (text == null || consoleProperties == null)
        {
            throw new RuntimeException("From Console.validateTextAndConsoleProperties(): Null values are invalid.");
        }
    }
}
