package code.pecs.example3;

import java.util.List;

public class ListCopyExample {

    public void listStringCopy(List<String> dest, List<String> src){
        for (String stringElement : src){
            dest.add(stringElement);
        }
    }

    public <T> void listAnyTypeDataCopy(List<T> dest, List<T> src){
        for (T element : src){
            dest.add(element);
        }
    }

    public <T> void listAnyTypeDataCopyWildcard(List<? super T> dest, List<? extends T> src){
        for (T element : src){
            dest.add(element);
        }
    }

}
