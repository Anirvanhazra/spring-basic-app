package com.newyou.bydebby.basic.springbasicapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by anirv on 5/13/2018.
 */
public class BinarySearchImpl {

    private int numberToBeSearched;
    private SortAlgorithm sortAlgorithm;
    Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }
    public int binarySearch(int numberToSearch, int[] numberRange){

        this.numberToBeSearched = numberToSearch;
        int indexValue = 0;
        numberRange = sortAlgorithm.sortAlgorithm(numberRange);

        for (int i:numberRange) {
            indexValue=indexValue+1;
            //logger.info("IndexValue:{}",indexValue);
            if (i==numberToBeSearched)
                break;

        }
        return indexValue;
    }
}
