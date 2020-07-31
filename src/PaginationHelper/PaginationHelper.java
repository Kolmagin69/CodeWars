package PaginationHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaginationHelper<I> {

    private final int itemsPerPage ;

    private final List<I> collection;

    private final int size;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
        this.size = collection.size();
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return  size;
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        double a = size;
        double b = itemsPerPage;
        return (int) Math.ceil(a/b);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex >= pageCount())
            return -1;

        if (pageIndex == pageCount() - 1)
            return size % itemsPerPage;

        return itemsPerPage;

    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex >= size  || itemIndex < 0)
            return -1;
        return itemIndex/itemsPerPage;
    }

    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println(helper.pageIndex(5)); //should == 1 (zero based index)
        System.out.println(helper.pageIndex(2)); //should == 0
        System.out.println(helper.pageIndex(20)); //should == -1
        System.out.println(helper.pageIndex(-10)); //should == -1
    }

}
