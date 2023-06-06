# clj-logback-appender
This is a very basic implementation of a Logback appender in Clojure relying on the `:gen-class` utility to generate Java-like classes.

## Integrating it to an application
You can add your own version of this appender to any application using [logback](https://logback.qos.ch/). One way to do it is by building a JAR file using this command.

```
clj -X:build
```

The `build` configuration can be found inside the `build/build.clj` file, where you can define your own package name and version. Right now it's setup to use a nifty tool provided by [tools.build](https://clojure.org/guides/tools_build) that sets a version number based on the number of commits in the repository.

## Contributing
This is intended to be an example code. Feel free to fork it and implement your own version of it.

If you'd like to suggest improvements to the actual example, please [open an issue](https://github.com/jpalharini/clj-logback-appender/issues/new).
