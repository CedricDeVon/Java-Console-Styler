package customConsole.textStylist;

public class TextFontColorProperty implements TextProperty {
    public static int NONE = 0;
    public static int GREY = 30;
    public static int RED = 31;
    public static int GREEN = 32;
    public static int YELLOW = 33;
    public static int BLUE = 34;
    public static int MAGENTA = 35;
    public static int CYAN = 36;
    public static int WHITE = 37;
    public static int BRIGHT_GREY = 90;
    public static int BRIGHT_RED = 91;
    public static int BRIGHT_GREEN = 92;
    public static int BRIGHT_YELLOW = 93;
    public static int BRIGHT_BLUE = 94;
    public static int BRIGHT_MAGENTA = 95;
    public static int BRIGHT_CYAN = 96;
    public static int BRIGHT_WHITE = 97;
    public static void validate (int property)
    {
        if (property < TextFontColorProperty.NONE)
        {
            throw new RuntimeException("From TextFontColorProperty.validate(): Negative integers are invalid.");
        }
    }
}
