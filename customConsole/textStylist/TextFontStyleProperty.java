package customConsole.textStylist;

public class TextFontStyleProperty implements TextProperty {
    public static int NONE = 0;
    public static int BOLD = 1;
    public static int TRANSLUCENT = 2;
    public static int ITALIC = 3;
    public static void validate (int property)
    {
        if (property < TextFontStyleProperty.NONE)
        {
            throw new RuntimeException("From TextFontStyleProperty.validate(): Negative integers are invalid.");
        }
    }
}
