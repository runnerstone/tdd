package com.lei.learn.tdd.Args;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SchemaRound1Test {
  @Test
  public void should_get_boolean() {
    SchemasRound1 schemas = new SchemasRound1("l:boolean");
    assertThat(schemas.getSchemaValue("l").toString(), is("boolean"));
  }

  @Test
  public void should_get_string() {
    SchemasRound1 schemas = new SchemasRound1("l:boolean,d:string,p:int");
    assertThat(schemas.getSchemaValue("d").toString(), is("string"));
  }

  @Test
  public void should_get_int() {
    SchemasRound1 schemas = new SchemasRound1("l:boolean,d:string,p:int");
    assertThat(schemas.getSchemaValue("p").toString(), is("int"));
  }
}
