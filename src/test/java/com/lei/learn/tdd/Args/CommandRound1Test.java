package com.lei.learn.tdd.Args;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CommandRound1Test {

  @Test
  public void should_see_value_command() {

    CommandRound1 commandRound1 = new CommandRound1("-l -d /user/src -p 8080");
    assertThat(commandRound1.getValue("d"), is("/user/src"));
    assertThat(commandRound1.getValue("p"), is("8080"));
    assertNull(commandRound1.getValue("l"));
  }
}
