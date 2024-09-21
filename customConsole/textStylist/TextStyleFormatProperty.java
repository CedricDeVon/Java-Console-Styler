package customConsole.textStylist;

public class TextStyleFormatProperty implements  TextProperty {
    public static String START_OF_STYLE_FORMAT = "\u001b[";
    public static String STYLE_PROPERTY_SEPARATOR = ";";
    public static String END_OF_STYLE_PROPERTIES = "m";
    public static String END_OF_STYLE_FORMAT = "\033[0m";
}
