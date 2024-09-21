package customConsole.logger;

import java.util.Timer;
import java.util.Date;

public class Logger {
    public void execute(String text)
    {
        this.validateText(text);

        System.out.print(text);
    }

    public void execute(String text, ConsoleProperties consoleProperties)
    {
        this.validateTextAndConsoleProperties(text, consoleProperties);

        try
        {
            this.handleDelayedLogging(text, consoleProperties);
        } catch (InterruptedException exception) {
            throw new RuntimeException(exception);
        }
    }
    private void handleDelayedLogging(String text, ConsoleProperties consoleProperties) throws InterruptedException {
        this.validateTextAndConsoleProperties(text, consoleProperties);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TextIterator(
                        this,
                        text.toCharArray()),
                new Date(),
                consoleProperties.getLogDelayInMilliseconds());
        synchronized(this)
        {
            this.wait();
            timer.cancel();
        }
    }
    private void validateText(String text)
    {
        if (text == null)
        {
            throw new RuntimeException("From Logger.validateText(): Null arguments are invalid.");
        }
    }
    private void validateTextAndConsoleProperties(String text, ConsoleProperties consoleProperties)
    {
        if (text == null || consoleProperties == null)
        {
            throw new RuntimeException("From Logger.validateTextAndConsoleProperties(): Null arguments are invalid.");
        }
    }
}
