package com.lei.learn.tdd.Args;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ArgsRound1Test {

  @Test
  public void should_get_schema() {
    ArgsRound1 argsRound1 = getArgsRound1();
    assertThat(argsRound1.getSchema().toString(),
        is(new SchemasRound1("l:boolean,d:string,p:int").toString()));
  }

  @Test
  public void should_see_command() {
    ArgsRound1 argsRound1 = getArgsRound1();
    assertThat(argsRound1.getCommand().toString(),
        is(new CommandRound1("-l -d /user/src -p 8080").toString()));
  }

  @Test
  public void should_see_value() {

    ArgsRound1 argsRound1 = getArgsRound1();
    assertThat(argsRound1.getValue("l"), is(new Boolean(true)));
  }

  private ArgsRound1 getArgsRound1() {
    return new ArgsRound1(new SchemasRound1("l:boolean,d:string,p:int"),
        new CommandRound1("-l -d /user/src -p 8080"));
  }
}
