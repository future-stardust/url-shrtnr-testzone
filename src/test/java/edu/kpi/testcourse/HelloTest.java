package edu.kpi.testcourse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloTest {

  @Test
  
  void simpleAlwaysGreenTest() {
    assertThat(1).isEqualTo(1);
  }

  @Test
  void newFailTest(){assertThat(2).isEqualTo(2);}
  //Random test comment
  
}
