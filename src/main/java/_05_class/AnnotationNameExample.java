package _05_class;

@AnnotationName(value = "type", elementName1 = "hi")
public class AnnotationNameExample {

    @AnnotationName(value = "field", elementName1 = "hi")
    private String field;

//    @AnnotationName(value = "constructor", elementName1 = "bye")  컴파일 에러(타겟에 지정되지 않음)
    public AnnotationNameExample() {

    }

    @AnnotationName(value = "method", elementName1 = "hi")
    public void AnnotationMethod() {

    }

}
