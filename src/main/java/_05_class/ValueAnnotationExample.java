package _05_class;

public class ValueAnnotationExample {

    @ValueAnnotation("defaultValue")
    private String value;

    @ValueAnnotation(value = "defaultValue", elementName = "hi~")
    private String name;

}
