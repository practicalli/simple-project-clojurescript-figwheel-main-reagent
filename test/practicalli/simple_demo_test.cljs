(ns practicalli.simple-demo-test
    (:require
     [cljs.test :refer-macros [deftest is testing]]
     [practicalli.simple-demo :refer [multiply]]))

(deftest multiply-test
  (is (= (* 1 2) (multiply 1 2))))

(deftest multiply-test-2
  (is (= (* 75 10) (multiply 10 75))))
