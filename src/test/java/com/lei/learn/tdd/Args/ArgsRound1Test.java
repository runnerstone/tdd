package com.lei.learn.tdd.Args;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ArgsRound1Test {
  @Test
  public void should_see_schema() {
    Schemas schemas = new Schemas("l:bool");
    assertThat(schemas.getSchemaConfig(),is("l:bool"));
  }
}
