package lection3.custom_exception_types;

public class ArrayTransformationException extends RuntimeException {

    private int illegalElementIndex;
    private String illegalElementValue;
    
    public int getIllegalElementIndex() {
        return illegalElementIndex;
    }

    public String getIllegalElementValue() {
        return illegalElementValue;
    }

    public ArrayTransformationException(int illegalElementIndex, String illegalElementValue) {
        super(String.format("Во входном массиве на позиции: %d находится некорректный элемент: %s", illegalElementIndex, illegalElementValue));
        this.illegalElementIndex = illegalElementIndex;
        this.illegalElementValue = illegalElementValue;
    }

    
}
