package HW_39.task_6;

import java.util.List;

@FunctionalInterface
public interface ListMerger<T> {
    List<T> merge(List<T> list1, List<T> list2);
}