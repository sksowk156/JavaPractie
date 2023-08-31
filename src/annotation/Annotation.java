package annotation;

import java.util.ArrayList;
import java.util.List;

public class Annotation {
    @SuppressWarnings("unchecked")
    ArrayList list = new ArrayList();

    @SuppressWarnings("varargs")
    public void function(List list){
        list.addAll(list);
    }
    public static void main(String[] args) {

    }
}
