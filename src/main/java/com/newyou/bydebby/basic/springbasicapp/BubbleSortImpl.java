package com.newyou.bydebby.basic.springbasicapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by anirv on 5/13/2018.
 */
public class BubbleSortImpl implements SortAlgorithm{
    Logger logger = LoggerFactory.getLogger(BubbleSortImpl.class);
    public int[] sortAlgorithm(int[] numbersToBeSorted){
        logger.info("Sorted using BubbleSort");
        return numbersToBeSorted;
    }
}
