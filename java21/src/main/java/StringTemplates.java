import java.util.FormatProcessor;


// TODO - Preview Feature unfortunately :(
void main() {

  String name = "Jan";
  System.out.println(STR."Hello \{name}");

  int count = 0;
  System.out.println(STR."\{++count}");

  System.out.println(getJson("firstName", "lastName"));

  System.out.println(getBash());

  System.out.println(FMTTemplateProcessor());
}

public String getJson(String key, String value) {
  //language=json
  return STR."""
      {
        "\{key}": "\{value}",
        "lastName": "Walters",
        bad: json
      }
    """;
}

public String getBash() {
  //language=bash
  return """
        VERSION=123
        echo "${VERSION}"
      """;
}

public String FMTTemplateProcessor() {
  int first = -111;
  int second = 111;
  return FormatProcessor.FMT."""
      See Formatter class javadocs for format options.

      % d\{first}
      % d\{second}
      """;
}
