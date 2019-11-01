package com.lei.learn.tdd.Args;

import java.util.Arrays;
import java.util.HashMap;

public class CommandRound1 {

  private final HashMap<String, String> commandMap;

  public CommandRound1(String commandLine) {
    this.commandMap = initCommandMap(commandLine);
  }

  private HashMap<String, String> initCommandMap(String commandLine) {
    HashMap<String, String> result = new HashMap<>();

    String[] commands = commandLine.split("-");
    Arrays.asList(commands).stream().forEach(str -> {
      String[] typeValue = str.split("^\\s+");
      if (typeValue.length == 0 && typeValue[0] != "") {
        result.put(typeValue[0], "True");
      } else if (typeValue.length == 1) {
        result.put(typeValue[0], typeValue[1]);
      }
    });
    return result;
  }

  public Object getValue(String typeKey) {

    return commandMap.get(typeKey);
  }

  @Override
  public String toString() {
    return commandMap.toString();
  }
}
