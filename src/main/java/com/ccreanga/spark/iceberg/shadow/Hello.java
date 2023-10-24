package com.ccreanga.spark.iceberg.shadow;

import org.apache.spark.sql.*;

public class Hello {

    public static void main(String[] args) {
        SparkSession sparkSession = SparkSession.builder()
                .appName("Hello")
                .getOrCreate();

        System.out.println("Hello from driver");

    }

}
