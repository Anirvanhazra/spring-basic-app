package com.newyou.bydebby.basic.springbasicapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by anirv on 5/13/2018.
 */
public class QuickSortImpl implements SortAlgorithm{
    Logger logger = LoggerFactory.getLogger(QuickSortImpl.class);
    public int[] sortAlgorithm(int[] numbersToBeSorted){
        logger.info("Sorted using QuickSort");
        return numbersToBeSorted;
    }
}
