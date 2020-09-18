package com.example.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class GroupTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Map<String, List<SalesTxn>> tMap;
        
        // Print out transactions grouped by Buyer
        System.out.println("=== Transactions Grouped by Buyer ===");
        tMap = tList.parallelStream()
        		.collect(Collectors.groupingBy(SalesTxn::getBuyerName));
        for (Map.Entry<String, List<SalesTxn>> entry : tMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for(SalesTxn p1:entry.getValue() )	
            		p1.printSummary();
        }
    }
}
