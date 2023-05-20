package mianshi;

public class SortA implements Comparable<SortA> {
    int sortValue;

    public SortA(int sortValue) {
        this.sortValue = sortValue;
    }

    public int getSortValue() {
        return sortValue;
    }

    public void setSortValue(int sortValue) {
        this.sortValue = sortValue;
    }

    @Override
    public String toString() {
        return "SortA{" +
                "sortValue=" + sortValue +
                '}';
    }

    @Override
    public int compareTo(SortA o) {
        return this.sortValue - o.sortValue;
    }
}
