package com.lei.learn.tdd.Args;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;

public class CommandRound1 {

  private final HashMap<String, String> commandMap;

  public CommandRound1(String commandLine) {
    this.commandMap = initCommandMap(commandLine);
  }

  private HashMap<String, String> initCommandMap(String commandLine) {
    HashMap<String, String> result = new HashMap<>();

    String[] commands = commandLine.split("\\s+");
    ListIterator<String> iterator = Arrays.asList(commands).listIterator();
    while (iterator.hasNext()) {
      String name = iterator.next().substring(1);
      if (iterator.hasNext()) {
        String value = iterator.next();
        if (value.charAt(0) != '-') {
          result.put(name, value);
        } else {
          iterator.previous();
        }
      }
    }

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
