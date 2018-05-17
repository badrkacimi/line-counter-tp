public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<Integer>();
        ListIterator<Integer> ltr = null;
        numberList.add(25);
        numberList.add(17);
        numberList.add(108);
        numberList.add(76);
        numberList.add(2);
        numberList.add(36);
        ltr = numberList.listIterator();
        //forward iteration
        System.out.println("Iterating list in forward direction");
        while(ltr.hasNext()){
            System.out.println(ltr.next());
        }
        // backward iteration 
        System.out.println("Iterating list in backward direction");
        while(ltr.hasPrevious()){
            System.out.println(ltr.previous());
        }
    }
}
-----------------------------------------------------------------------------------------------------------------

ListIterator provides an add(E e) method which is not there in Iterator. add(E e) inserts the specified element into the list (optional operation). The element is inserted immediately before the element that would be returned by next(), if any, and after the element that would be returned by previous(), if any.
ListItearator also provides set method. void set(E e) replaces the last element returned by next() or previous() with the specified element (optional operation). This call can be made only if neither remove() nor add(E) have been called after the last call to next or previous.
ListIterator is fail-fast and will throw a ConcurrentModificationException if the underlying collection is structurally modified in any way except through the iterator's own remove or add methods.
