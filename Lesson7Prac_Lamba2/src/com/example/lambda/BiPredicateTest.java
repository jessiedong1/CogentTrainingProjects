package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author oracle
 */
public class BiPredicateTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    String searchState = "KS";
    
    BiPredicate<Employee, String> eBiPred = (e,s)->e.getState().equals(s); // Wrtie your BiPredicate here
//    eList.parallelStream().filter(eBiPred).forEach((e,s)->e.printSummary);
    System.out.println("=== Print matching list");
    for(Employee e:eList){
      if (eBiPred.test(e, searchState)){// Use BiPredicate for test
        e.printSummary();
      }
    }
  }
}
