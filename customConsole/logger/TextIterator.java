package customConsole.logger;

import java.util.TimerTask;

public class TextIterator extends TimerTask
{
        private final Logger logger;
        private final char[] text;
        private int currentIndex;
        public TextIterator(Logger logger, char[] text)
        {
                this.validateLoggerAndText(logger, text);

                this.logger = logger;
                this.text = text;
                this.currentIndex = 0;
        }
        public void run()
        {
                if (currentIndex >= this.text.length)
                {
                        synchronized(this.logger)
                        {
                                this.logger.notify();
                                return;
                        }
                }
                System.out.print(this.text[currentIndex]);
                currentIndex += 1;
        }
        private void validateLoggerAndText(Logger logger, char[] text)
        {
                if (logger == null || text == null)
                {
                        throw new RuntimeException("From TextIterator.validateLoggerAndText(): Null values are invalid.");
                }
        }
}