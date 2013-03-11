(defproject gulo "0.1.0-SNAPSHOT"
  :description "Big data processing on Hadoop for Map of Life."
  :repositories {"conjars" "http://conjars.org/repo/"
                 "gbif" "http://repository.gbif.org/content/groups/gbif/"
                 "maven2" "http://repo2.maven.org/maven2"}
  :source-paths ["src/clj"]
  :resources-path "resources"
  :dev-resources-path "dev"
  :jvm-opts ["-XX:MaxPermSize=256M"
             "-XX:+UseConcMarkSweepGC"
             "-Xms5024M" "-Xmx5048M" "-server"]
  :plugins [[lein-swank "1.4.4"]
            [lein-emr "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]
                                  [midje-cascalog "0.4.0"]]}
             :plugins [[lein-midje "2.0.0-SNAPSHOT"]]}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [cascalog "1.10.0"]                                                         ;
                 [cascalog-more-taps "0.3.1-SNAPSHOT"]]
  :min-lein-version "2.0.0"
  :aot [teratorn.common teratorn.gbif teratorn.ebird])