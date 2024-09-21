package customConsole.textStylist;

public class TextStylist {
    public String apply(String text, TextStyleProperties textStyleProperties)
    {
        if (text == null || textStyleProperties == null)
        {
            throw new RuntimeException("From TextStylist.apply(): Null values are invalid.");
        }

        return TextStyleFormatProperty.START_OF_STYLE_FORMAT +
                textStyleProperties.getFontStyle() +
                TextStyleFormatProperty.STYLE_PROPERTY_SEPARATOR +
                textStyleProperties.getBackgroundColor() +
                TextStyleFormatProperty.STYLE_PROPERTY_SEPARATOR +
                textStyleProperties.getFontColor() +
                TextStyleFormatProperty.END_OF_STYLE_PROPERTIES +
                text + TextStyleFormatProperty.END_OF_STYLE_FORMAT;
    }
}
