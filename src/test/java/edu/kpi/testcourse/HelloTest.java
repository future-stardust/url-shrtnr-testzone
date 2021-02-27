package edu.kpi.testcourse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloTest {

  @Test
  void compare(int a, int b){
  if (a > b){
    System.out.println(a);
  } else if (a < b){
    System.out.println(b);
  }
  }


}
