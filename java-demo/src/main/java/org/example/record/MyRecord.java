package org.example.record;

import java.util.List;

public record MyRecord(String name) implements Comparable<MyRecord> {

    //canonical constructor
    /*MyRecord(String name) {
        name = name.isBlank() ? "Tom" : name;
        this.name = name;
    }*/

    //compact constructor
    public MyRecord {
        name = name.isBlank() ? "Tom" : name;
    }

    static int getConstant() {
        return Double.valueOf("21").intValue();
    }


    public static void main(String[] args) {
        var listRecords
                = List.of(new MyRecord(""), new MyRecord("Eru"));

        listRecords.stream()
                .map(MyRecord::name)
                .forEach(System.out::println);

        System.out.println(MyRecord.getConstant());
    }

    @Override
    public int compareTo(MyRecord o) {
        return name.compareTo(o.name);
    }
}
