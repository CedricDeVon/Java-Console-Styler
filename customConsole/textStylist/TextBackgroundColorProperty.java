package customConsole.textStylist;

public class TextBackgroundColorProperty implements TextProperty {
    public static int NONE = 0;
    public static int GREY = 40;
    public static int RED = 41;
    public static int GREEN = 42;
    public static int YELLOW = 43;
    public static int BLUE = 44;
    public static int MAGENTA = 45;
    public static int CYAN = 46;
    public static int WHITE = 47;
    public static int BRIGHT_GREY = 100;
    public static int BRIGHT_RED = 101;
    public static int BRIGHT_GREEN = 102;
    public static int BRIGHT_YELLOW = 103;
    public static int BRIGHT_BLUE = 104;
    public static int BRIGHT_MAGENTA = 105;
    public static int BRIGHT_CYAN = 106;
    public static int BRIGHT_WHITE = 107;
    public static void validate (int property)
    {
        if (property < TextBackgroundColorProperty.NONE)
        {
            throw new RuntimeException("From TextBackgroundColorProperty.validate(): Negative values are invalid.");
        }
    }
}
