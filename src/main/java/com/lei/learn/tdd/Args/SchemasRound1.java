package com.lei.learn.tdd.Args;

import java.util.Arrays;
import java.util.HashMap;

public class SchemasRound1 {
  private final HashMap<String, String> schemaMap;

  public SchemasRound1(String schemaConfig) {
    this.schemaMap = initSchemaMap(schemaConfig);
  }

  public Object getSchemaValue(String type, String strValue) {

    switch (type) {
      case "bool":
        return "true".equalsIgnoreCase(String.valueOf(Boolean.TRUE));
      default:
        return strValue;
    }
  }

  private HashMap<String, String> initSchemaMap(String schemaConfig) {
    HashMap<String, String> result = new HashMap<>();
    String[] strings = schemaConfig.split(",");
    Arrays.asList(strings).stream().forEach(str -> {
      String[] typeValue = str.split(":");
      result.put(typeValue[0], typeValue[1]);
    });

    return result;
  }
}
