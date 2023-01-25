(ns hello
  ; (:import [mypackage MyClass])
  (:gen-class))

(set! *warn-on-reflection* false)

(defn myplus [a b]
  (+ a b))

; (defn -main [& _args]
;   (println "hello world from Clojure main")
;   (MyClass/main))
