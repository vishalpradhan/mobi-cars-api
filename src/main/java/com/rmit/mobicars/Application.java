package com.rmit.mobicars;

//public class Main {
//    public static void main(String[] args) {
//        get("/hello", (req, res) -> "Hello World");
//    }
//}
import static spark.Spark.get;

import spark.servlet.SparkApplication;

public class Application implements SparkApplication {
    @Override
    public void init() {
        get("/hello", (request, response) -> "Hello World");

        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });
    }
}