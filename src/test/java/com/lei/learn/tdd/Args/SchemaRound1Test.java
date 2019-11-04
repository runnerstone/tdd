package com.lei.learn.tdd.Args;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SchemaRound1Test {
  @Test
  public void should_get_boolean() {
    SchemasRound1 schemas = new SchemasRound1("l:boolean");
    assertThat(schemas.getSchemaValue("l", "true"), is(Boolean.TRUE));
  }

  @Test
  public void should_get_string() {
    SchemasRound1 schemas = new SchemasRound1("l:boolean,d:string,p:int");
    assertThat(schemas.getSchemaValue("d", "string"), is(new String("string")));
  }

  @Test
  public void should_get_int() {
    SchemasRound1 schemas = new SchemasRound1("l:boolean,d:string,p:int");
    assertThat(schemas.getSchemaValue("p", "1"), is(new Integer(1)));
  }
}
