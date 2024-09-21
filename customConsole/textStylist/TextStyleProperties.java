package customConsole.textStylist;

public class TextStyleProperties {
    private final int fontStyle;
    private final int backgroundColor;
    private final int fontColor;
    public TextStyleProperties(int fontStyle, int backgroundColor, int fontColor)
    {
        this.validateStyleProperties(fontStyle, backgroundColor, fontColor);

        this.fontStyle = fontStyle;
        this.backgroundColor = backgroundColor;
        this.fontColor = fontColor;
    }
    public int getFontStyle() {
        return this.fontStyle;
    }
    public int getBackgroundColor() {
        return this.backgroundColor;
    }
    public int getFontColor() {
        return this.fontColor;
    }
    private void validateStyleProperties(int fontStyle, int backgroundColor, int fontColor)
    {
        TextFontStyleProperty.validate(fontStyle);
        TextBackgroundColorProperty.validate(backgroundColor);
        TextFontColorProperty.validate(fontColor);
    }
}
