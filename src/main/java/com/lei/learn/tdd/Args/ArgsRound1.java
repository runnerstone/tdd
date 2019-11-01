package com.lei.learn.tdd.Args;

public class ArgsRound1 {
  private final CommandRound1 command;
  private final SchemasRound1 schema;

  public ArgsRound1(SchemasRound1 schema, CommandRound1 command) {
    this.schema = schema;
    this.command = command;
  }

  public CommandRound1 getCommand() {

    return command;
  }

  public SchemasRound1 getSchema() {
    return schema;
  }
}
