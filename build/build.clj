(ns build
  (:require [clojure.tools.build.api :as b]))

(def lib 'dev.nu/dpe)
(def version (format "0.0.%s" (b/git-count-revs nil)))
(def class-dir "target/classes/dev/nu")
(def basis (b/create-basis {:project "deps.edn"}))
(def jar-file (format "target/%s-%s.jar" (name lib) version))

(defn clean [_]
  (b/delete {:path "target"}))

(defn -main [_]
  (clean nil)
  (b/copy-dir {:src-dirs   ["src" "resources"]
               :target-dir class-dir})
  (b/compile-clj {:basis      basis
                  :src-dirs   ["src"]
                  :ns-compile ['dpe.logback-appender]
                  :class-dir  class-dir})
  (b/jar {:class-dir class-dir
          :jar-file  jar-file}))