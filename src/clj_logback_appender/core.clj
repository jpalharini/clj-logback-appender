(ns clj-logback-appender.core
                    ; "Java-friendly" name
  (:gen-class :name jpalharini.ClojureLogbackAppender
                       ; Class
              :extends ch.qos.logback.core.AppenderBase
                          ; Interface/s
              :implements [ch.qos.logback.classic.spi.ILoggingEvent]))

; Following the convention for overridden methods: prefix the name with '-'
(defn -append
  "Override of AppenderBase/append which is called from AppenderBase/doAppend."
  [this event]
  (println "Hello! I'm the logger" (.getName this)
           "and I have received this event" event))